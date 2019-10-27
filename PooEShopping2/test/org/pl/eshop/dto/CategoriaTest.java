/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.dto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.pl.eshop.dto.Categoria;


/**
 *
 * @author Daniel
 */
public class CategoriaTest {
    
    public CategoriaTest() {
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
     * Test of setId method, of class Categoria.
     */
    @Test (expected = IllegalArgumentException.class)
    public void positiveId() {
        Categoria categoria = new Categoria();
        categoria.setId(0);
    }
    
    /**
     * Test of setId method, of class Categoria.
     */
    @Test (expected = IllegalArgumentException.class)
    public void nullId() {
        Categoria categoria = new Categoria();
        categoria.setId(null);
    }
    
    /**
     * Test of setName method, of class Categoria.
     */
    @Test (expected = IllegalArgumentException.class)
    public void emptyName() {
        Categoria categoria = new Categoria();
        categoria.setNombre("");
    }
    
    /**
     * Test of setName method, of class Categoria.
     */
    @Test (expected = IllegalArgumentException.class)
    public void nullName() {
        Categoria categoria = new Categoria();
        categoria.setNombre(null);
    }
    
    /**
     * Test of setName method, of class Categoria.
     */
    @Test (expected = IllegalArgumentException.class)
    public void lesThanTreeCharacters() {
        Categoria categoria = new Categoria();
        categoria.setNombre("c");
    }
    
    /**
     * Test of getName method, of class Categoria.
     */
    @Test
    public void emptyDefaultName() {
        Categoria categoria = new Categoria();
        assertEquals(categoria.getNombre(), "");
    }
}
