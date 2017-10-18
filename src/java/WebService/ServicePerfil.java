/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import CapaDTO.Perfil;
import CapaNegocio.OraclePerfil;
import Clasesinterface.PerfilDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moi
 */
@WebService(serviceName = "ServicePerfil")
public class ServicePerfil {

    List<Perfil> Perfil;
    
    //comienzo de los webServices    
    @WebMethod(operationName = "obtenerPerfil")        
    public List<Perfil> obtenerPerfil()  
    {
        try{        
        PerfilDao dao = new OraclePerfil();      
        Perfil = dao.obtenerPerfil();        
        }
        catch(Exception ex)
        {}
        return Perfil;
    }
    
    @WebMethod(operationName = "agregarPerfil")        
    public void agregarPerfil(@WebParam(name = "perfil") Perfil perfil)  
    {
        try{
        PerfilDao dao = new OraclePerfil();      
        dao.agregarPerfil(perfil);
        }
        catch(Exception ex)
        {}
    }
    

    
    @WebMethod(operationName = "modificarPerfil")        
    public void modificarPerfil(@WebParam(name = "perfil") Perfil perfil)  
    {
        try{
        PerfilDao dao = new OraclePerfil();      
        dao.modificarPerfil(perfil);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "eliminarPerfil")        
    public void eliminarPerfil(@WebParam(name = "id") Integer id)  
    {
        try{
        PerfilDao dao = new OraclePerfil();      
        dao.eliminarPerfil(id);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "buscarPerfil")        
    public Perfil buscarPerfil(@WebParam(name = "id") Integer id)  
    {
        Perfil per = new Perfil();
        try{
        PerfilDao dao = new OraclePerfil();      
        per = dao.buscarPerfil(id);
        }
        catch(Exception ex)
        {}
        return per;
    }
}
