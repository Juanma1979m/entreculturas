package DAO;

import Clases.Delegacion;
import Clases.Equipo;

import Clases.Persona;
import Xml.XmlDelegacionDAO;
import Xml.XmlEquipoDAO;
import Xml.XmlPersonaDAO;

public class XmlDAOFactory extends DAOFactory {

    @Override
    public DAO<Equipo> getEquipoDAO() {
        return new XmlEquipoDAO();
    }

    @Override
    public DAO<Delegacion> getDelegacionDAO() {
        return new XmlDelegacionDAO();
    }

    @Override
    public DAO<Persona> getPersonaDAO() {

     
            return new XmlPersonaDAO();
    }

}
