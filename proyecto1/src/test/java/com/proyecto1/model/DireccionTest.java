package com.proyecto1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DireccionTest {

    private Direccion direccion;

    @BeforeEach
    public void setUp() {
        direccion = new Direccion("Av. Principal", "Centro", "Ciudad");
    }

    @Test
    void testGetCalle() {
        assertEquals("Av. Principal", direccion.getCalle());
    }

    @Test
    void testSetCalle() {
        direccion.setCalle("Calle Nueva");
        assertEquals("Calle Nueva", direccion.getCalle());
    }

    @Test
    void testGetBarrio() {
        assertEquals("Centro", direccion.getBarrio());
    }

    @Test
    void testSetBarrio() {
        direccion.setBarrio("Barrio Nuevo");
        assertEquals("Barrio Nuevo", direccion.getBarrio());
    }

    @Test
    void testGetCiudad() {
        assertEquals("Ciudad", direccion.getCiudad());
    }

    @Test
    void testSetCiudad() {
        direccion.setCiudad("Otra Ciudad");
        assertEquals("Otra Ciudad", direccion.getCiudad());
    }

}