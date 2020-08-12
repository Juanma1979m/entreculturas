/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author juanm
 */
class DNIException extends Exception {
    private static final long serialVersionUID = 1L;
		public static final String LONGITUD_NO_CORRECTA="La longitud debe de estar entre 8 y 9";
		public static final String PARTE_NUMERICA_NO_CORRECTA="La parte numerica del DNI debe ser un numero";
		public static final String PARTE_LETRA_NO_CORRECTA="La parte de la letra  debe ser una letra entre 'A' y 'Z' ";
		public static final String FORMATO_NO_CORRECTO="El DNI no tiene el formato adecuado, la letra no corresponde con el número ";

		public DNIException(String mensaje) {
			super(mensaje);
		}

}
