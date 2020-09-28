package Xml;

import Interfaces.IDelegacionDAO;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import Clases.Delegaciones;
import Clases.Delegacion;
import DAO.DAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

public class XmlDelegacionDAO implements DAO<Delegacion> {
/*
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
        Delegaciones delegaciones = (Delegaciones) um.unmarshal(new File(nombreFichero));
        System.out.println();
        System.out.println("Estas son las delegaciones contenidas en el fichero " + nombreFichero);
        for (Delegacion delegacion : delegaciones.getDelegaciones()) {
            System.out.println();
            System.out.println("Id: \t" + delegacion.getId());
            System.out.println("Nombre: \t" + delegacion.getNombre());
        }
        return null;
    }
*/
    @Override
    public void crearNuevo(Delegacion t) throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Delegacion obtener(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Delegacion t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Delegacion t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Delegacion> obtenerTodos() throws JAXBException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
