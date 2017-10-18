/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import CapaDTO.Canal;
import CapaNegocio.OracleCanal;
import Clasesinterface.CanalDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moi
 */
@WebService(serviceName = "ServiceCanal")
public class ServiceCanal {

    List<Canal> canal;
    //comienzo de los webServices
    
    @WebMethod(operationName = "obtenerCanal")        
    public List<Canal> obtenerCanal()  
    {
        try{        
        CanalDao dao = new OracleCanal();      
        canal = dao.obtenerCanal();        
        }
        catch(Exception ex)
        {}
        return canal;
    }
    
    @WebMethod(operationName = "agregarCanal")        
    public void agregarCanal(@WebParam(name = "canal") Canal canal)  
    {
        try{
        CanalDao dao = new OracleCanal();      
        dao.agregarCanal(canal);
        }
        catch(Exception ex)
        {}
    }
    

    
    @WebMethod(operationName = "modificarCanal")        
    public void modificarCanal(@WebParam(name = "canal") Canal canal)  
    {
        try{
        CanalDao dao = new OracleCanal();      
        dao.modificarCanal(canal);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "eliminarCanal")        
    public void eliminarCanal(@WebParam(name = "id") Integer id)  
    {
        try{
        CanalDao dao = new OracleCanal();      
        dao.eliminarCanal(id);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "buscarCanal")        
    public Canal buscarCanal(@WebParam(name = "id") Integer id)  
    {
        Canal can = new Canal();
        try{
        CanalDao dao = new OracleCanal();      
        can = dao.buscarCanal(id);
        }
        catch(Exception ex)
        {}
        return can;
    }
}
