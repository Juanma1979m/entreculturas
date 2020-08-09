package p5;

import java.util.ArrayList;
import java.util.List;

public class Personas {
    private List<Persona> personas;
    
    public List<Persona> getPersonas() {
        return personas;
    }
    
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public void addPersonas(Persona persona) {
        if(this.personas == null) {
            this.personas = new ArrayList<Persona>();
        }
        this.personas.add(persona);
    }
}
