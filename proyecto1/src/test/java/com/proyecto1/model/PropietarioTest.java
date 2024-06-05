package com.proyecto1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropietarioTest {

    private Propietario propietario;
    private Direccion direccion;

    @BeforeEach
    public void setUp() {
        direccion = new Direccion("Calle Principal", "Barrio Centro", "Ciudad");
        propietario = new Propietario("Juan Perez", "1990-05-15", direccion);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Juan Perez", propietario.getNombre());
    }

    @Test
    public void testSetNombre() {
        propietario.setNombre("Maria Garcia");
        assertEquals("Maria Garcia", propietario.getNombre());
    }

    @Test
    public void testGetFechaNacimiento() {
        assertEquals("1990-05-15", propietario.getFechaNacimiento());
    }

    @Test
    public void testSetFechaNacimiento() {
        propietario.setFechaNacimiento("1985-10-20");
        assertEquals("1985-10-20", propietario.getFechaNacimiento());
    }

    @Test
    public void testGetDireccion() {
        assertEquals(direccion, propietario.getDireccion());
    }

    @Test
    public void testSetDireccion() {
        Direccion nuevaDireccion = new Direccion("Nueva Calle", "Nuevo Barrio", "Nueva Ciudad");
        propietario.setDireccion(nuevaDireccion);
        assertEquals(nuevaDireccion, propietario.getDireccion());
    }

    @Test
    public void testConstructorWithNullDireccion() {
        assertThrows(IllegalArgumentException.class, () -> new Propietario("Pedro Gomez", "1980-03-10", null));
    }

    @Test
    public void testSetDireccionWithNull() {
        assertThrows(IllegalArgumentException.class, () -> propietario.setDireccion(null));
    }
}