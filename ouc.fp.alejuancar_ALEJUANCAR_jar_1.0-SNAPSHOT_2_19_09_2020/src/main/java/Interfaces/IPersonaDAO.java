package Interfaces;

import Clases.Personas;
import javax.xml.bind.JAXBException;

public interface IPersonaDAO {

    public void Guardar(Personas personas) throws JAXBException;

    public Personas ListarPersonas() throws JAXBException;
}
