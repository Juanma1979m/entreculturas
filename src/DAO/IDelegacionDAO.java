package DAO;

import p5.Delegaciones;
import javax.xml.bind.JAXBException;

public interface IDelegacionDAO {
    public void Guardar(Delegaciones delegaciones) throws JAXBException;
    public Delegaciones ListarDelegaciones() throws JAXBException;
}
