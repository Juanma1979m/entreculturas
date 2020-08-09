package p5;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="delegacion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Delegacion {
    @XmlElement(name="id")
    private int id;
    @XmlElement(name="nombre")
    private String nombre;
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
    @XmlElement(name="personal")
    private ArrayList<Equipo> personal;
    
    public Delegacion(int miId, String miNombre, String miApellidos, String miDireccion, String miCp, String miCiudad, String miProvincia, String miPais, String miTelefono, String miEmail) {
        id = miId;
        nombre = miNombre;
        direccion = miDireccion;
        cp = miCp;
        ciudad = miCiudad;
        provincia = miProvincia;
        pais = miPais;
        telefono = miTelefono;
        email = miEmail;
        personal = new ArrayList<Equipo>();
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
}
