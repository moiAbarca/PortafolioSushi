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
public class Establecimiento {
    private int establecimientoId;
    private int comunaId;
    private String nombreLocal;
    private String direccion;

    /**
     * @return the establecimientoId
     */
    public int getEstablecimientoId() {
        return establecimientoId;
    }

    /**
     * @param establecimientoId the establecimientoId to set
     */
    public void setEstablecimientoId(int establecimientoId) {
        this.establecimientoId = establecimientoId;
    }

    /**
     * @return the comunaId
     */
    public int getComunaId() {
        return comunaId;
    }

    /**
     * @param comunaId the comunaId to set
     */
    public void setComunaId(int comunaId) {
        this.comunaId = comunaId;
    }

    /**
     * @return the nombreLocal
     */
    public String getNombreLocal() {
        return nombreLocal;
    }

    /**
     * @param nombreLocal the nombreLocal to set
     */
    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
