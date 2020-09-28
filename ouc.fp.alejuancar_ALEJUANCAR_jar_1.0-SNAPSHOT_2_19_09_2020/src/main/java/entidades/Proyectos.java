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
@Table(name = "proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p")})
public class Proyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idProyectos")
    private Integer idProyectos;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "linea de accion")
    private String lineaDeAccion;
    @Column(name = "sublinea de accion")
    private String sublineaDeAccion;
    @Column(name = "fecha inicial")
    @Temporal(TemporalType.DATE)
    private Date fechaInicial;
    @Column(name = "fecha fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "socio local")
    private String socioLocal;
    @Column(name = "financiador")
    private String financiador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad aportada")
    private Float cantidadAportada;

    public Proyectos() {
    }

    public Proyectos(Integer idProyectos) {
        this.idProyectos = idProyectos;
    }

    public Integer getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(Integer idProyectos) {
        this.idProyectos = idProyectos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLineaDeAccion() {
        return lineaDeAccion;
    }

    public void setLineaDeAccion(String lineaDeAccion) {
        this.lineaDeAccion = lineaDeAccion;
    }

    public String getSublineaDeAccion() {
        return sublineaDeAccion;
    }

    public void setSublineaDeAccion(String sublineaDeAccion) {
        this.sublineaDeAccion = sublineaDeAccion;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getSocioLocal() {
        return socioLocal;
    }

    public void setSocioLocal(String socioLocal) {
        this.socioLocal = socioLocal;
    }

    public String getFinanciador() {
        return financiador;
    }

    public void setFinanciador(String financiador) {
        this.financiador = financiador;
    }

    public Float getCantidadAportada() {
        return cantidadAportada;
    }

    public void setCantidadAportada(Float cantidadAportada) {
        this.cantidadAportada = cantidadAportada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyectos != null ? idProyectos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyectos)) {
            return false;
        }
        Proyectos other = (Proyectos) object;
        if ((this.idProyectos == null && other.idProyectos != null) || (this.idProyectos != null && !this.idProyectos.equals(other.idProyectos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Proyectos[ idProyectos=" + idProyectos + " ]";
    }
    
}

