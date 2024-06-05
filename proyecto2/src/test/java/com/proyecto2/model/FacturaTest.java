package com.proyecto2.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {

    private Factura factura;

    @BeforeEach
    void setUp() {
        factura = new Factura("001", "Producto 1", 3, 10.0);
    }

    @Test
    void testGetNumero() {
        assertEquals("001", factura.getNumero());
    }

    @Test
    void testSetNumero() {
        factura.setNumero("002");
        assertEquals("002", factura.getNumero());
    }

    @Test
    void testGetDescripcion() {
        assertEquals("Producto 1", factura.getDescripcion());
    }

    @Test
    void testSetDescripcion() {
        factura.setDescripcion("Producto 2");
        assertEquals("Producto 2", factura.getDescripcion());
    }

    @Test
    void testGetCantidadComprada() {
        assertEquals(3, factura.getCantidadComprada());
    }

    @Test
    void testSetCantidadComprada() {
        factura.setCantidadComprada(5);
        assertEquals(5, factura.getCantidadComprada());
    }

    @Test
    void testSetCantidadCompradaNegative() {
        factura.setCantidadComprada(-2);
        assertEquals(0, factura.getCantidadComprada());
    }

    @Test
    void testGetPrecioPorArticulo() {
        assertEquals(10.0, factura.getPrecioPorArticulo(), 0.01);
    }

    @Test
    void testSetPrecioPorArticulo() {
        factura.setPrecioPorArticulo(15.0);
        assertEquals(15.0, factura.getPrecioPorArticulo(), 0.01);
    }

    @Test
    void testSetPrecioPorArticuloNegative() {
        factura.setPrecioPorArticulo(-5.0);
        assertEquals(0.0, factura.getPrecioPorArticulo(), 0.01);
    }

    @Test
    void testGetTotalFactura() {
        assertEquals(30.0, factura.getTotalFactura(), 0.01);
    }

}