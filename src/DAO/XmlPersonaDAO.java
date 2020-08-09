package DAO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import p5.Personas;
import p5.Persona;

public class XmlPersonaDAO implements IPersonaDAO {
    private JAXBContext jaxbContext = null;
    private String nombreFichero = null;
    
    public XmlPersonaDAO() throws JAXBException {
        this.jaxbContext = JAXBContext.newInstance(Personas.class);
        this.nombreFichero = "Personas.xml";
    }
    
    @Override
    public void Guardar(Personas personas) throws JAXBException {
        Marshaller ms = jaxbContext.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ms.marshal(personas, new File(nombreFichero));
        System.out.println();
        System.out.println("Se ha escrito el fichero " + nombreFichero + " con el siguiente contenido:");
        System.out.println();
        ms.marshal(personas, System.out);
    }
    
    @Override
    public Personas ListarPersonas() throws JAXBException {
        Unmarshaller um = jaxbContext.createUnmarshaller();
        Personas personas = (Personas)um.unmarshal(new File(nombreFichero));
        System.out.println();
        System.out.println("Estas son las personas contenidas en el fichero " + nombreFichero);
        for(Persona persona : personas.getPersonas()) {
            System.out.println();
            System.out.println("Dni: \t" + persona.getDni());
            System.out.println("Nombre: \t" + persona.getNombre());
            System.out.println("Apellidos: \t" + persona.getApellidos());
        }
        return null;
    }
}
