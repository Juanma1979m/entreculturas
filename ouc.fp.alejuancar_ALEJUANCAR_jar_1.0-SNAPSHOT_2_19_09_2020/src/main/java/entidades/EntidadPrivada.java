/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanm
 */
@Entity
@Table(name = "entidad_privada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntidadPrivada.findAll", query = "SELECT e FROM EntidadPrivada e")})
public class EntidadPrivada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPrivado")
    private Integer idPrivado;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "pais")
    private String pais;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email")
    private String email;

    public EntidadPrivada() {
    }

    public EntidadPrivada(Integer idPrivado) {
        this.idPrivado = idPrivado;
    }

    public Integer getIdPrivado() {
        return idPrivado;
    }

    public void setIdPrivado(Integer idPrivado) {
        this.idPrivado = idPrivado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrivado != null ? idPrivado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadPrivada)) {
            return false;
        }
        EntidadPrivada other = (EntidadPrivada) object;
        if ((this.idPrivado == null && other.idPrivado != null) || (this.idPrivado != null && !this.idPrivado.equals(other.idPrivado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EntidadPrivada[ idPrivado=" + idPrivado + " ]";
    }
    
}

