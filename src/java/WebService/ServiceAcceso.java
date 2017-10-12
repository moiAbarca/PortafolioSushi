/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import CapaDTO.Acceso;
import CapaNegocio.OracleAcceso;
import Clasesinterface.AccesoDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moi
 */
@WebService(serviceName = "ServiceAcceso")
public class ServiceAcceso {
    //lista de tipo Acceso
    List<Acceso> acceso;
    
    //comienzo de los webServices    
    @WebMethod(operationName = "obtenerAcceso")        
    public List<Acceso> obtenerAcceso()  
    {
        try{        
        AccesoDao dao = new OracleAcceso();      
        acceso = dao.obtenerAcceso();        
        }
        catch(Exception ex)
        {}
        return acceso;
    }
    
    @WebMethod(operationName = "agregaAcceso")        
    public void agregaAcceso(@WebParam(name = "acceso") Acceso acceso)  
    {
        try{
        AccesoDao dao = new OracleAcceso();
        dao.agregarAcceso(acceso);
        }
        catch(Exception ex)
        {}
    }
    

    
    @WebMethod(operationName = "modificarAcceso")        
    public void modificarAcceso(@WebParam(name = "acceso") Acceso acceso)  
    {
        try{
        AccesoDao dao = new OracleAcceso();
        dao.modificarAcceso(acceso);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "eliminarAcceso")        
    public void eliminarAcceso(@WebParam(name = "id") Integer id)  
    {
        try{
        AccesoDao dao = new OracleAcceso();
        dao.eliminarAcceso(id);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "buscarAcceso")        
    public List<Acceso> buscarAcceso(@WebParam(name = "id") Integer id)  
    {
        try{
        AccesoDao dao = new OracleAcceso();
        acceso = dao.buscarAcceso(id);
        }
        catch(Exception ex)
        {}
        return acceso;
    }
}
