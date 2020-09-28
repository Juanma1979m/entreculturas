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
@Table(name = "periodicidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Periodicidad.findAll", query = "SELECT p FROM Periodicidad p")})
public class Periodicidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cuota")
    private Float cuota;
    @Column(name = "fecha ingresos")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresos;
    @Basic(optional = false)
    @Column(name = "Socio_idSocio")
    private int socioidSocio;

    public Periodicidad() {
    }

    public Periodicidad(Integer id) {
        this.id = id;
    }

    public Periodicidad(Integer id, int socioidSocio) {
        this.id = id;
        this.socioidSocio = socioidSocio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getCuota() {
        return cuota;
    }

    public void setCuota(Float cuota) {
        this.cuota = cuota;
    }

    public Date getFechaIngresos() {
        return fechaIngresos;
    }

    public void setFechaIngresos(Date fechaIngresos) {
        this.fechaIngresos = fechaIngresos;
    }

    public int getSocioidSocio() {
        return socioidSocio;
    }

    public void setSocioidSocio(int socioidSocio) {
        this.socioidSocio = socioidSocio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodicidad)) {
            return false;
        }
        Periodicidad other = (Periodicidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Periodicidad[ id=" + id + " ]";
    }
    
}

