/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanm
 */
@XmlRootElement(name = "Equipos")
public class Equipos {

    List<Equipo> listaEquipos;

    public List<Equipo> getEquipos() {
        return listaEquipos;
    }

    @XmlElement(name = "Equipo")
    public void setEquipos(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public void addEquipo(Equipo equipos) {
        if (this.listaEquipos == null) {
            this.listaEquipos = new ArrayList<>();
        }
        this.listaEquipos.add(equipos);
    }

}
