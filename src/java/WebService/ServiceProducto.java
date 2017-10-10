/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import CapaDTO.Producto;
import CapaNegocio.OracleProducto;
import Clasesinterface.ProductoDao;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moi
 */
@WebService(serviceName = "ServiceProducto")
public class ServiceProducto {



    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "agregaProducto")        
    public void agregaProducto(
                                @WebParam(name = "producto") Producto producto                             
                               )  
    {
        try{
        ProductoDao dao = new OracleProducto();
        dao.agregarProducto(producto);
        }
        catch(Exception ex)
        {}
    }
}
