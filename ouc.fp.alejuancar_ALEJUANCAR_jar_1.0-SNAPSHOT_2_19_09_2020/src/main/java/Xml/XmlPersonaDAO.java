package Xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import Clases.Personas;
import Clases.Persona;
import DAO.DAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

public class XmlPersonaDAO implements DAO<Persona> {

    private Personas listaPersonas = new Personas();
    private JAXBContext jaxbContext = null;
    private String nombreFichero = null;
    private String ficheroPersonal=null;

    public XmlPersonaDAO()  {
        
        this.nombreFichero = "Personas.xml";
        this.ficheroPersonal="Personal.xml";
    }

    public XmlPersonaDAO(Personas listaPersonas) {
        super();
        this.listaPersonas = listaPersonas;
    }

    public Personas getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Personas listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public void crearNuevo(Persona t) throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException, SQLException {
        listaPersonas.add(t);

        jaxbContext = JAXBContext.newInstance(Persona.class);
        Marshaller ms = jaxbContext.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ms.marshal(t, new File(nombreFichero));
        System.out.println();
        System.out.println("Se ha escrito el fichero " + nombreFichero + " con el siguiente contenido:");
        System.out.println();
        ms.marshal(t, System.out);

    }

    @Override
    public Persona obtener(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Persona t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Persona t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> obtenerTodos() throws JAXBException {

        if (listaPersonas.getPersonas() != null) {
            if (listaPersonas.getPersonas().size() > 1) {
                System.out.println("El fichero cuenta con  " + listaPersonas.getPersonas().size() + " Personas:");
            }
            if (listaPersonas.getPersonas().size() == 1) {
                System.out.println("El fichero cuenta con " + listaPersonas.getPersonas().size() + " persona:");
            }
            for (Persona t : listaPersonas.getPersonas()) {
                System.out.println(t.toString());
            }

            JAXBContext context = JAXBContext.newInstance(Personas.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(listaPersonas, new File(ficheroPersonal));

        } else {
            System.out.println("La lista de trabajadores está vacía.");
        }
        return listaPersonas.getPersonas();

    }

}

