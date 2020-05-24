package p5;

import java.util.ArrayList;

public class Delegacion {
    private int id;
    private String nombre;
    private String direccion;
    private String cp;
    private String ciudad;
    private String provincia;
    private String pais;
    private String telefono;
    private String email;
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

}
