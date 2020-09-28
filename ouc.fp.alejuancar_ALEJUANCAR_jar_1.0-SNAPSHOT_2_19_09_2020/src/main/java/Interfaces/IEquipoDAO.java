package Interfaces;

import javax.xml.bind.JAXBException;
import Clases.Equipos;

/**
 *
 * @author juanm
 */
public interface IEquipoDAO {

    public void Guardar(Equipos equipos) throws JAXBException;

    public Equipos ListarEquipos() throws JAXBException;

}
