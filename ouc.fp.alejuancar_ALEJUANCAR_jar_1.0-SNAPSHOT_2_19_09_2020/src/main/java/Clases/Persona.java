package Clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.*;

@Entity
@Table(name="Personas")
@XmlRootElement(name = "Persona")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {

    @XmlElement(name = "dni")
    protected String dni;
    @XmlElement(name = "Nombre")
    protected String nombres;
    @XmlElement(name = "Apellidos")
    protected String apellidos;
    @XmlElement(name = "Edad")
    protected String edad;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElement(name = "Pais")
    protected String pais;
    @XmlElement(name = "Telefono")
    protected String telefono;
    @XmlElement(name = "Email")
    protected String email;

    public Persona(String dni, String nombres, String apellidos,
            String edad, String direccion, String provincia,
            String pais, String telefono, String email) {
        super();
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.provincia = provincia;
        this.pais = pais;
        this.telefono = telefono;
        this.email = email;

    }

    public Persona() {
        super();
    }

    public Persona(String dni, String nombre, String apellidos) {
        super();
        this.dni = dni;
        this.nombres = nombre;
        this.apellidos = apellidos;
    }

    @Column(name="Dni")
    /**
     * @return el dni
     */
    //@XmlElement(name="dni")
    @Id
    public String getDni() {
        return dni;
    }

    /**
     * @param dni el dni a establecer
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Column(name="Nombre")
    /**
     * @return el nombres
     */
    //@XmlElement(name="nombre")
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres el nombres a establecer
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
@Column(name="Apellidos")
    /**
     * @return el apellidos
     */
    //@XmlElement(name="apellidos")
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos el apellidos a establecer
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Column(name="Edad")
    /**
     * @return el edad
     */
    //@XmlElement(name="edad")
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad el edad a establecer
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Column(name="Direccion")
    /**
     * @return el direccion
     */
    //@XmlElement(name="dirección")
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion el direccion a establecer
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name="Provincia")
    /**
     * @return el provincia
     */
    //@XmlElement(name="provincia")
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia el provincia a establecer
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    @Column(name="País")

    /**
     * @return el pais
     */
    //@XmlElement(name="pais")
    public String getPais() {
        return pais;
    }

    /**
     * @param pais el pais a establecer
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Column(name="Teléfono")
    /**
     * @return el telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono el telefono a establecer
     */
    //@XmlElement(name="telefono")
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Column(name="Email")
    /**
     * @return el email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email el email a establecer
     */
    //@XmlElement(name="email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "El DNI introducido es\n :" + dni + "\n" + "El nombre es:\n " + nombres + "\n" + "El apellido es:\n " + apellidos + "\n" + "su edad es : \n" + edad + "\n" + "La dirección es:\n" + direccion + "\t" + provincia + "\t" + pais + "\n" + "su teléfono:\n" + telefono + "\n" + "y su email:\n " + email + "\n";
    }
}
