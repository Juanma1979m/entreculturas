package DAO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import p5.Proyectos;
import p5.Proyecto;

public class XmlProyectoDAO implements IProyectoDAO {
    private JAXBContext jaxbContext = null;
    private String nombreFichero = null;
    
    public XmlProyectoDAO() throws JAXBException {
        this.jaxbContext = JAXBContext.newInstance(Proyectos.class);
        this.nombreFichero = "Proyectos.xml";
    }
    
    @Override
    public void Guardar(Proyectos proyectos) throws JAXBException {
        Marshaller ms = jaxbContext.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ms.marshal(proyectos, new File(nombreFichero));
        System.out.println();
        System.out.println("Se ha escrito el fichero " + nombreFichero + " con el siguiente contenido:");
        System.out.println();
        ms.marshal(proyectos, System.out);
    }
    
    @Override
    public Proyectos ListarProyectos() throws JAXBException {
        Unmarshaller um = jaxbContext.createUnmarshaller();
        Proyectos proyectos = (Proyectos)um.unmarshal(new File(nombreFichero));
        System.out.println();
        System.out.println("Estas son las personas contenidas en el fichero " + nombreFichero);
        for(Proyecto proyecto : proyectos.getProyectos()) {
            System.out.println();
            System.out.println("Id: \t" + proyecto.getId());
            System.out.println("Localidad: \t" + proyecto.getLocalidad());
            System.out.println("Linea de accion: \t" + proyecto.getLineaAccion());
        }
        return null;
    }
}
