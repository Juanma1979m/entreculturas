package p5;

import DAO.DAOFactory;
import DAO.XmlDelegacionDAO;
import DAO.XmlPersonaDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejuancar
 */



public class P5 {
static Scanner sc = new Scanner (System.in);
static CreaObjetos in =new CreaObjetos();
private static Personas inicializaPersonas(CreaObjetos in) throws Exception {
	
    Personas person = new Personas();
    int i=0;
    int N ;
			
    do {
				
        System.out.println("¿Cuantas personas va a introducir?");			
        N = sc.nextInt();			
        sc.nextLine();
				
    }while (N<i) ;		 
    for (i = 1; i <= N; i++) {		 
				 	
        System.out.println("Persona " + i );
		  	            
        String dni = in.getDni(" Dni"); 	          
        String nombre = in.getNombre("Introduce Nombre"); 	           
        String apellidos = in.getApellidos("Introduce Apellidos");	           
        int edad = in.getEdad("Introduce Edad:");                   
        String direccion = in.getDireccion("Introduce Dirección:"); 	           
        String provincia = in.getProvincia("Introduce Provincia:");	           
        String pais = in.getPais("Introduce País:");                    
        String telefono =  in.getTelefono("Introduce Teléfono:");                
        String email = in.getEmail("Introduce email:");
		                        
        person.add(new Persona(dni, nombre, apellidos, edad, direccion, provincia, pais, telefono, email));	 	
    }		
    return person;	
}
private static Delegaciones inicializaDelegacion(CreaObjetos in){
    Delegaciones deleg = new Delegaciones();
    int i=0;
    int N;
    do {
				
        System.out.println("¿Cuantas Delegaciones va a introducir?");			
        N = sc.nextInt();			
        sc.nextLine();
				
    }while (N<i) ;		 
    for (i = 1; i <= N; i++) {		 
				 	
        System.out.println("Delegación " + i );
        int id = in.getId("Id"); 	          
        String nombre = in.getNombre("Introduce Nombre"); 	                             
        String direccion = in.getDireccion("Introduce Dirección:"); 
        String cp = in.getCp("Introduce Codigo Postal");	           
        String ciudad  = in.getCiudad("Introduce Ciudad:"); 
        String provincia = in.getProvincia("Introduce Provincia:");	           
        String pais = in.getPais("Introduce País:");                    
        String telefono =  in.getTelefono("Introduce Teléfono:");                
        String email = in.getEmail("Introduce email:");
       // ArrayList<Equipo> personal = in.getPersonal("Introduce Personas");	           
        deleg.addDelegacion(new Delegacion(id,nombre,direccion,cp,ciudad,provincia,pais,telefono,email/*,personal*/));
    }
    return deleg;
    
}
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
System.out.println("--------------");
        System.out.println("1. Introduzca Personas");
        System.out.println("2. Introduzca Delegaciones");
        int N;
        N=sc.nextInt();
        DAOFactory XMLDAOFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
        

        switch(N){
            case 1:
        Personas personas = inicializaPersonas( in);
        XmlPersonaDAO personaDAO = XMLDAOFactory.getPersonaDAO();
        personaDAO.Guardar(personas);
        personaDAO.ListarPersonas();
        break;
        
            case 2:
                
        Delegaciones delegaciones =inicializaDelegacion(in);
	XmlDelegacionDAO delegacionDAO = XMLDAOFactory.getDelegacionDAO();
	delegacionDAO.Guardar(delegaciones);
	delegacionDAO.ListarDelegaciones();
        break;
        }

        
       
                
       
        
    }
    
}
