package DAO;

import javax.xml.bind.JAXBException;

public abstract class DAOFactory {
    public static final int XML = 1;
    public static final int MYSQL = 2;

		// Debe haber un método por cada DAO que pueda ser creado.
		// La factoría concreta para cada tipo deberá implementar
		// el método que le corresponde.

    

    public abstract XmlDelegacionDAO getDelegacionDAO() throws JAXBException;
    public abstract XmlPersonaDAO getPersonaDAO() throws JAXBException;
    public abstract XmlIngresoDAO getIngresoDAO() throws JAXBException;
    public abstract XmlProyectoDAO getProyectoDAO() throws JAXBException;
    
    public static DAOFactory getDAOFactory(int whichFactory) {

			switch (whichFactory) {
			case XML:
				return new XmlDAOFactory();
			// case MYSQL:
			// return new MySqlDAOFactory();
			default:
				return null;
			}
    }
}
