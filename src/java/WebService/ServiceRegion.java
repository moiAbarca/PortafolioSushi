/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import CapaDTO.Region;
import CapaNegocio.OracleRegion;
import Clasesinterface.RegionDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moi
 */
@WebService(serviceName = "ServiceRegion")
public class ServiceRegion {

    List<Region> Region;
    
    //comienzo de los webServices    
    @WebMethod(operationName = "obtenerRegion")        
    public List<Region> obtenerRegion()  
    {
        try{        
        RegionDao dao = new OracleRegion();      
        Region = dao.obtenerRegion();        
        }
        catch(Exception ex)
        {}
        return Region;
    }
    
    @WebMethod(operationName = "agregarRegion")        
    public void agregarRegion(@WebParam(name = "region") Region region)  
    {
        try{
        RegionDao dao = new OracleRegion();
        dao.agregarRegion(region);
        }
        catch(Exception ex)
        {}
    }
    

    
    @WebMethod(operationName = "modificarRegion")        
    public void modificarRegion(@WebParam(name = "region") Region region)  
    {
        try{
        RegionDao dao = new OracleRegion();
        dao.modificarRegion(region);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "eliminarRegion")        
    public void eliminarRegion(@WebParam(name = "id") Integer id)  
    {
        try{
        RegionDao dao = new OracleRegion();
        dao.eliminarRegion(id);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "buscarRegion")        
    public Region buscarRegion(@WebParam(name = "id") Integer id)  
    {
        Region reg = new Region();
        try{
        RegionDao dao = new OracleRegion();
        reg = dao.buscarRegion(id);
        }
        catch(Exception ex)
        {}
        return reg;
    }
}
