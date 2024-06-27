/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pedro
 */
public class ProdutosDTOTest {
    
    public ProdutosDTOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class ProdutosDTO.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ProdutosDTO instance = new ProdutosDTO();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class ProdutosDTO.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        ProdutosDTO instance = new ProdutosDTO();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class ProdutosDTO.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        ProdutosDTO instance = new ProdutosDTO();
        Integer expResult = null;
        Integer result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class ProdutosDTO.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ProdutosDTO instance = new ProdutosDTO();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ProdutosDTO.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        ProdutosDTO instance = new ProdutosDTO();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class ProdutosDTO.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ProdutosDTO instance = new ProdutosDTO();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class ProdutosDTO.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Integer valor = null;
        ProdutosDTO instance = new ProdutosDTO();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class ProdutosDTO.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        ProdutosDTO instance = new ProdutosDTO();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
