package DAO;

import p5.Proyectos;
import javax.xml.bind.JAXBException;

public interface IProyectoDAO {
    public void Guardar(Proyectos proyectos) throws JAXBException;
    public Proyectos ListarProyectos() throws JAXBException;
}
