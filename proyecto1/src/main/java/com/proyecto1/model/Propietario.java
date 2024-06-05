package com.proyecto1.model;

public class Propietario {
	
	private String nombre;
	private String fechaNacimiento;
	private Direccion direccion;
	
	// Constructor
    public Propietario(String nombre, String fechaNacimiento, Direccion direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("La direccion no puede estar vacia.");
        }
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("La direccion no puede estar vacia.");
        }
        this.direccion = direccion;
    }
}
