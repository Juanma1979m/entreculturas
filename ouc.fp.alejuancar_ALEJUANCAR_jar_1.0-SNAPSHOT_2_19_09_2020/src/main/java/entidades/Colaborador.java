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
@Table(name = "colaborador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colaborador.findAll", query = "SELECT c FROM Colaborador c")})
public class Colaborador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idColaborador")
    private Integer idColaborador;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;

    public Colaborador() {
    }

    public Colaborador(Integer idColaborador) {
        this.idColaborador = idColaborador;
    }

    public Colaborador(Integer idColaborador, int personaidPersona) {
        this.idColaborador = idColaborador;
        this.personaidPersona = personaidPersona;
    }

    public Integer getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(Integer idColaborador) {
        this.idColaborador = idColaborador;
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
        hash += (idColaborador != null ? idColaborador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colaborador)) {
            return false;
        }
        Colaborador other = (Colaborador) object;
        if ((this.idColaborador == null && other.idColaborador != null) || (this.idColaborador != null && !this.idColaborador.equals(other.idColaborador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Colaborador[ idColaborador=" + idColaborador + " ]";
    }
    
}

