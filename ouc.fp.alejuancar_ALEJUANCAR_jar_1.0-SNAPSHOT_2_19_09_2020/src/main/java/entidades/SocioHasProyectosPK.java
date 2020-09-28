/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author juanm
 */
@Embeddable
public class SocioHasProyectosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Socio_idSocio")
    private int socioidSocio;
    @Basic(optional = false)
    @Column(name = "Proyectos_idProyectos")
    private int proyectosidProyectos;

    public SocioHasProyectosPK() {
    }

    public SocioHasProyectosPK(int socioidSocio, int proyectosidProyectos) {
        this.socioidSocio = socioidSocio;
        this.proyectosidProyectos = proyectosidProyectos;
    }

    public int getSocioidSocio() {
        return socioidSocio;
    }

    public void setSocioidSocio(int socioidSocio) {
        this.socioidSocio = socioidSocio;
    }

    public int getProyectosidProyectos() {
        return proyectosidProyectos;
    }

    public void setProyectosidProyectos(int proyectosidProyectos) {
        this.proyectosidProyectos = proyectosidProyectos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) socioidSocio;
        hash += (int) proyectosidProyectos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SocioHasProyectosPK)) {
            return false;
        }
        SocioHasProyectosPK other = (SocioHasProyectosPK) object;
        if (this.socioidSocio != other.socioidSocio) {
            return false;
        }
        if (this.proyectosidProyectos != other.proyectosidProyectos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SocioHasProyectosPK[ socioidSocio=" + socioidSocio + ", proyectosidProyectos=" + proyectosidProyectos + " ]";
    }
    
}

