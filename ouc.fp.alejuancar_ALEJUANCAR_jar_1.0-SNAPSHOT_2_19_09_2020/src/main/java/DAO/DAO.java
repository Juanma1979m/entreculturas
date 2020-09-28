/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/**
 *
 * @author juanm
 */
public interface DAO <T>{
    
    public void crearNuevo(T t) throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException, SQLException;
    
	/**
	 * Metodo para obtener un objeto persistido.
	 * 
	 * @param id Identificador unico del objeto.
	 * @return Objeto persistido.
	 */
    public T obtener(String id); 
    
	/**
	 * Metodo para actualizar un objeto persistido.
	 * 
	 * @param t Objeto a actualizar.
	 * @param params Parametros del objeto a modificar.
	 */
    public void actualizar(T t, String[] params);
    
	/**
	 * Metodo para borrar un objeto persistido.
	 * 
	 * @param t Objeto a borrar.
	 */
    public void borrar(T t);
    
	/**
	 * Metodo para recuperar todos los objetos persistidos de un tipo.
	 * 
	 * @return Listado con los objetos persistidos.
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
    public List<T> obtenerTodos() throws JAXBException;

}
