/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Delegacion;
import Clases.Equipo;
import Clases.Persona;
import MySql.MySqlDelegacionDAO;
import MySql.MySqlEquipoDAO;
import MySql.MySqlPersonaDAO;

/**
 *
 * @author juanm
 */
public class MySqlDAOFactory extends DAOFactory {

    @Override
    public DAO<Persona> getPersonaDAO() {
        return new MySqlPersonaDAO();
      
    }

    @Override
    public DAO<Equipo> getEquipoDAO() {
        return new MySqlEquipoDAO();

    }

    @Override
    public DAO<Delegacion> getDelegacionDAO() {
        return new MySqlDelegacionDAO();
    }

}
