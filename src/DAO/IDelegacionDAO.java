package DAO;

import p5.Delegacion;
import javax.xml.bind.JAXBException;

public interface IDelegacionDAO {
    public void Guardar(Delegacion miDelegacion) throws JAXBException;
    public Delegacion ListarDelegaciones() throws JAXBException;
}
