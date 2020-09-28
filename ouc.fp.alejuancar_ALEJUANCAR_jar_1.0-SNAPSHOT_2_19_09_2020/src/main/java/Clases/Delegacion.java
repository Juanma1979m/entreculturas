package Clases;


import javax.xml.bind.annotation.*;

/**
 *
 * @author Alejuancar
 */
@XmlRootElement(name = "delegacion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Delegacion {

    //Atributos de la clase Delegación
    @XmlElement(name = "id")
    protected String id;
    @XmlElement(name = "nombre")
    protected String nombre;
    @XmlElement(name = "direccion")
    protected String direccion;
    @XmlElement(name = "cp")
    protected String cp;
    @XmlElement(name = "ciudad")
    protected String ciudad;
    @XmlElement(name = "provincia")
    protected String provincia;
    @XmlElement(name = "pais")
    protected String pais;
    @XmlElement(name = "telefono")
    protected String telefono;
    @XmlElement(name = "email")
    protected String email;

    /**
     *
     * @param id
     * @param nombre
     * @param direccion
     * @param cp
     * @param ciudad
     * @param provincia
     * @param pais
     * @param telefono
     * @param email
     *
     */
    public Delegacion(String id, String nombre, String direccion, String cp, String ciudad, String provincia, String pais, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cp = cp;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.telefono = telefono;
        this.email = email;
      

    }

    /**
     *
     */
    public Delegacion() {

    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public String getCp() {
        return cp;
    }

    /**
     *
     * @param cp
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     *
     * @return
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     *
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     *
     * @return
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     *
     * @param provincia
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     *
     * @return
     */
    public String getPais() {
        return pais;
    }

    /**
     *
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Delegacion{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", cp=" + cp + ", ciudad=" + ciudad + ", provincia=" + provincia + ", pais=" + pais + ", telefono=" + telefono + ", email=" + email + '}';
    }

}
