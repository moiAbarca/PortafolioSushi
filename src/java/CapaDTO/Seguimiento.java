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
public class Seguimiento {
    private int seguimientoId;
    private Canal canalId;
    private String registro;
    private Pagina paginaId;
    private Cliente clienteId;

    /**
     * @return the seguimientoId
     */
    public int getSeguimientoId() {
        return seguimientoId;
    }

    /**
     * @param seguimientoId the seguimientoId to set
     */
    public void setSeguimientoId(int seguimientoId) {
        this.seguimientoId = seguimientoId;
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
     * @return the registro
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    /**
     * @return the paginaId
     */
    public Pagina getPaginaId() {
        return paginaId;
    }

    /**
     * @param paginaId the paginaId to set
     */
    public void setPaginaId(Pagina paginaId) {
        this.paginaId = paginaId;
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
}
