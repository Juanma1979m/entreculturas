package DAO;

import javax.xml.bind.JAXBException;

public class XmlDAOFactory extends DAOFactory {
    public XmlDelegacionDAO getDelegacionDAO() throws JAXBException {
        return new XmlDelegacionDAO();
    }
    
    public XmlPersonaDAO getPersonaDAO() throws JAXBException {
        return new XmlPersonaDAO();
    }
    
    public XmlIngresoDAO getIngresoDAO() throws JAXBException {
        return new XmlIngresoDAO();
    }
    
    public XmlProyectoDAO getProyectoDAO() throws JAXBException {
        return new XmlProyectoDAO();
    }
}
