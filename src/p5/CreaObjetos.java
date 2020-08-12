/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class CreaObjetos {
    
Scanner sc= new Scanner (System.in);

public CreaObjetos() {
}
public int  getEdad(String edad) {
		
    System.out.println("introduzca día y pulse enter, mes y pulse enter y año y pulse enter");
		
    int s1=calcularEdad(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
    sc.nextLine();
		
    return s1;
		
			
	}
public String getDni(String dni) throws DNIException {
    
	String numDni="";	
		
	while (numDni.equals("")) {
			
            System.out.println(dni);
				
            numDni= sc.nextLine();
			
            if (!(numDni.length()>=8 && numDni.length()<=9)) {
			 
                throw new DNIException(DNIException.LONGITUD_NO_CORRECTA ); 	
            }
		 	
            String numeros= numDni.substring(0,numDni.length()-1);
		 	
            int numDNI=0;
		 	
            try {
				
                numDNI= Integer.parseInt(numeros);
			 	
            }catch(NumberFormatException e) {
				
                throw  new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);  
			 	
            }
			
            char letra= numDni.substring(numDni.length()-1, numDni.length()).toUpperCase().charAt(0);
		  	
            if(!(letra>= 'A' && letra<='Z')) {
			
                throw new DNIException(DNIException.PARTE_LETRA_NO_CORRECTA);  	
            }
		 		
            char letraDni[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'	
            };  
		
            int resto = numDNI % 23;
	  	
            String nuevoDNI = numDNI + "" + letraDni[resto];	 
	 	
            if (! (nuevoDNI.equals(numDni))){
		
                throw new DNIException(DNIException.FORMATO_NO_CORRECTO);  	
            }
        }	
        return numDni;
}
public String  getNombre(String nombre) {
    
    String s1= "";
   	
    while (s1.equals("")) {
			
        System.out.println(nombre);
        s1= sc.nextLine();
        if (! s1.matches("^[A-Za-zÁÉÍÓÚáéíóú ñÑ]*$")) {
	
            s1="";		
        }	
    }	
    return s1;	
}
public String  getApellidos(String apellidos) {
			
    String s1= "";
		
    while (s1.equals("")) {
		
        System.out.println(apellidos);
        s1= sc.nextLine();
        if (! s1.matches("^[A-Za-zÁÉÍÓÚáéíóúñÑ  ]*$")) {	
            s1="";
        }
    }	
    return s1;	
}
public String  getEmail(String email) {		
    
    String s1= "";	
    while (s1.equals("")) {
	    
        System.out.println(email);
	
        s1= sc.nextLine();	
        
        if (! s1.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}")) {	
          
            s1="";	
        }
    }		
    return s1;	
}
public String  getDireccion(String Direccion) {
			
    String s1= "";		
	
    while (s1.equals("")) {
        System.out.println(Direccion);	
        s1= sc.nextLine();	
        
        if (! s1.matches("^[A-Za-zÑñáéíóúÁÉÍÓÚÏÜïü.0º1º2º3º4º5º6º7º8º9º0ª1ª2ª3ª4ª5ª6ª7ª8ª9ª  ]*$")) {	
          
            s1="";	
        }	
    }	
    return s1;	
}
public String  getProvincia(String provincia) {
		
    String s1= "";
			
    while (s1.equals("")) {
					
        System.out.println(provincia);
					
        s1= sc.nextLine();
				
        if (! s1.matches("^[A-Za-záéíóúÁÉÍÓÚÑñ]*$")) {
						
            s1="";		
        }	
    }		
    return s1;		
}
public String  getPais(String pais) {
				
    String s1= "";		
    while (s1.equals("")) {
					
        System.out.println(pais);
						
        s1= sc.nextLine();
						
        if (! s1.matches("^[A-Za-záéíóúÁÉÍÓÚñÑçÇ]*$")) {
						
            s1="";		
        }	
    }	
    return s1;	
}
public String  getTelefono(String telefono) {
	
    String s1= "";
		
    while (s1.equals("")) {
		
        System.out.println(telefono);
			
        s1= sc.nextLine();
				
        if (! s1.matches("[0-9 ]{9}")) {		
            s1="";             
            System.out.println("Error escriba de nuevo");	
        }	
    }		
    return s1;		
}
public static int calcularEdad(int day, int month, int year) {			
    
    Calendar fechaNacimiento = new GregorianCalendar(year, month, day);
    Calendar fechaActual = Calendar.getInstance();	  
    //Calcula diferencias.
	  
    int years = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
	  
    int months = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
	   
    int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNacimiento.get(Calendar.DAY_OF_MONTH);
 
    if(months < 0 //Aun no es mes de cumpleaños.
            
            || (months == 0 && days < 0)){//Es el mes pero no ha llegado el día.  
        
        years--; //Se resta 1 a la diferencia de años.	
    }	
    return years;	
}
public int getId(String id){
    int identificador;
    identificador = sc.nextInt();
    sc.nextLine();
    return identificador;
}

public String getCp(String cp) {

    return cp;
}

public String getCiudad(String Ciudad) {

    return Ciudad;
}

public ArrayList<Equipo> getPersonal(String Personas) {
   
    return null;
    }
}

