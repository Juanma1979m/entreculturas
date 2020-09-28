package DAO;

import Clases.Delegacion;
import Clases.Equipo;
import Clases.Persona;

public abstract class DAOFactory {

    public static final int XML = 1;
    public static final int MYSQL = 2;

    
    
    public abstract DAO<Persona> getPersonaDAO();

    public abstract DAO<Equipo> getEquipoDAO();

    public abstract DAO<Delegacion> getDelegacionDAO();
    
    
    
    

    public static DAOFactory getDAOFactory(int whichFactory) {

        switch (whichFactory) {
            case XML:
                return new XmlDAOFactory();
             case MYSQL:
             return new MySqlDAOFactory();
            default:
                return null;
        }
    }
}
