/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import Clases.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanm
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDni method, of class Persona.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Persona instance = new Persona("53407548V","","","","","","","","");
        String expResult = "53407548V";
        String result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Persona.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Persona instance = new Persona("","Juan Manuel","","","","","","","");
        String expResult = "Juan Manuel";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Persona.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Persona instance = new Persona("","","Martín Martín","","","","","","");
        String expResult = "Martín Martín";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Persona.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona instance = new Persona("","","","","","","","","");
        int expResult = 41;
        String result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

   
    /**
     * Test of getDireccion method, of class Persona.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Persona instance = new Persona("","","","","Calle La Sal Nº2","","","","");
        String expResult = "Calle La Sal Nº2";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

   
    /**
     * Test of getProvincia method, of class Persona.
     */
    @Test
    public void testGetProvincia() {
        System.out.println("getProvincia");
        Persona instance = new Persona("","","","","","Segovia","","","");
        String expResult = "Segovia";
        String result = instance.getProvincia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class Persona.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Persona instance = new Persona("","","","","","","España","","");
        String expResult = "España";
        String result = instance.getPais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Persona instance = new Persona("","","","","","","","666666666","");
        String expResult = "666666666";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getEmail method, of class Persona.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Persona instance = new Persona("","","","","","","","","jmmm@uoc.com");
        String expResult = "jmmm@uoc.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
