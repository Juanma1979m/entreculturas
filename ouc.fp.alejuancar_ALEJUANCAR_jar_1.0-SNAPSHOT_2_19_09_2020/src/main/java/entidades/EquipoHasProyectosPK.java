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
public class EquipoHasProyectosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Equipo_idEquipo")
    private int equipoidEquipo;
    @Basic(optional = false)
    @Column(name = "Proyectos_idProyectos")
    private int proyectosidProyectos;

    public EquipoHasProyectosPK() {
    }

    public EquipoHasProyectosPK(int equipoidEquipo, int proyectosidProyectos) {
        this.equipoidEquipo = equipoidEquipo;
        this.proyectosidProyectos = proyectosidProyectos;
    }

    public int getEquipoidEquipo() {
        return equipoidEquipo;
    }

    public void setEquipoidEquipo(int equipoidEquipo) {
        this.equipoidEquipo = equipoidEquipo;
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
        hash += (int) equipoidEquipo;
        hash += (int) proyectosidProyectos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipoHasProyectosPK)) {
            return false;
        }
        EquipoHasProyectosPK other = (EquipoHasProyectosPK) object;
        if (this.equipoidEquipo != other.equipoidEquipo) {
            return false;
        }
        if (this.proyectosidProyectos != other.proyectosidProyectos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EquipoHasProyectosPK[ equipoidEquipo=" + equipoidEquipo + ", proyectosidProyectos=" + proyectosidProyectos + " ]";
    }
    
}

