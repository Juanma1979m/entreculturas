/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Clases.Persona;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author juanm
 */
public class PersonalController implements Initializable {

    @FXML
	private TableView<Persona> table;
	@FXML
	private TableColumn<Persona, Integer> idPersona = new TableColumn<>("Id");
	@FXML
	private TableColumn<Persona, String> nombre  = new TableColumn<>("DNI");
	@FXML
	private TableColumn<Persona, String> apellidos  = new TableColumn<>("Nombre");
	@FXML
	private TableColumn<Persona, String> nif = new TableColumn<>("Apellidos");
	@FXML
	private TableColumn<Persona, String> email = new TableColumn<>("Edad");
	@FXML
	private TableColumn<Persona, String> telefono = new TableColumn<>("Dirección");
	@FXML
	private TableColumn<Persona, String> direccion = new TableColumn<>("Provincia");
	@FXML
	private TableColumn<Persona, Integer> delegacion = new TableColumn<>("Pais");
	@FXML
	private TableColumn<Persona, Date> antiguedad = new TableColumn<>("Teléfono");
	@FXML
	private TableColumn<Persona, String> horarioLaboral = new TableColumn<>("Email");
		
        @FXML
	private Button botonEditar;
	
	@FXML
	private Button botonCancelar;
        
        public ObservableList<Persona> getPersonas() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ONGUnit");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Persona> lt = entityManager.createQuery("from Trabajador").getResultList();
		ObservableList<Persona> trabajadores = FXCollections.observableArrayList(lt);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		return trabajadores;
	}
        
        public void editarTrabajador(ActionEvent event) {
		System.out.println("Vas a editar un trabajador.");
	}
	
	
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //idTrabajador.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("idTrabajador"));
		nombre.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
		apellidos.setCellValueFactory(new PropertyValueFactory<Persona, String>("apellidos"));
		nif.setCellValueFactory(new PropertyValueFactory<Persona, String>("id"));
		telefono.setCellValueFactory(new PropertyValueFactory<Persona, String>("telefono"));
		direccion.setCellValueFactory(new PropertyValueFactory<Persona, String>("direccion"));
		email.setCellValueFactory(new PropertyValueFactory<Persona, String>("email"));
		antiguedad.setCellValueFactory(new PropertyValueFactory<Persona, Date>("antiguedad"));
		delegacion.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("delegacionAsignada"));
		horarioLaboral.setCellValueFactory(new PropertyValueFactory<Persona, String>("horarioLaboral"));
		//pass.setCellValueFactory(new PropertyValueFactory<Persona, String>("pass"));
		table.setItems(getPersonas());
    }    
    
}
