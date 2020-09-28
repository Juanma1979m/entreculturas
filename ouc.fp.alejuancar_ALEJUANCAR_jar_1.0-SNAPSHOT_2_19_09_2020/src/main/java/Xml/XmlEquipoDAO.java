/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xml;

import Interfaces.IEquipoDAO;
import java.io.File;
import javax.xml.bind.*;
import Clases.Equipo;
import Clases.Equipos;
import Clases.Persona;
import DAO.DAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/**
 *
 * @author juanm
 */
public class XmlEquipoDAO implements DAO<Equipo> {
/*
    private JAXBContext jaxbContext = null;
    private String nombreFichero = null;

    public XmlEquipoDAO() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Equipos.class);
        this.nombreFichero = "Equipos.xml";
    }

    /**
     *
     * @param equipos
     * @throws JAXBException
     */
/*    @Override
    public void Guardar(Equipos equipos) throws JAXBException {
        Marshaller ms = jaxbContext.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ms.marshal(equipos, new File(nombreFichero));
        System.out.println();
        System.out.println("Se ha escrito el fichero " + nombreFichero + " con el siguiente contenido:");
        System.out.println();
        ms.marshal(equipos, System.out);
    }

    @Override
    public Equipos ListarEquipos() throws JAXBException {
        Unmarshaller um = jaxbContext.createUnmarshaller();
        Equipos equipos = (Equipos) um.unmarshal(new File(nombreFichero));
        System.out.println();
        System.out.println("Estas son las personas contenidas en el fichero " + nombreFichero);
        for (Equipo equipo : equipos.getEquipos()) {
            System.out.println();
            System.out.println("Dni: \t" + equipo.getDni());
            System.out.println("Nombre: \t" + equipo.getNombres());
            System.out.println("Apellidos: \t" + equipo.getApellidos());
        }
        System.out.println();
        System.out.println("Estas son las personas contenidas en el fichero " + nombreFichero);
        for (Equipo equipo : equipos.getEquipos()) {
            System.out.println();
            System.out.println("Dni: \t" + equipo.getDni());
            System.out.println("Nombre: \t" + equipo.getNombres());
            System.out.println("Apellidos: \t" + equipo.getApellidos());
        }
        return null;
    }
*/
    

    @Override
    public void crearNuevo(Equipo t) throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Equipo t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Equipo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Equipo obtener(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipo> obtenerTodos() throws JAXBException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
