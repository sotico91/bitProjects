package com.proyecto3.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    private Empleado empleado;

    @BeforeEach
    void setUp() {
        empleado = new Empleado("Juan", "Perez", 3000.0);
    }

    @Test
    void testGetNombre() {
        assertEquals("Juan", empleado.getNombre());
    }

    @Test
    void testSetNombre() {
        empleado.setNombre("Maria");
        assertEquals("Maria", empleado.getNombre());
    }

    @Test
    void testGetApellido() {
        assertEquals("Perez", empleado.getApellido());
    }

    @Test
    void testSetApellido() {
        empleado.setApellido("Gomez");
        assertEquals("Gomez", empleado.getApellido());
    }

    @Test
    void testGetSalarioMensual() {
        assertEquals(3000.0, empleado.getSalarioMensual(), 0.01);
    }

    @Test
    void testSetSalarioMensual() {
        empleado.setSalarioMensual(3500.0);
        assertEquals(3500.0, empleado.getSalarioMensual(), 0.01);
    }

    @Test
    void testSetSalarioMensualNegative() {
        empleado.setSalarioMensual(-2000.0);
        assertEquals(0.0, empleado.getSalarioMensual(), 0.01);
    }

    @Test
    void testGetSalarioAnual() {
        assertEquals(3000.0 * 12, empleado.getSalarioAnual(), 0.01);
    }

    @Test
    void testAplicarAumento() {
        empleado.aplicarAumento(10);
        assertEquals(3300.0, empleado.getSalarioMensual(), 0.01);
    }

    @Test
    void testAplicarAumentoNegative() {
        empleado.aplicarAumento(-10);
        assertEquals(3000.0, empleado.getSalarioMensual(), 0.01);
    }

    @Test
    void testGetContadorEmpleados() {

        Empleado empleado2 = new Empleado("Maria", "Gomez", 3500.0);

        assertEquals(2, Empleado.getContadorEmpleados());
    }
}