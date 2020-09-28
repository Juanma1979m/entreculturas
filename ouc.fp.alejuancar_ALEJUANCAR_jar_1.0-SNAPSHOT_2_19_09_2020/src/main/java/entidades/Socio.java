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
@Table(name = "socio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Socio.findAll", query = "SELECT s FROM Socio s")})
public class Socio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idSocio")
    private Integer idSocio;
    @Basic(optional = false)
    @Column(name = "Entidad Privada_idPrivado")
    private int entidadPrivadaidPrivado;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;

    public Socio() {
    }

    public Socio(Integer idSocio) {
        this.idSocio = idSocio;
    }

    public Socio(Integer idSocio, int entidadPrivadaidPrivado, int personaidPersona) {
        this.idSocio = idSocio;
        this.entidadPrivadaidPrivado = entidadPrivadaidPrivado;
        this.personaidPersona = personaidPersona;
    }

    public Integer getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Integer idSocio) {
        this.idSocio = idSocio;
    }

    public int getEntidadPrivadaidPrivado() {
        return entidadPrivadaidPrivado;
    }

    public void setEntidadPrivadaidPrivado(int entidadPrivadaidPrivado) {
        this.entidadPrivadaidPrivado = entidadPrivadaidPrivado;
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
        hash += (idSocio != null ? idSocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Socio)) {
            return false;
        }
        Socio other = (Socio) object;
        if ((this.idSocio == null && other.idSocio != null) || (this.idSocio != null && !this.idSocio.equals(other.idSocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Socio[ idSocio=" + idSocio + " ]";
    }
    
}

