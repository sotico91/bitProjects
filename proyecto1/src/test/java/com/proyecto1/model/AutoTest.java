package com.proyecto1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    private Auto auto;
    private Marca marca;
    private Propietario propietario;
    private Direccion direccion;

    @BeforeEach
    void setUp() {

        direccion = new Direccion("Calle Falsa 123", "Springfield", "EEUU");
        marca = new Marca("Toyota", 10, 1937, "T");
        propietario = new Propietario("Juan Perez", "12345678",     direccion);
        auto = new Auto("Corolla", "Rojo", 2020, marca, "ABC123", propietario,
                180, 4, true, 6, false);
    }

    @Test
    void testAcelerar() {
        auto.acelerar();
        assertEquals(1, auto.getVelocidadActual());
    }

    @Test
    void testFrenar() {
        auto.acelerar();
        auto.frenar();
        assertEquals(0, auto.getVelocidadActual());
    }

    @Test
    void testCambiarMarchaValida() {
        auto.cambiarMarcha(2);
        assertEquals(2, auto.getMarchaActual());
    }

    @Test
    void testCambiarMarchaInvalida() {
        assertThrows(IllegalArgumentException.class, () ->  auto.cambiarMarcha(7));

    }

    @Test
    void testCambiarMarchaReversaConVelocidad() {
        auto.acelerar();
        assertThrows(IllegalArgumentException.class, () ->  auto.cambiarMarcha(-1));
    }

    @Test
    public void testReducirMarcha() {
        auto.cambiarMarcha(2);
        auto.reducirMarcha();
        assertEquals(1, auto.getMarchaActual());
    }

    @Test
    public void testReducirMarchaInvalida() {
        assertThrows(IllegalArgumentException.class, () ->   auto.reducirMarcha());
    }

    @Test
    public void testCalcularAutonomia() {
        double autonomia = auto.calcularAutonomia(8);
        assertEquals(2250, autonomia, 0.01);
    }

    @Test
    public void testMostrarVolumenCombustible() {
        double volumen = auto.mostrarVolumenCombustible(50, 50);
        assertEquals(25, volumen, 0.01);
    }

}