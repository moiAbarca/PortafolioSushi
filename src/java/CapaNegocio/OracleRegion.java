/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conecta;
import CapaDTO.Region;
import Clasesinterface.RegionDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author moi
 */
public class OracleRegion implements RegionDao{
    public Conecta db;    
    public OracleRegion()
    {
        //constructor 
        db = new Conecta();
    }

    @Override
    public List<Region> obtenerRegion() throws SQLException {
        List<Region> cRegion = new ArrayList<Region>();  
        //instancia la clase acceso
        Region bRegion = new Region();
        String sql = null;
        Connection con = null;  
        //CallableStatement = me permite ejecutar sentencias SQL
        CallableStatement cs = null;
        //ResultSet = proporciona varios métodos para obtener los datos de columna correspondientes a un fila
        ResultSet rs;
        try
        {
            //se conecta a la BD
            con = db.getConnection();
            //el SP tiene solo un parámetro de salida
            //por eso solo tiene un ?
            sql = "{call FUKUSUKESUSHI.LISTAR_REGION(?)}";
            //le paso al CallableStatement la sentencia SQL
            cs = con.prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            //creo un resultset con todos los datos de la tabla Acceso
            rs = (ResultSet)cs.getObject(1);
            //el resulset por defecto comienza en un índice antes que mi resultado
            //por lo que debo ponerlo en NEXT para que me devuelva desde el primer valor en adelante
            //cuando se que v aa devolver varios valores ocupo while
            //cuando se que va a devolver uno, ocupo un IF
            while(rs.next())
            {
                bRegion = new Region();
                bRegion.setRegionId(rs.getInt(1));
                bRegion.setRegionNombre(rs.getString(2));                
                cRegion.add(bRegion);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return cRegion;
    }

    @Override
    public void agregarRegion(Region region) throws SQLException {
        Region bRegion = new Region();
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al insertar de la BD que tiene 3 parámetros de entrada 
            sql = "{call FUKUSUKESUSHI.REGION_tapi.ins( ?)}";
            cs = con.prepareCall(sql);
            //le seteo los 3 parámetros de entrada
            //cs.setInt(1, region.getRegionId());
            cs.setString(1, region.getRegionNombre());            
            cs.execute();          
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("No se pudo agregar: " + e);
        }
    }

    @Override
    public void modificarRegion(Region region) throws SQLException {
        Region bRegion = new Region();
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al update de la BD que tiene 3 parámetros de entrada 
            sql = "{call FUKUSUKESUSHI.REGION_tapi.upd(?, ?)}";
            cs = con.prepareCall(sql);
            cs.setInt(1, region.getRegionId());
            cs.setString(2, region.getRegionNombre());            
            cs.execute();          
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("No se pudo agregar: " + e);
        }
    }

    @Override
    public void eliminarRegion(Integer id) throws SQLException {
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al eliminar que recibe 1 parámetro
            sql = "{call FUKUSUKESUSHI.REGION_tapi.del(?)}";
            cs = con.prepareCall(sql);
            //entrego el parámetro de entrada de la función 
            //y si existe en la BD lo borro
            cs.setInt(1, id);
            cs.execute();          
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Region buscarRegion(Integer id) throws SQLException {
        
        Region bRegion = new Region();
        String sql = null;
        Connection con = null;        
        CallableStatement cs = null;
        ResultSet rs;
        try
        {
            con = db.getConnection();   
            //llama a la función de tiene dos parámetros
            //el primero de entrada
            //y el segundo de salida
            sql = ("{call FUKUSUKESUSHI.BUSCAR_REGION(?,?)}");            
            cs = con.prepareCall(sql);
            //seteo el primer parámetro
            cs.setInt(1, id); 
            //defino el tipo de dato que debe devolver
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            
            //creo un resultset con todos los datos de la tabla Acceso
            //devuelve el objeto OUT que se encuentra en el 2 parámetro
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                bRegion = new Region();
                bRegion.setRegionId(rs.getInt(1));
                bRegion.setRegionNombre(rs.getString(2));                
                
            }
            rs.close();
            
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return bRegion;
    }
}
