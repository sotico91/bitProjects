package com.proyecto2.model;

public class Factura {

    private String numero;
    private String descripcion;
    private int cantidadComprada;
    private double precioPorArticulo;

    // Constructor
    public Factura(String numero, String descripcion, int cantidadComprada, double precioPorArticulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        setCantidadComprada(cantidadComprada);
        setPrecioPorArticulo(precioPorArticulo);
    }

    // Getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        if (cantidadComprada < 0) {
            this.cantidadComprada = 0;
        } else {
            this.cantidadComprada = cantidadComprada;
        }
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0) {
            this.precioPorArticulo = 0.0;
        } else {
            this.precioPorArticulo = precioPorArticulo;
        }
    }

    // Metodo para calcular el total de la factura
    public double getTotalFactura() {
        return cantidadComprada * precioPorArticulo;
    }
}