package p5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "personas")
public class Personas{		
    List<Persona> listaPersonas;
	   		
    public List<Persona>getPersonas() {
        return listaPersonas;
    }
    @XmlElement(name = "persona")
    public void setPersonas (List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    public void add(Persona personas) {	
        if (this.listaPersonas == null) {
            this.listaPersonas = new ArrayList<Persona>();
        }
        this.listaPersonas.add(personas);
    }
}