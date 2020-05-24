package p5;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="equipo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Equipo extends Persona {
    public Equipo(String miDni, String miNombre, String miApellidos, String miDireccion, String miCp, String miCiudad, String miProvincia, String miPais, String miTelefono, String miEmail) {
        super(miDni, miNombre, miApellidos, miDireccion, miCp, miCiudad, miProvincia, miPais, miTelefono, miEmail);
    }    
}
