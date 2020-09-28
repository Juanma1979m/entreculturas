package p5;

import Clases.Equipo;
import Clases.Delegacion;
import Clases.Persona;
import DAO.DAOFactory;
import MySql.MySqlDelegacionDAO;
import MySql.MySqlEquipoDAO;
import MySql.MySqlPersonaDAO;
import Xml.XmlDelegacionDAO;
import Xml.XmlEquipoDAO;
import Xml.XmlPersonaDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/**
 *
 * @author Alejuancar
 */
/*public class P5 {

    static Scanner sc = new Scanner(System.in);
    static CreaObjetos in = new CreaObjetos();
    //static MySqlPersonaDAO my = new MySqlPersonaDAO();
    static Persona persona = null;
    static Delegacion delegaciones = null;
    static DAOFactory XMLDAOFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
    static DAOFactory MYSQLDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
    static XmlPersonaDAO xPersonaDAO = (XmlPersonaDAO) XMLDAOFactory.getPersonaDAO();
    static MySqlPersonaDAO mPersonaDAO = (MySqlPersonaDAO) MYSQLDAOFactory.getPersonaDAO();
    static XmlDelegacionDAO xDelegacionDAO = (XmlDelegacionDAO) XMLDAOFactory.getDelegacionDAO();
    static MySqlDelegacionDAO mDelegacionDAO = (MySqlDelegacionDAO) MYSQLDAOFactory.getDelegacionDAO();
    static XmlEquipoDAO xEquipoDAO = (XmlEquipoDAO) XMLDAOFactory.getEquipoDAO();
    static MySqlEquipoDAO mEquipoDAO = (MySqlEquipoDAO) MYSQLDAOFactory.getEquipoDAO();

    
  /*  @Override
    public void start(Stage stage) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Personal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.setTitle("ONGManager");
        //stage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        stage.setResizable(false);
        stage.show();
    }*/
  /*  static void inicializaPersonas() throws Exception {

        Persona p = new Persona();

        System.out.println("Introduzca nueva Persona");

        p.setDni(in.modificaDni(" Dni"));
        p.setNombres(in.modificaNombre("Nombre"));
        p.setApellidos(in.modificaApellidos("Apellidos"));
        p.setEdad(in.modificaEdad("Edad"));
        p.setDireccion(in.modificaDireccion("Direccion"));
        p.setProvincia(in.modificaProvincia("Provincia"));
        p.setPais(in.modificaPais("País"));
        p.setTelefono(in.modificaTelefono("Telefono"));
        p.setEmail(in.modificaEmail("Email"));

        xPersonaDAO.crearNuevo(p);
        mPersonaDAO.crearNuevo(p);

    }*/

 /*   static void inicializaDelegacion() throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException, SQLException {
        Delegacion deleg = new Delegacion();

        System.out.println("Introduzca Delegación");

        deleg.setId(in.modificaId("Id"));
        deleg.setNombre(in.modificaNombre("Nombre Delegación"));
        deleg.setDireccion(in.modificaDireccion("Dirección "));
        deleg.setCp(in.modificaCp("Código Postál"));
        deleg.setCiudad(in.modificaCiudad("Ciudad"));
        deleg.setProvincia(in.modificaProvincia("Provincia"));
        deleg.setPais(in.modificaPais("País"));
        deleg.setTelefono(in.modificaTelefono("Teléfono"));
        deleg.setEmail(in.modificaEmail("Email"));

        xDelegacionDAO.crearNuevo(deleg);
        mDelegacionDAO.crearNuevo(deleg);
    }*/

/*    static void inicializaEquipos() throws DNIException, JAXBException, Exception {
        Equipo equip = new Equipo();
        int i = 0;
        int N = 5;
        do {

            System.out.println("Introduzca 5 miembros para formar un Equipo  ");
        } while (N < i);
        for (i = 1; i <= N; i++) {

            System.out.println("Miembro " + i);
            equip.setId(in.modificaId("Id"));
            inicializaPersonas();

            if (i == 5) {
                inicializaDelegacion();

            }
        }
        xEquipoDAO.crearNuevo(equip);
        mEquipoDAO.crearNuevo(equip);
    }*/

 /*   static void subMenu() {
        System.out.println("¿Qué desea hacer?\n");

        System.out.println("1. Añadir");
        System.out.println("2. Eliminar");
        System.out.println("3. Buscar Todas");
        System.out.println("4. Buscar por Id");
        System.out.println("5. Salir");
    }*/

   
   

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
/*   public static void main(String[] args) throws Exception {

        //launch();
        int menu = 0;
        int subMenu = 0;
        do {
            System.out.println("--------------");
            System.out.println("1.  Personas");
            System.out.println("2.  Delegaciones");
            System.out.println("3.  Equipos");
            System.out.println("4.  Salir");
            System.out.println("--------------\n");

            menu = sc.nextInt();

            switch (menu) {

                case 1:

                    do {
                        subMenu();
                        subMenu = sc.nextInt();
                        switch (subMenu) {

                            case 1:
                                inicializaPersonas();

                                break;
                            case 2:

                                mPersonaDAO.borrar(persona);

                                break;

                            case 3:

                                xPersonaDAO.obtenerTodos();
                                mPersonaDAO.obtenerTodos();

                                break;

                            case 4: {
                              String id = null;
                              mPersonaDAO.obtener(id);
                            }

                            break;

                            default:

                                break;
                        }
                    } while (subMenu < 3);
                    break;

                case 2:
                    do {
                        subMenu();
                        subMenu = sc.nextInt();
                        switch (subMenu) {

                            case 1:
                                inicializaDelegacion();

                                break;
                            case 2:

                                mDelegacionDAO.borrar(delegaciones);

                                break;

                            case 3:

                                xDelegacionDAO.obtenerTodos();
                                mDelegacionDAO.obtenerTodos();

                                break;

                            case 4: {
                               // String id = null;
                                //my.obtener(id);
                            }

                            break;

                            default:

                                break;
                        }
                    } while (subMenu < 3);
                    break;

                case 3:
                    do {
                        subMenu();
                        subMenu = sc.nextInt();
                        switch (subMenu) {

                            case 1:
                                inicializaPersonas();

                                break;
                            case 2:

                                mPersonaDAO.borrar(persona);

                                break;

                            case 3:

                                xPersonaDAO.obtenerTodos();
                                mPersonaDAO.obtenerTodos();

                                break;

                            case 4: {
                               // String id = null;
                               // my.obtener(id);
                            }

                            break;

                            default:

                                break;
                        }
                    } while (subMenu < 3);
                    break;

            }
        } while (menu < 3);
    }*/
/*}

*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author juanm
 */
public class P5 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Persona.fxml"));
        Parent parent= loader.load();
        Scene scene =new Scene(parent);
        primaryStage.setScene(scene);
    }
    public static void main (String []args){
        launch(args);
        
    }
      
    
}



