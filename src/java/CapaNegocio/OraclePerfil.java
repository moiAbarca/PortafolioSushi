/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conecta;
import CapaDTO.Perfil;
import Clasesinterface.PerfilDao;
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
public class OraclePerfil implements PerfilDao{
     public Conecta db;    
    public OraclePerfil()
    {
        //constructor 
        db = new Conecta();
    }

    @Override
    public List<Perfil> obtenerPerfil() throws SQLException {
        List<Perfil> cPerfil = new ArrayList<Perfil>();         
        Perfil bPerfil = new Perfil();
        String sql = null;
        Connection con = null;          
        CallableStatement cs = null;        
        ResultSet rs;
        try
        {            
            con = db.getConnection();         
            sql = "{call FUKUSUKESUSHI.LISTAR_PERFIL(?)}";            
            cs = con.prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();            
            rs = (ResultSet)cs.getObject(1);            
            while(rs.next())
            {
                bPerfil = new Perfil();
                bPerfil.setPerfilId(rs.getInt(1));
                bPerfil.setNombrePerfil(rs.getString(2));
                
                cPerfil.add(bPerfil);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return cPerfil;
    }

    @Override
    public void agregarPerfil(Perfil perfil) throws SQLException {
        Perfil bPerfil = new Perfil();
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al insertar de la BD que tiene 3 parámetros de entrada 
            sql = "{call FUKUSUKESUSHI.PERFIL_tapi.ins(?, ?)}";
            cs = con.prepareCall(sql);
            //le seteo los 3 parámetros de entrada
            cs.setInt(1, perfil.getPerfilId());
            cs.setString(2, perfil.getNombrePerfil());
            
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
    public void modificarPerfil(Perfil perfil) throws SQLException {
        Perfil bPerfil = new Perfil();
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al update de la BD que tiene 3 parámetros de entrada 
            sql = "{call FUKUSUKESUSHI.PERFIL_tapi.upd(?, ?)}";
            cs = con.prepareCall(sql);
            cs.setInt(1, perfil.getPerfilId());
            cs.setString(2, perfil.getNombrePerfil());
            
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
    public void eliminarPerfil(Integer id) throws SQLException {
        String sql = null;
        Connection con = null;
        CallableStatement cs = null;         
        try
        {            
            con = db.getConnection();
            //llama al eliminar que recibe 1 parámetro
            sql = "{call FUKUSUKESUSHI.PERFIL_tapi.del(?)}";
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
    public Perfil buscarPerfil(Integer id) throws SQLException {
             
        Perfil bPerfil = new Perfil();
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
            sql = ("{call FUKUSUKESUSHI.BUSCAR_PERFIL(?,?)}");            
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
                bPerfil = new Perfil();
                bPerfil.setPerfilId(rs.getInt(1));
                bPerfil.setNombrePerfil(rs.getString(2));
                
                
            }
            rs.close();
            
            cs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return bPerfil;
    }
}
