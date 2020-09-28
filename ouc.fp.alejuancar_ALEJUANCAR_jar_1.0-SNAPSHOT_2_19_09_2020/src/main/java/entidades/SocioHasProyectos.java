/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanm
 */
@Entity
@Table(name = "socio_has_proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SocioHasProyectos.findAll", query = "SELECT s FROM SocioHasProyectos s")})
public class SocioHasProyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SocioHasProyectosPK socioHasProyectosPK;

    public SocioHasProyectos() {
    }

    public SocioHasProyectos(SocioHasProyectosPK socioHasProyectosPK) {
        this.socioHasProyectosPK = socioHasProyectosPK;
    }

    public SocioHasProyectos(int socioidSocio, int proyectosidProyectos) {
        this.socioHasProyectosPK = new SocioHasProyectosPK(socioidSocio, proyectosidProyectos);
    }

    public SocioHasProyectosPK getSocioHasProyectosPK() {
        return socioHasProyectosPK;
    }

    public void setSocioHasProyectosPK(SocioHasProyectosPK socioHasProyectosPK) {
        this.socioHasProyectosPK = socioHasProyectosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (socioHasProyectosPK != null ? socioHasProyectosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SocioHasProyectos)) {
            return false;
        }
        SocioHasProyectos other = (SocioHasProyectos) object;
        if ((this.socioHasProyectosPK == null && other.socioHasProyectosPK != null) || (this.socioHasProyectosPK != null && !this.socioHasProyectosPK.equals(other.socioHasProyectosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SocioHasProyectos[ socioHasProyectosPK=" + socioHasProyectosPK + " ]";
    }
    
}

