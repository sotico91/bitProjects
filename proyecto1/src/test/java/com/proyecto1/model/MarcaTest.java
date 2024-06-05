package com.proyecto1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarcaTest {

    private Marca marca;

    @BeforeEach
    public void setUp() {
        marca = new Marca("Toyota", 10, 1937, "T");
    }

    @Test
    void testGetNombre() {
        assertEquals("Toyota", marca.getNombre());
    }

    @Test
    void testSetNombre() {
        marca.setNombre("Honda");
        assertEquals("Honda", marca.getNombre());
    }

    @Test
    void testGetNrDeModelos() {
        assertEquals(10, marca.getNrDeModelos());
    }

    @Test
    void testSetNrDeModelos() {
        marca.setNrDeModelos(15);
        assertEquals(15, marca.getNrDeModelos());
    }

    @Test
    void testGetAnioLanzamiento() {
        assertEquals(1937, marca.getAnioLanzamiento());
    }

    @Test
    void testSetAnioLanzamiento() {
        marca.setAnioLanzamiento(1940);
        assertEquals(1940, marca.getAnioLanzamiento());
    }

    @Test
    void testGetCodigoIdentificador() {
        assertEquals("T", marca.getCodigoIdentificador());
    }

    @Test
    void testSetCodigoIdentificador() {
        marca.setCodigoIdentificador("H");
        assertEquals("H", marca.getCodigoIdentificador());
    }
}