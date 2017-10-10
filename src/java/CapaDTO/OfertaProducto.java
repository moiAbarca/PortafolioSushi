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
    private Oferta ofertaId;
    private Producto productoId;

    /**
     * @return the ofertaId
     */
    public Oferta getOfertaId() {
        return ofertaId;
    }

    /**
     * @param ofertaId the ofertaId to set
     */
    public void setOfertaId(Oferta ofertaId) {
        this.ofertaId = ofertaId;
    }

    /**
     * @return the productoId
     */
    public Producto getProductoId() {
        return productoId;
    }

    /**
     * @param productoId the productoId to set
     */
    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }
}
