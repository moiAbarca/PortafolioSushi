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
public class Perfil {
    private int perfilId;
    private String nombrePerfil;
    private int accesoId;

    /**
     * @return the perfilId
     */
    public int getPerfilId() {
        return perfilId;
    }

    /**
     * @param perfilId the perfilId to set
     */
    public void setPerfilId(int perfilId) {
        this.perfilId = perfilId;
    }

    /**
     * @return the nombrePerfil
     */
    public String getNombrePerfil() {
        return nombrePerfil;
    }

    /**
     * @param nombrePerfil the nombrePerfil to set
     */
    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    /**
     * @return the accesoId
     */
    public int getAccesoId() {
        return accesoId;
    }

    /**
     * @param accesoId the accesoId to set
     */
    public void setAccesoId(int accesoId) {
        this.accesoId = accesoId;
    }
    
}
