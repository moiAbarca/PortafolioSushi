/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import CapaDTO.Provincia;
import CapaNegocio.OracleProvincia;
import Clasesinterface.ProvinciaDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moi
 */
@WebService(serviceName = "ServiceProvincia")
public class ServiceProvincia {

    List<Provincia> Provincia;
    
    //comienzo de los webServices    
    @WebMethod(operationName = "obtenerProvincia")        
    public List<Provincia> obtenerProvincia()  
    {
        try{        
        ProvinciaDao dao = new OracleProvincia();      
        Provincia = dao.obtenerProvincia();        
        }
        catch(Exception ex)
        {}
        return Provincia;
    }
    
    @WebMethod(operationName = "agregarProvincia")        
    public void agregarProvincia(@WebParam(name = "provincia") Provincia provincia)  
    {
        try{
        ProvinciaDao dao = new OracleProvincia();
        dao.agregarProvincia(provincia);
        }
        catch(Exception ex)
        {}
    }
    

    
    @WebMethod(operationName = "modificarProvincia")        
    public void modificarProvincia(@WebParam(name = "provincia") Provincia provincia)  
    {
        try{
        ProvinciaDao dao = new OracleProvincia();
        dao.modificarProvincia(provincia);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "eliminarProvincia")        
    public void eliminarProvincia(@WebParam(name = "id") Integer id)  
    {
        try{
        ProvinciaDao dao = new OracleProvincia();
        dao.eliminarProvincia(id);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "buscarProvincia")        
    public Provincia buscarProvincia(@WebParam(name = "id") Integer id)  
    {
        Provincia prov = new Provincia();
        try{
        ProvinciaDao dao = new OracleProvincia();
        prov = dao.buscarProvincia(id);
        }
        catch(Exception ex)
        {}
        return prov;
    }
}
