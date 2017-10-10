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

ProductoDao dao = new OracleProducto();
Producto producto = new Producto();    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "agregaProducto")        
    public void agregaProducto(
                                @WebParam(name = "imagenProducto") String imagenProducto,
                                @WebParam(name = "nombreProducto") String nombreProducto,
                                @WebParam(name = "descripcionProducto") String descripcionProducto,
                                @WebParam(name = "categoriaProducto") int categoriaProducto,
                                @WebParam(name = "disponibilidaProducto") boolean disponibilidaProducto,
                                @WebParam(name = "porcionesProdcuto") int porcionesProdcuto,
                                @WebParam(name = "precioProducto") int precioProducto,
                                @WebParam(name = "productoId") int productoId
                               ) throws SQLException {
        producto.setImagenProdcuto(imagenProducto);
        producto.setNombreProducto(nombreProducto);
        producto.setDescripcionProducto(descripcionProducto);
        producto.setCategoriaProductoId(categoriaProducto);
        producto.setDisponibilidadProducto(disponibilidaProducto);
        producto.setPorcionesProdcuto(porcionesProdcuto);
        producto.setPrecioProducto(precioProducto);
        producto.setProductoId(productoId);
        dao.agregarProducto(producto);
    }
}
