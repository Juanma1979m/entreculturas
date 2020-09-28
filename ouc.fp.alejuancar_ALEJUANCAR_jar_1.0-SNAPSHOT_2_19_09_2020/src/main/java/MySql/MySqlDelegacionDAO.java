/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySql;

import Clases.Delegacion;
import DAO.DAO;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import p5.Utilidad;

/**
 *
 * @author juanm
 */
public class MySqlDelegacionDAO implements DAO<Delegacion> {

    Scanner sc = new Scanner(System.in);
    Utilidad conector = new Utilidad();
    Connection conn = conector.conectar();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    static Delegacion delegacion = null;

    final String INSERT = "INSERT INTO delegaciones( dni,nombre,apellidos,edad,direccion,provincia,pais,telefono,email) VALUES (?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE delegaciones SET dni = ?, nombre = ?, apellidos = ?, edad = ?, direccion = ?, provincia =?, pais =?, telefono=?, email=? WHERE dni = ?";
    final String DELETE = "DELETE FROM delegaciones WHERE id = ";
    final String GETALL = "SELECT * FROM delegaciones";
    final String GETBYID = "SELECT * FROM delegaciones WHERE id = ?";
    final String GETBYNAME = "SELECT * FROM delegaciones WHERE nombre = ?";
    private String nombreFichero = "Delegaciones.xml";

    public MySqlDelegacionDAO() {

    }

    @Override
    public void crearNuevo(Delegacion t) throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException, SQLException {

        try {

            File file = new File(nombreFichero);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            builder = factory.newDocumentBuilder();
            Document xmlDoc = builder.parse(file);
            xmlDoc.getDocumentElement().normalize();

            System.out.print("Root : " + xmlDoc.getDocumentElement().getNodeName());
            NodeList nList = xmlDoc.getElementsByTagName("Delegacion");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node ppalNode = nList.item(temp);
                System.out.print("\nCurrent Elem :" + ppalNode.getNodeName());
                Element nElement = (Element) ppalNode;

                conn.setAutoCommit(false);
                stmt = conn.prepareStatement(INSERT);

                stmt.setString(1, getNodeContent(nElement, "Identificador "));
                stmt.setString(2, getNodeContent(nElement, "Nombre"));
                stmt.setString(3, getNodeContent(nElement, "Direccion"));
                stmt.setString(4, getNodeContent(nElement, "Codigo Postal"));
                stmt.setString(5, getNodeContent(nElement, "Ciudad"));
                stmt.setString(6, getNodeContent(nElement, "Provincia"));
                stmt.setString(7, getNodeContent(nElement, "Pais"));
                stmt.setString(8, getNodeContent(nElement, "Telefono"));
                stmt.setString(9, getNodeContent(nElement, "Email"));

                conector.creaTablaDelegacion();
                conector.creaTablaPersona();

                stmt.executeUpdate();
                conn.commit();

                System.out.println("Se ha añadido una nueva Delegación: \n" + t.getId());
            }
        } catch (Exception ex) {
            System.out.println("error" + ex.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            conector.desconectar();

        }

    }

    @Override
    public Delegacion obtener(String id
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Delegacion t, String[] params
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Delegacion t
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Delegacion> obtenerTodos() throws JAXBException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNodeContent(Element elem, String etiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
