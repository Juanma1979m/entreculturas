package DAO;

import p5.Persona;
import javax.xml.bind.JAXBException;

public interface IPersonaDAO {
    public void Guardar(Persona miPersona) throws JAXBException;
    public Persona ListarPersonas() throws JAXBException;
}
