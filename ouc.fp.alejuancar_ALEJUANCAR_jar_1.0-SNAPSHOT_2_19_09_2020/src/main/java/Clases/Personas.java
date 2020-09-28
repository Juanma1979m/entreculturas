package Clases;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Personas")
public class Personas {

    List<Persona> listaPersonas;

    public Personas(String dni, String nombre, String apellidos, String edad, String direccion, String provincia, String pais, String telefono, String email) {
        super();
    }

    public Personas() {
        
    }

    public List<Persona> getPersonas() {
        return listaPersonas;
    }

    @XmlElement(name = "Persona")
    public void setPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void add(Persona personas) {
        if (this.listaPersonas == null) {
            this.listaPersonas = new ArrayList<>();
        }
        this.listaPersonas.add(personas);
    }
}
