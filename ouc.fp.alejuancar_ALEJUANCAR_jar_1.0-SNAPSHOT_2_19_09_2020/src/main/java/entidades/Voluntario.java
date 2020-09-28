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
@Table(name = "voluntario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voluntario.findAll", query = "SELECT v FROM Voluntario v")})
public class Voluntario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idVoluntario")
    private Integer idVoluntario;
    @Basic(optional = false)
    @Column(name = "extranjero")
    private short extranjero;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;

    public Voluntario() {
    }

    public Voluntario(Integer idVoluntario) {
        this.idVoluntario = idVoluntario;
    }

    public Voluntario(Integer idVoluntario, short extranjero, int personaidPersona) {
        this.idVoluntario = idVoluntario;
        this.extranjero = extranjero;
        this.personaidPersona = personaidPersona;
    }

    public Integer getIdVoluntario() {
        return idVoluntario;
    }

    public void setIdVoluntario(Integer idVoluntario) {
        this.idVoluntario = idVoluntario;
    }

    public short getExtranjero() {
        return extranjero;
    }

    public void setExtranjero(short extranjero) {
        this.extranjero = extranjero;
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
        hash += (idVoluntario != null ? idVoluntario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voluntario)) {
            return false;
        }
        Voluntario other = (Voluntario) object;
        if ((this.idVoluntario == null && other.idVoluntario != null) || (this.idVoluntario != null && !this.idVoluntario.equals(other.idVoluntario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Voluntario[ idVoluntario=" + idVoluntario + " ]";
    }
    
}

