/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao_persistencia.PersonasDao;
import entidades.Personas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author juanm
 */
public class PersonaController implements Initializable {

    @FXML
    private ListView<Personas> lsvPersonas;
    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnMofificar;
    @FXML
    private Button btnEliminar;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtProvincia;
    @FXML
    private TextField txtPais;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtDni;
    @FXML
    private TextField txtEmail;
    @FXML
    private Button btnLimp;
    @FXML
    private Button btntAdd;

    private final ObservableList<Personas> personasLista = FXCollections.observableArrayList();
    private final PersonasDao personaDao = new PersonasDao();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        lsvPersonas.setItems(personasLista);
        personasLista.addAll(personaDao.getAllPersonas());

        lsvPersonas.setCellFactory(new Callback<ListView<Personas>, ListCell<Personas>>() {
            @Override
            public ListCell<Personas> call(ListView<Personas> param) {

                ListCell<Personas> listCell = new ListCell() {
                    @Override
                    public void updateItem(Object item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {
                            Personas personas = (Personas) item;
                            setText(personas.getNombre());
                        } else {
                            setText("");
                        }
                    }
                };
                return listCell;
            }
        });

    }

}

