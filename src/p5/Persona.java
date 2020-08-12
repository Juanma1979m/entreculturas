package p5;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Persona")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {
	@XmlAttribute(name = "dni")
	protected String dni;
	@XmlAttribute(name = "Nombre")
	protected String nombres;
	@XmlAttribute(name = "Apellidos")
	protected String apellidos;
	@XmlAttribute(name = "Edad")
	protected int edad;
	@XmlAttribute(name = "Direccion")
	protected String direccion;
	@XmlAttribute(name = "Provincia")
	protected String provincia;
	@XmlAttribute(name = "Pais")
	protected String pais;
	@XmlAttribute(name = "Telefono")
	protected String telefono;
	@XmlAttribute(name = "Email")
	protected String email;
	
	public Persona(String dni,String nombres,String apellidos,
			int edad, String direccion, String provincia, 
			String pais, String telefono, String email) {
		super();
		this.dni=dni; 
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.edad=edad;
		this.direccion=direccion;
		this.provincia=provincia;
		this.pais=pais;
		this.telefono=telefono;
		this.email=email;
		
	}
	public Persona() {
		super();
	}
	/**
	 * @return el dni
	 */
	//@XmlElement(name="dni")
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni el dni a establecer
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

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

	/**
	 * @return el edad
	 */
	//@XmlElement(name="edad")
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

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
		return "El DNI introducido es\n :" + dni +"\n" + "El nombre es:\n " + nombres + "\n" + "El apellido es:\n " + apellidos+ "\n" + "su edad es : \n" + edad + "\n" +"La dirección es:\n" + direccion + "\t" + provincia + "\t" + pais + "\n" + "su teléfono:\n" + telefono + "\n" + "y su email:\n " + email + "\n" ;
	}	
}
