/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conecta;
import CapaDTO.Pagina;
import Clasesinterface.PaginaDao;
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
public class OraclePagina implements PaginaDao{
    public Conecta db;    
    public OraclePagina()
    {
        //constructor vacío
        db = new Conecta();
    }

    @Override
    public List<Pagina> obtenerPagina() throws SQLException {
        //Crea una lista de tipo Acceso
        List<Pagina> cPagina = new ArrayList<Pagina>();  
        //instancia la clase acceso
        Pagina bPagina = new Pagina();
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
            sql = "{call FUKUSUKESUSHI.LISTAR_PAGINA(?)}";
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
                bPagina = new Pagina();
                bPagina.setPaginaId(rs.getInt(1));
                bPagina.setPagina(rs.getString(2));
                bPagina.setUrlPagina(rs.getString(3));
                cPagina.add(bPagina);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return cPagina;
    }

    @Override
    public void agregarPagina(Pagina pagina) throws SQLException {
        Pagina bPagina = new Pagina();
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al insertar de la BD que tiene 3 parámetros de entrada 
            sql = "{call FUKUSUKESUSHI.PAGINA_tapi.ins(?, ?, ?)}";
            cs = con.prepareCall(sql);
            //le seteo los 3 parámetros de entrada
            cs.setInt(1, pagina.getPaginaId());
            cs.setString(2, pagina.getUrlPagina());
            cs.setString(3, pagina.getPagina());
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
    public void modificarPagina(Pagina pagina) throws SQLException {
        Pagina bPagina = new Pagina();
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al update de la BD que tiene 3 parámetros de entrada 
            sql = "{call FUKUSUKESUSHI.PAGINA_tapi.upd(?, ?, ?)}";
            cs = con.prepareCall(sql);
            cs.setInt(1, pagina.getPaginaId());
            cs.setString(2, pagina.getUrlPagina());
            cs.setString(3, pagina.getPagina());
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
    public void eliminarPagina(Integer id) throws SQLException {
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al eliminar que recibe 1 parámetro
            sql = "{call FUKUSUKESUSHI.PAGINA_tapi.del(?)}";
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
    public List<Pagina> buscarPagina(Integer id) throws SQLException {
        List<Pagina> cPagina = new ArrayList<Pagina>();        
        Pagina bPagina = new Pagina();
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
            sql = ("{call FUKUSUKESUSHI.BUSCAR_PAGINA(?,?)}");            
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
                bPagina = new Pagina();
                bPagina.setPaginaId(rs.getInt(1));
                bPagina.setPagina(rs.getString(2));
                bPagina.setUrlPagina(rs.getString(3));
                cPagina.add(bPagina);
            }
            rs.close();
            
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return cPagina;
    }
}
