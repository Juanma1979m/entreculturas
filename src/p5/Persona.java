package p5;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String cp;
    private String ciudad;
    private String provincia;
    private String pais;
    private String telefono;
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
