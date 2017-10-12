/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import CapaDTO.Pagina;
import CapaNegocio.OraclePagina;
import Clasesinterface.PaginaDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moi
 */
@WebService(serviceName = "ServicePagina")
public class ServicePagina {

    List<Pagina> Pagina;
    
    //comienzo de los webServices    
    @WebMethod(operationName = "obtenerPagina")        
    public List<Pagina> obtenerPagina()  
    {
        try{        
        PaginaDao dao = new OraclePagina();      
        Pagina = dao.obtenerPagina();        
        }
        catch(Exception ex)
        {}
        return Pagina;
    }
    
    @WebMethod(operationName = "agregarPagina")        
    public void agregarPagina(@WebParam(name = "pagina") Pagina pagina)  
    {
        try{
        PaginaDao dao = new OraclePagina();      
        dao.agregarPagina(pagina);
        }
        catch(Exception ex)
        {}
    }
    

    
    @WebMethod(operationName = "modificarPagina")        
    public void modificarPagina(@WebParam(name = "pagina") Pagina pagina)  
    {
        try{
        PaginaDao dao = new OraclePagina();      
        dao.modificarPagina(pagina);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "eliminarPagina")        
    public void eliminarPagina(@WebParam(name = "id") Integer id)  
    {
        try{
        PaginaDao dao = new OraclePagina();      
        dao.eliminarPagina(id);
        }
        catch(Exception ex)
        {}
    }
    
    @WebMethod(operationName = "buscarPagina")        
    public List<Pagina> buscarPagina(@WebParam(name = "id") Integer id)  
    {
        try{
        PaginaDao dao = new OraclePagina();      
        Pagina = dao.buscarPagina(id);
        }
        catch(Exception ex)
        {}
        return Pagina;
    }
}
