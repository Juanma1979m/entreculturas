package DAO;

import javax.xml.bind.JAXBException;

public abstract class DAOFactory {
    public abstract XmlDelegacionDAO getDelegacionDAO() throws JAXBException;
    public abstract XmlPersonaDAO getPersonaDAO() throws JAXBException;
    public abstract XmlIngresoDAO getIngresoDAO() throws JAXBException;
    public abstract XmlProyectoDAO getProyectoDAO() throws JAXBException;
}
