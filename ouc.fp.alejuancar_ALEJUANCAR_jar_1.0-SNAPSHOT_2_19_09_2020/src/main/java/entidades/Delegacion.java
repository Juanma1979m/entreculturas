/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
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
@Table(name = "delegacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delegacion.findAll", query = "SELECT d FROM Delegacion d")})
public class Delegacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DelegacionPK delegacionPK;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "codigo postal")
    private String codigoPostal;
    @Basic(optional = false)
    @Column(name = "provincia")
    private String provincia;
    @Basic(optional = false)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "email")
    private int email;
    @Basic(optional = false)
    @Column(name = "Equipo_idEquipo")
    private int equipoidEquipo;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;

    public Delegacion() {
    }

    public Delegacion(DelegacionPK delegacionPK) {
        this.delegacionPK = delegacionPK;
    }

    public Delegacion(DelegacionPK delegacionPK, String nombre, String direccion, String provincia, String pais, String telefono, int email, int equipoidEquipo, int personaidPersona) {
        this.delegacionPK = delegacionPK;
        this.nombre = nombre;
        this.direccion = direccion;
        this.provincia = provincia;
        this.pais = pais;
        this.telefono = telefono;
        this.email = email;
        this.equipoidEquipo = equipoidEquipo;
        this.personaidPersona = personaidPersona;
    }

    public Delegacion(int idDelegacion, int ingresosidIngresos) {
        this.delegacionPK = new DelegacionPK(idDelegacion, ingresosidIngresos);
    }

    public DelegacionPK getDelegacionPK() {
        return delegacionPK;
    }

    public void setDelegacionPK(DelegacionPK delegacionPK) {
        this.delegacionPK = delegacionPK;
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

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public int getEquipoidEquipo() {
        return equipoidEquipo;
    }

    public void setEquipoidEquipo(int equipoidEquipo) {
        this.equipoidEquipo = equipoidEquipo;
    }

    public int getPersonaidPersona() {
        return personaidPersona;
    }

    public void setPersonaidPersona(int personaidPersona) {
        this.personaidPersona = personaidPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (delegacionPK != null ? delegacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delegacion)) {
            return false;
        }
        Delegacion other = (Delegacion) object;
        if ((this.delegacionPK == null && other.delegacionPK != null) || (this.delegacionPK != null && !this.delegacionPK.equals(other.delegacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Delegacion[ delegacionPK=" + delegacionPK + " ]";
    }
    
}

