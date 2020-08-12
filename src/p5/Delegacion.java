package p5;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="delegacion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Delegacion {
    @XmlElement(name="id")
    protected int id;
    @XmlElement(name="nombre")
    protected  String nombre;
    @XmlElement(name="direccion")
    protected String direccion;
    @XmlElement(name="cp")
    protected String cp;
    @XmlElement(name="ciudad")
    protected String ciudad;
    @XmlElement(name="provincia")
    protected String provincia;
    @XmlElement(name="pais")
    protected String pais;
    @XmlElement(name="telefono")
    protected String telefono;
    @XmlElement(name="email")
    protected String email;
  //  @XmlElement(name="personal")
  //  protected ArrayList<Equipo> personal;
    
    public Delegacion(int miId, String miNombre, 
            String miDireccion, 
            String miCp, String miCiudad, 
            String miProvincia, String miPais, 
            String miTelefono, String miEmail/*,
           ArrayList<Equipo>personal*/) {
        id = miId;
        nombre = miNombre;
        direccion = miDireccion;
        cp = miCp;
        ciudad = miCiudad;
        provincia = miProvincia;
        pais = miPais;
        telefono = miTelefono;
        email = miEmail;
       // personal = new ArrayList<Equipo>();
    }
    public Delegacion(){
       
    }
    
    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   /* public ArrayList<Equipo> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Equipo> personal) {
        this.personal = personal;
    }*/
    
    public String getNombre() {
        return nombre; 
         
    }
}
