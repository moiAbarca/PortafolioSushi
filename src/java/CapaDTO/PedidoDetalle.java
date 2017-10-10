/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDTO;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author moi
 */
public class PedidoDetalle {
    private int pedidoDetalleId;
    private PedidoCabecera pedidoCabeceraId;
    private Producto productoId;
    private int cantidad;
    private Date fechaPedidoDetalle;
    private Time horaPedidoDetalle;

    /**
     * @return the pedidoDetalleId
     */
    public int getPedidoDetalleId() {
        return pedidoDetalleId;
    }

    /**
     * @param pedidoDetalleId the pedidoDetalleId to set
     */
    public void setPedidoDetalleId(int pedidoDetalleId) {
        this.pedidoDetalleId = pedidoDetalleId;
    }

    /**
     * @return the pedidoCabeceraId
     */
    public PedidoCabecera getPedidoCabeceraId() {
        return pedidoCabeceraId;
    }

    /**
     * @param pedidoCabeceraId the pedidoCabeceraId to set
     */
    public void setPedidoCabeceraId(PedidoCabecera pedidoCabeceraId) {
        this.pedidoCabeceraId = pedidoCabeceraId;
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

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the fechaPedidoDetalle
     */
    public Date getFechaPedidoDetalle() {
        return fechaPedidoDetalle;
    }

    /**
     * @param fechaPedidoDetalle the fechaPedidoDetalle to set
     */
    public void setFechaPedidoDetalle(Date fechaPedidoDetalle) {
        this.fechaPedidoDetalle = fechaPedidoDetalle;
    }

    /**
     * @return the horaPedidoDetalle
     */
    public Time getHoraPedidoDetalle() {
        return horaPedidoDetalle;
    }

    /**
     * @param horaPedidoDetalle the horaPedidoDetalle to set
     */
    public void setHoraPedidoDetalle(Time horaPedidoDetalle) {
        this.horaPedidoDetalle = horaPedidoDetalle;
    }
}
