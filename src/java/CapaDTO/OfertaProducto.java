/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDTO;

/**
 *
 * @author moi
 */
public class OfertaProducto {

   
    private int ofertaId;
    private int productoId;
    private int ofertas_producto_id;
            

    /**
     * @return the ofertaId
     */
    public int getOfertaId() {
        return ofertaId;
    }

    /**
     * @param ofertaId the ofertaId to set
     */
    public void setOfertaId(int ofertaId) {
        this.ofertaId = ofertaId;
    }

    /**
     * @return the productoId
     */
    public int getProductoId() {
        return productoId;
    }

    /**
     * @param productoId the productoId to set
     */
    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }
    
     /**
     * @return the ofertas_producto_id
     */
    public int getOfertas_producto_id() {
        return ofertas_producto_id;
    }

    /**
     * @param ofertas_producto_id the ofertas_producto_id to set
     */
    public void setOfertas_producto_id(int ofertas_producto_id) {
        this.ofertas_producto_id = ofertas_producto_id;
    }
}
