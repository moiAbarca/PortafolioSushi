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
public class PedidoCabecera {
    private int pedidoCabeceraId;
    private Establecimiento establecimientoId;
    private Canal canalId;
    private Cliente clienteId;
    private Date fechaPedido;
    private Time horaPedido;
    private String estadoPedido;

    /**
     * @return the pedidoCabeceraId
     */
    public int getPedidoCabeceraId() {
        return pedidoCabeceraId;
    }

    /**
     * @param pedidoCabeceraId the pedidoCabeceraId to set
     */
    public void setPedidoCabeceraId(int pedidoCabeceraId) {
        this.pedidoCabeceraId = pedidoCabeceraId;
    }

    /**
     * @return the establecimientoId
     */
    public Establecimiento getEstablecimientoId() {
        return establecimientoId;
    }

    /**
     * @param establecimientoId the establecimientoId to set
     */
    public void setEstablecimientoId(Establecimiento establecimientoId) {
        this.establecimientoId = establecimientoId;
    }

    /**
     * @return the canalId
     */
    public Canal getCanalId() {
        return canalId;
    }

    /**
     * @param canalId the canalId to set
     */
    public void setCanalId(Canal canalId) {
        this.canalId = canalId;
    }

    /**
     * @return the clienteId
     */
    public Cliente getClienteId() {
        return clienteId;
    }

    /**
     * @param clienteId the clienteId to set
     */
    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    /**
     * @return the fechaPedido
     */
    public Date getFechaPedido() {
        return fechaPedido;
    }

    /**
     * @param fechaPedido the fechaPedido to set
     */
    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    /**
     * @return the horaPedido
     */
    public Time getHoraPedido() {
        return horaPedido;
    }

    /**
     * @param horaPedido the horaPedido to set
     */
    public void setHoraPedido(Time horaPedido) {
        this.horaPedido = horaPedido;
    }

    /**
     * @return the estadoPedido
     */
    public String getEstadoPedido() {
        return estadoPedido;
    }

    /**
     * @param estadoPedido the estadoPedido to set
     */
    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
