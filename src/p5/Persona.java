package p5;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="persona")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {
    @XmlElement(name="dni")
    private String dni;
    @XmlElement(name="nombre")
    private String nombre;
    @XmlElement(name="apellidos")
    private String apellidos;
    @XmlElement(name="direccion")
    private String direccion;
    @XmlElement(name="cp")
    private String cp;
    @XmlElement(name="ciudad")
    private String ciudad;
    @XmlElement(name="provincia")
    private String provincia;
    @XmlElement(name="pais")
    private String pais;
    @XmlElement(name="telefono")
    private String telefono;
    @XmlElement(name="email")
    private String email;
    
    public Persona(String miDni, String miNombre, String miApellidos, String miDireccion, String miCp, String miCiudad, String miProvincia, String miPais, String miTelefono, String miEmail) {
        dni = miDni;
        nombre = miNombre;
        apellidos = miApellidos;
        direccion = miDireccion;
        cp = miCp;
        ciudad = miCiudad;
        provincia = miProvincia;
        pais = miPais;
        telefono = miTelefono;
        email = miEmail;
    }
}
