package p5;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="equipo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Equipo extends Persona {
    public Equipo(String dni, String nombre, String apellidos,int edad, String direccion,  String provincia, String pais, String telefono, String email) {
        super(dni, nombre, apellidos,edad, direccion, provincia, pais, telefono, email);
    }    
}
