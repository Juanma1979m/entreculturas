/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanm
 */
@Entity
@Table(name = "ingresos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingresos.findAll", query = "SELECT i FROM Ingresos i")})
public class Ingresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idIngresos")
    private Integer idIngresos;
    @Column(name = "fecah ingreso")
    @Temporal(TemporalType.DATE)
    private Date fecahIngreso;
    @Basic(optional = false)
    @Column(name = "Publico_idPublico")
    private int publicoidPublico;
    @Basic(optional = false)
    @Column(name = "Entidad Privada_idPrivado")
    private int entidadPrivadaidPrivado;

    public Ingresos() {
    }

    public Ingresos(Integer idIngresos) {
        this.idIngresos = idIngresos;
    }

    public Ingresos(Integer idIngresos, int publicoidPublico, int entidadPrivadaidPrivado) {
        this.idIngresos = idIngresos;
        this.publicoidPublico = publicoidPublico;
        this.entidadPrivadaidPrivado = entidadPrivadaidPrivado;
    }

    public Integer getIdIngresos() {
        return idIngresos;
    }

    public void setIdIngresos(Integer idIngresos) {
        this.idIngresos = idIngresos;
    }

    public Date getFecahIngreso() {
        return fecahIngreso;
    }

    public void setFecahIngreso(Date fecahIngreso) {
        this.fecahIngreso = fecahIngreso;
    }

    public int getPublicoidPublico() {
        return publicoidPublico;
    }

    public void setPublicoidPublico(int publicoidPublico) {
        this.publicoidPublico = publicoidPublico;
    }

    public int getEntidadPrivadaidPrivado() {
        return entidadPrivadaidPrivado;
    }

    public void setEntidadPrivadaidPrivado(int entidadPrivadaidPrivado) {
        this.entidadPrivadaidPrivado = entidadPrivadaidPrivado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIngresos != null ? idIngresos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingresos)) {
            return false;
        }
        Ingresos other = (Ingresos) object;
        if ((this.idIngresos == null && other.idIngresos != null) || (this.idIngresos != null && !this.idIngresos.equals(other.idIngresos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Ingresos[ idIngresos=" + idIngresos + " ]";
    }
    
}

