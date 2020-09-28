/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySql;

import Clases.Persona;
import Clases.Personas;
import DAO.DAO;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class MySqlPersonaDAO implements DAO<Persona> {

    Scanner sc = new Scanner(System.in);
    Utilidad conector = new Utilidad();
    ResultSet rs = null;
    static Personas personas = null;

    final String INSERT = "INSERT INTO personas( dni,nombre,apellidos,edad,direccion,provincia,pais,telefono,email) VALUES (?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE personas SET dni = ?, nombre = ?, apellidos = ?, edad = ?, direccion = ?, provincia =?, pais =?, telefono=?, email=? WHERE dni = ?";
    final String DELETE = "DELETE FROM personas WHERE id = ";
    final String GETALL = "SELECT * FROM personas";
    final String GETBYID = "SELECT * FROM personas WHERE id = ?";
    final String GETBYNAME = "SELECT * FROM personas WHERE nombre = ?";
    private String nombreFichero = "Personas.xml";

    public MySqlPersonaDAO() {

    }

    @Override
    public void crearNuevo(Persona t) throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException, SQLException {
        PreparedStatement stmt = null;
        Connection conn = conector.conectar();
        try {

            File file = new File(nombreFichero);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            builder = factory.newDocumentBuilder();
            Document xmlDoc = builder.parse(file);
            xmlDoc.getDocumentElement().normalize();

            System.out.print("Root : " + xmlDoc.getDocumentElement().getNodeName());
            NodeList nList = xmlDoc.getElementsByTagName("Persona");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node ppalNode = nList.item(temp);
                System.out.print("\nCurrent Elem :" + ppalNode.getNodeName());
                Element nElement = (Element) ppalNode;

                conn.setAutoCommit(false);
                stmt = conn.prepareStatement(INSERT);
                stmt.setString(1, getNodeContent(nElement, "dni"));
                stmt.setString(2, getNodeContent(nElement, "Nombre"));
                stmt.setString(3, getNodeContent(nElement, "Apellidos"));
                stmt.setString(4, getNodeContent(nElement, "Edad"));
                stmt.setString(5, getNodeContent(nElement, "Direccion"));
                stmt.setString(6, getNodeContent(nElement, "Provincia"));
                stmt.setString(7, getNodeContent(nElement, "Pais"));
                stmt.setString(8, getNodeContent(nElement, "Telefono"));
                stmt.setString(9, getNodeContent(nElement, "Email"));

                conector.creaTablaPersona();

                stmt.executeUpdate();
                conn.commit();
                System.out.println("Se ha añadido una nueva persona: \n" + t.getDni());
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

    static private String getNodeContent(Element elem, String etiqueta) {
        String content = elem.getElementsByTagName(etiqueta).item(0).getTextContent();
        System.out.print("\nCurrent : " + content);
        if (content == "") {
            System.out.println("No hay datos en para el valor :" + etiqueta + ". Imposible continuar. Todos los campos son obligatorios");
            return null;
        }
        return content;
    }

    @Override
    public Persona obtener(String id) {

    Connection conn = conector.conectar();

       Statement stm = null;

        String sql = GETALL;

       Persona persona=null;
        PreparedStatement stmt = null;
        try {
            stm = conn.createStatement();
            stmt.setString(0, id);
            rs = stm.executeQuery(sql);
            if (rs.next()) {
				persona = convertir(rs);
			}

            Utilidad.cierraRs(rs);
            Utilidad.cierraStat(stmt);

        } catch (SQLException e) {
            System.out.println("Error:método obtener");
            e.printStackTrace();
        }

        return persona;

    }

    @Override
    public void actualizar(Persona t, String[] params) {
    }

    @Override
    public void borrar(Persona t) {
        Connection conn = conector.conectar();
        int d = 0;

        try {

            Statement st = conn.createStatement();
            System.out.println("Introduzca Id a eliminar");
            d = sc.nextInt();

            st.execute(DELETE + d);

            System.out.println("El id " + d + " se ha eliminado correctamente");

        } catch (SQLException ex) {
            Logger.getLogger(MySqlPersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        conector.desconectar();

    }

    @Override
    public List<Persona> obtenerTodos() {
        Connection conn = conector.conectar();

        Statement stm = null;

        String sql = GETALL;

        List<Persona> p = new ArrayList<Persona>();
        PreparedStatement stmt = null;
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Estas son las personas que existen dentro de la base de datos\n" + "ID\t" + rs.getString("id") + "\n" + "DNI\t" + rs.getString("dni"));

            }

            Utilidad.cierraRs(rs);
            Utilidad.cierraStat(stmt);

        } catch (SQLException e) {
            System.out.println("Error:método obtener");
            e.printStackTrace();
        }

        return p;

    }

    private Persona convertir(ResultSet rs) throws SQLException {

        String dni = rs.getString("Dni");
        String nombre = rs.getString("Nombre");
        String apellidos = rs.getString("Apellidos");
        String edad = rs.getString("Edad");
        String direccion = rs.getString("Direccion");
        String provincia = rs.getString("Provincia");
        String pais = rs.getString("Pais");
        String telefono = rs.getString("Telefono");
        String email = rs.getString("email");

        Persona p = new Persona(dni, nombre, apellidos, edad, direccion, provincia, pais, telefono, email);

        return p;
    }

}
