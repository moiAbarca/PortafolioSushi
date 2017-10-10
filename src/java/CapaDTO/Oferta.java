/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDTO;

import java.sql.Date;
/**
 *
 * @author moi
 */
public class Oferta {
    private int ofertaId;
    private double porcentajeOferta;
    private Date fechaInicio;
    private Date fechaTermino;

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
     * @return the porcentajeOferta
     */
    public double getPorcentajeOferta() {
        return porcentajeOferta;
    }

    /**
     * @param porcentajeOferta the porcentajeOferta to set
     */
    public void setPorcentajeOferta(double porcentajeOferta) {
        this.porcentajeOferta = porcentajeOferta;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaTermino
     */
    public Date getFechaTermino() {
        return fechaTermino;
    }

    /**
     * @param fechaTermino the fechaTermino to set
     */
    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
}
