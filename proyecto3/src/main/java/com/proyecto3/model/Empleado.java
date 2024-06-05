package com.proyecto3.model;

public class Empleado {

	// Variables de instancia
    private String nombre;
    private String apellido;
    private double salarioMensual;

    // Variable de clase para contar el numero de empleados
    private static int contadorEmpleados = 0;

    // Constructor
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        setSalarioMensual(salarioMensual);
        contadorEmpleados++; 
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual < 0) {
            this.salarioMensual = 0.0;
        } else {
            this.salarioMensual = salarioMensual;
        }
    }

    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    public void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            salarioMensual += salarioMensual * (porcentaje / 100);
        }
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }
}