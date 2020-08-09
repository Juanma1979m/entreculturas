package DAO;

import p5.Equipo;
import javax.xml.bind.JAXBException;

public interface IEquipoDAO {
    public void Guardar(Equipo equipos) throws JAXBException;
    public Equipo ListarEquipo() throws JAXBException;
}