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
@Table(name = "equipo_has_proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipoHasProyectos.findAll", query = "SELECT e FROM EquipoHasProyectos e")})
public class EquipoHasProyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EquipoHasProyectosPK equipoHasProyectosPK;

    public EquipoHasProyectos() {
    }

    public EquipoHasProyectos(EquipoHasProyectosPK equipoHasProyectosPK) {
        this.equipoHasProyectosPK = equipoHasProyectosPK;
    }

    public EquipoHasProyectos(int equipoidEquipo, int proyectosidProyectos) {
        this.equipoHasProyectosPK = new EquipoHasProyectosPK(equipoidEquipo, proyectosidProyectos);
    }

    public EquipoHasProyectosPK getEquipoHasProyectosPK() {
        return equipoHasProyectosPK;
    }

    public void setEquipoHasProyectosPK(EquipoHasProyectosPK equipoHasProyectosPK) {
        this.equipoHasProyectosPK = equipoHasProyectosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipoHasProyectosPK != null ? equipoHasProyectosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipoHasProyectos)) {
            return false;
        }
        EquipoHasProyectos other = (EquipoHasProyectos) object;
        if ((this.equipoHasProyectosPK == null && other.equipoHasProyectosPK != null) || (this.equipoHasProyectosPK != null && !this.equipoHasProyectosPK.equals(other.equipoHasProyectosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EquipoHasProyectos[ equipoHasProyectosPK=" + equipoHasProyectosPK + " ]";
    }
    
}

