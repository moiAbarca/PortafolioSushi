/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import CapaDTO.Comuna;
import CapaNegocio.OracleComuna;
import Clasesinterface.ComunaDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moi
 */
@WebService(serviceName = "ServiceComuna")
public class ServiceComuna {

    List<Comuna> Comuna;
    //comienzo de los webServices
    
    @WebMethod(operationName = "obtenerComuna")        
    public List<Comuna> obtenerComuna()  
    {
        try{        
        ComunaDao dao = new OracleComuna();      
        Comuna = dao.obtenerComuna();        
        }
        catch(Exception ex)
        {}
        return Comuna;
    }
    
    @WebMethod(operationName = "agregarComuna")        
    public void agregarComuna(@WebParam(name = "comuna") Comuna comuna)  
    {
        try{
        ComunaDao dao = new OracleComuna();      
        dao.agregarComuna(comuna);
        }
        catch(Exception ex)
        {}
    }
    

    
    @WebMethod(operationName = "modificarComuna")        
    public void modificarComuna(@WebParam(name = "comuna") Comuna comuna)  
    {
        try{
        ComunaDao dao = new OracleComuna();      
        dao.modificarComuna(comuna);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "eliminarComuna")        
    public void eliminarComuna(@WebParam(name = "id") Integer id)  
    {
        try{
        ComunaDao dao = new OracleComuna();      
        dao.eliminarComuna(id);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "buscarComuna")        
    public List<Comuna> buscarComuna(@WebParam(name = "id") Integer id)  
    {
        try{
        ComunaDao dao = new OracleComuna();      
        Comuna = dao.buscarComuna(id);
        }
        catch(Exception ex)
        {}
        return Comuna;
    }
}
