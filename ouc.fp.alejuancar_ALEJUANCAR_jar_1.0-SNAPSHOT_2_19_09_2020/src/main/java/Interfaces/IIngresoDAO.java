package Interfaces;

import Clases.Ingresos;
import javax.xml.bind.JAXBException;

public interface IIngresoDAO {

    public void Guardar(Ingresos ingresos) throws JAXBException;

    public Ingresos ListarIngresos() throws JAXBException;
}
