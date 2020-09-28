/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySql;

import java.sql.SQLException;

/**
 *
 * @author juanm
 */
public class DAOException extends Exception {

    public DAOException(String error_al_acceder_a_los_datos, SQLException e) {
    }

   
    
}
