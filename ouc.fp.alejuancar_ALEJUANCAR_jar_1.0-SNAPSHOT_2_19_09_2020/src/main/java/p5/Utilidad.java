/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanm
 */
public class Utilidad {
     public static Connection conectar = null;

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String usuario = "root";
    private static final String passwd = "root_1234";
    private static final String url = "jdbc:mysql://localhost:3306/juanma?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection conectar() {
        try {
            Class.forName(driver);
            conectar = DriverManager.getConnection(url, usuario, passwd);
            System.out.println("Conexión correcta");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se ha conectado\n" + e);
        }
        return conectar;
    }

    public void desconectar() {
        if (conectar != null) {
            try {
                conectar.close();
                conectar = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void cierraStat(PreparedStatement stat) throws SQLException {

        if (stat != null) {
            try {

                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void cierraRs(ResultSet rs) throws SQLException {

        if (rs != null) {
            try {

                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void creaTablaPersona() throws SQLException {

        conectar.createStatement()
                .execute("CREATE TABLE if not exists Personas(\n"
                        + " id integer primary key auto_increment,\n"
                        + " dni varchar(25) not null unique REFERENCES Delegacion(Id),\n"
                        + " nombre varchar(50) not null,\n"
                        + " apellidos varchar(250) not null,\n"
                        + " edad varchar(25) not null,\n"
                        + " direccion varchar(25) not null,\n"
                        + " provincia varchar (25)  not null,\n"
                        + " pais varchar (25)  not null,\n"
                        + " telefono varchar (25) not null,\n"
                        + " email varchar (25) not null\n"
                        + ")");
    }

    public void creaTablaDelegacion() throws SQLException {
        conectar.createStatement()
                .execute(" CREATE TABLE IF NOT EXISTS Delegacion(\n"
                        + " Id INT PRIMARY KEY auto_increment,\n"
                        + " Identificador Varchar (4)\n"
                        + " Nombre VARCHAR(30),\n"
                        + " Direccion VARCHAR(40),\n"
                        + " Cp VARCHAR(10),\n"
                        + " Ciudad VARCHAR(30),\n"
                        + " Provincia VARCHAR(20),\n"
                        + " Pais VARCHAR(20),\n"
                        + " Telefono VARCHAR(15),\n"
                        + " Email VARCHAR(30) \n"
                        + ")");
    }

    public void creaTablaSocios() throws SQLException {
        conectar.createStatement()
                .execute("CREATE TABLE IF NOT EXISTS Socios(\n"
                        + "Id INT PRIMARY KEY,\n"
                        + "    Dni VARCHAR(15),\n"
                        + "    Nombre VARCHAR(20),\n"
                        + "    Apellidos VARCHAR(30),\n"
                        + "    Edad INT,\n"
                        + "    Direccion VARCHAR(40),\n"
                        + "    Cp VARCHAR(10),\n"
                        + "	Ciudad VARCHAR(30),\n"
                        + "    Provincia VARCHAR(20),\n"
                        + "    Pais VARCHAR(20),\n"
                        + "    Telefono VARCHAR(15),\n"
                        + "    Email VARCHAR(30),\n"
                        + "    TipoCuota CHAR(1),\n"
                        + "    ImporteCuota DECIMAL\n"
                        + ")");

    }
    
}
