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
public class DelegacionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idDelegacion")
    private int idDelegacion;
    @Basic(optional = false)
    @Column(name = "Ingresos_idIngresos")
    private int ingresosidIngresos;

    public DelegacionPK() {
    }

    public DelegacionPK(int idDelegacion, int ingresosidIngresos) {
        this.idDelegacion = idDelegacion;
        this.ingresosidIngresos = ingresosidIngresos;
    }

    public int getIdDelegacion() {
        return idDelegacion;
    }

    public void setIdDelegacion(int idDelegacion) {
        this.idDelegacion = idDelegacion;
    }

    public int getIngresosidIngresos() {
        return ingresosidIngresos;
    }

    public void setIngresosidIngresos(int ingresosidIngresos) {
        this.ingresosidIngresos = ingresosidIngresos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idDelegacion;
        hash += (int) ingresosidIngresos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DelegacionPK)) {
            return false;
        }
        DelegacionPK other = (DelegacionPK) object;
        if (this.idDelegacion != other.idDelegacion) {
            return false;
        }
        if (this.ingresosidIngresos != other.ingresosidIngresos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.DelegacionPK[ idDelegacion=" + idDelegacion + ", ingresosidIngresos=" + ingresosidIngresos + " ]";
    }
    
}

