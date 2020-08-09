package DAO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import p5.Delegaciones;
import p5.Delegacion;

public class XmlDelegacionDAO implements IDelegacionDAO {
    private JAXBContext jaxbContext = null;
    private String nombreFichero = null;
    
    public XmlDelegacionDAO() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Delegaciones.class);
        nombreFichero = "Delegaciones.xml";
    }
    
    @Override
    public void Guardar(Delegaciones delegaciones) throws JAXBException {
        Marshaller ms = jaxbContext.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ms.marshal(delegaciones, new File(nombreFichero));
        System.out.println();
        System.out.println("Se ha escrito el fichero " + nombreFichero + " con el siguiente contenido:");
        System.out.println();
        ms.marshal(delegaciones, System.out);
    }
    
    @Override
    public Delegaciones ListarDelegaciones() throws JAXBException {
        Unmarshaller um = jaxbContext.createUnmarshaller();
        Delegaciones delegaciones = (Delegaciones)um.unmarshal(new File(nombreFichero));
        System.out.println();
        System.out.println("Estas son las delegaciones contenidas en el fichero " + nombreFichero);
        for(Delegacion delegacion : delegaciones.getDelegaciones()) {
            System.out.println();
            System.out.println("Id: \t" + delegacion.getId());
            System.out.println("Nombre: \t" + delegacion.getNombre());
        }
        return null;
    }
}
