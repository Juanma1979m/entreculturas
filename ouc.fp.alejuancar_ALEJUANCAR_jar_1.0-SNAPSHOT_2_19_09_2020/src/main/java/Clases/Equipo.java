package Clases;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "equipo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Equipo extends Persona {

    @XmlElement(name = "Delegacion")
    protected Delegacion delegacion;

    @XmlElement(name = "Id_Equipo")
    protected String id;

    public Equipo(String id, String dni, String nombres, String apellidos, String edad, String direccion, String provincia, String pais, String telefono, String email) {
        super(dni, nombres, apellidos, edad, direccion, provincia, pais, telefono, email);
        this.id = id;
    }

    public Equipo() {

    }

    public Equipo(Delegacion delegacion) {
        this.delegacion = delegacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String getNombres() {
        return nombres;
    }

    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String getEdad() {
        return edad;
    }

    @Override
    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String getPais() {
        return pais;
    }

    @Override
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public void setDelegacion(Delegacion delegacion) {
        this.delegacion = delegacion;
    }

    public Delegacion getDelegacion() {
        return delegacion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "delegacion=" + delegacion + ", id=" + id + '}';
    }

}
