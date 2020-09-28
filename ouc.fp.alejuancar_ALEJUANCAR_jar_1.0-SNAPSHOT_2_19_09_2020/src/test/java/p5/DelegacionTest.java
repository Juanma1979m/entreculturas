/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import Clases.Delegacion;
import Clases.Equipos;
import java.util.ArrayList;
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
public class DelegacionTest {
    
    public DelegacionTest() {
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
     * Test of getId method, of class Delegacion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Equipos equipos = null;
        Delegacion instance = new Delegacion("11-MADR","","","","","","","","");
        String expResult = "11-MADR";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getDireccion method, of class Delegacion.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Equipos equipos = null;
        Delegacion instance = new Delegacion("","","Madrid","","","","","","");
        String expResult = "Madrid";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of getCp method, of class Delegacion.
     */
    @Test
    public void testGetCp() {
        System.out.println("getCp");
        Equipos equipos = null;
        Delegacion instance = new Delegacion("","","","28700","","","","","");
        String expResult = "28700";
        String result = instance.getCp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of getCiudad method, of class Delegacion.
     */
    @Test
    public void testGetCiudad() {
        System.out.println("getCiudad");
        Equipos equipos = null;
        Delegacion instance = new Delegacion("","","","","Madrid","","","","");
        String expResult = "Madrid";
        String result = instance.getCiudad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of getProvincia method, of class Delegacion.
     */
    @Test
    public void testGetProvincia() {
        System.out.println("getProvincia");
        Equipos equipos = null;
        Delegacion instance = new Delegacion("","","","","","Madrid","","","");
        String expResult = "Madrid";
        String result = instance.getProvincia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getPais method, of class Delegacion.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Equipos equipos = null;
        Delegacion instance = new Delegacion("","","","","","","España","","");
        String expResult = "España";
        String result = instance.getPais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of getTelefono method, of class Delegacion.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Equipos equipos = null;
        Delegacion instance = new Delegacion("","","","","","","","666666666","");
        String expResult = "666666666";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of getEmail method, of class Delegacion.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Equipos equipos = null;
        Delegacion instance = new Delegacion("","","","","","","","","juan@ong.es");
        String expResult = "juan@ong.es";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getEquipo method, of class Delegacion.
     */
   /* @Test
    public void testGetEquipo() {
        System.out.println("getEquipo");
        Equipos equipos = new Equipos();
        Delegacion instance = new Delegacion("","","","","","","","","",equipos);
        ArrayList<Equipos> expResult = null;
        ArrayList<Equipos> result = instance.getEquipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    
    /**
     * Test of getNombre method, of class Delegacion.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
       Equipos equipos = new Equipos();
        Delegacion instance = new Delegacion("","Bara","","","","","","","");
        String expResult = "Bara";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
