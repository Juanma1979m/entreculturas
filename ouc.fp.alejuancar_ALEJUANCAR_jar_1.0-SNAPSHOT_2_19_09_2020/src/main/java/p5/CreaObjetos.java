/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class CreaObjetos {

    Scanner sc = new Scanner(System.in);

    public CreaObjetos() {
    }

    public String modificaId(String id) {
        String iden = "";

        while (iden.equals("")) {

            System.out.println(id);
            iden = sc.nextLine();
            if (!iden.matches("[0-9]{2}[/-][A-Za-z]{4}")) {
                iden = "";
            }
        }
        return iden;
    }

    public String modificaDni(String dni) throws DNIException {

        String numDni = "";

        while (numDni.equals("")) {

            System.out.println(dni);

            numDni = sc.nextLine();

            if (!(numDni.length() >= 8 && numDni.length() <= 9)) {

                numDni = "";

                System.out.println("Longitud incorrecta");
            }

            String numeros = numDni.substring(0, numDni.length() - 1);

            int numDNI = 0;

            try {

                numDNI = Integer.parseInt(numeros);

            } catch (NumberFormatException e) {

                numDni = "";

                System.out.println(DNIException.PARTE_NUMERICA_NO_CORRECTA);
            }

            char letra = numDni.substring(numDni.length() - 1, numDni.length()).toUpperCase().charAt(0);

            if (!(letra >= 'A' && letra <= 'Z')) {

                numDni = "";

                System.out.println(DNIException.PARTE_LETRA_NO_CORRECTA);
            }

            char letraDni[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
            };

            int resto = numDNI % 23;

            String nuevoDNI = numDNI + "" + letraDni[resto];

            if (!(nuevoDNI.equals(numDni))) {

                numDni = "";

                System.out.println(DNIException.FORMATO_NO_CORRECTO);
            }
        }
        return numDni;

    }

    public String modificaNombre(String nombre) {

        nombre = modificaTexto(nombre);
        return nombre;
    }

    public String modificaApellidos(String apellidos) {
        apellidos = modificaTexto(apellidos);
        return apellidos;
    }

    public String modificaEdad(String edad) {

        System.out.println("Introduzca día de nacimiento");
        int dia = sc.nextInt();
        System.out.println("Introduzca mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("Introduzca año de nacimiento");
        int anio = sc.nextInt();
        sc.nextLine();
        int anios = calculoEdad(dia, mes, anio);
        return Integer.toString(anios);
    }

    public String modificaCp(String cp) {
        String cPostal = "";

        while (cPostal.equals("")) {

            System.out.println(cp);

            cPostal = sc.nextLine();

            if (!cPostal.matches("[0-9 ]{5}")) {
                cPostal = "";
                System.out.println("Error escriba de nuevo");
            }
        }
        return cPostal;

    }

    public String modificaDireccion(String Direccion) {

        String direcc = "";

        while (direcc.equals("")) {
            System.out.println(Direccion);
            direcc = sc.nextLine();

            if (!direcc.matches("^[A-Za-zÑñáéíóúÁÉÍÓÚÏÜïü.0º1º2º3º4º5º6º7º8º9º0ª1ª2ª3ª4ª5ª6ª7ª8ª9ª  ]*$")) {

                direcc = "";
            }
        }
        return direcc;
    }

    public String modificaCiudad(String ciudad) {
        ciudad = modificaTexto(ciudad);
        return ciudad;

    }

    public String modificaProvincia(String provincia) {

        provincia = modificaTexto(provincia);

        return provincia;
    }

    public String modificaPais(String pais) {

        pais = modificaTexto(pais);
        return pais;

    }

    public String modificaTelefono(String telefono) {

        String s1 = "";

        while (s1.equals("")) {

            System.out.println(telefono);

            s1 = sc.nextLine();

            if (!s1.matches("[0-9 ]{9}")) {
                s1 = "";
                System.out.println("Error escriba de nuevo");
            }
        }
        return s1;
    }

    public String modificaEmail(String email) {

        String s1 = "";
        while (s1.equals("")) {

            System.out.println(email);

            s1 = sc.nextLine();

            if (!s1.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}")) {

                s1 = "";
            }
        }
        return s1;
    }

    public String modificaTexto(String texto) {

        String cadena = "";

        while (cadena.equals("")) {

            System.out.println(texto);
            cadena = sc.nextLine();
            if (!cadena.matches("^[A-Za-zÁÉÍÓÚáéíóú ñÑ]*$")) {

                cadena = "";
            }
        }
        return cadena;
    }

    public static int calculoEdad(int dia, int mes, int anio) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Period periodo = Period.between(fechaNacimiento, fechaHoy);

        return periodo.getYears();

    }

}
