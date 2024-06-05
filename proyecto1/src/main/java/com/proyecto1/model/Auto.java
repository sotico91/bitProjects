package com.proyecto1.model;

public class Auto {

    private String modelo;
    private String color;
    private int anio;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroPuertas;
    private boolean tieneTechoSolar;
    private int numeroMarchas;
    private boolean tieneTransmisionAutomatica;
    private int marchaActual;

    // Constructor
    public Auto(String modelo, String color, int anio, Marca marca, String chasis, Propietario propietario,
                int velocidadMaxima, int numeroPuertas, boolean tieneTechoSolar, int numeroMarchas, boolean tieneTransmisionAutomatica) {
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0; // Inicialmente el coche est� detenido
        this.numeroPuertas = numeroPuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroMarchas = numeroMarchas;
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
        this.marchaActual = 0; // Neutro
    }

    // Getters y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneTechoSolar() {
        return tieneTechoSolar;
    }

    public void setTieneTechoSolar(boolean tieneTechoSolar) {
        this.tieneTechoSolar = tieneTechoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isTieneTransmisionAutomatica() {
        return tieneTransmisionAutomatica;
    }

    public void setTieneTransmisionAutomatica(boolean tieneTransmisionAutomatica) {
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }

    // M�todos de control del coche
    public void acelerar() {
        if (velocidadActual < velocidadMaxima) {
            velocidadActual++;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 0 && nuevaMarcha <= numeroMarchas) {
            if (nuevaMarcha == -1 && velocidadActual > 0) {
                throw new IllegalStateException("No se puede engranar la marcha atras si la velocidad supera los 0 km/h.");
            }
            marchaActual = nuevaMarcha;
        } else {
            throw new IllegalArgumentException("Marcha invalida.");
        }
    }

    public void reducirMarcha() {
        if (marchaActual > 0) {
            marchaActual--;
        } else {
            throw new IllegalArgumentException("No se puede reducir mss la marcha.");
        }
    }

    public double calcularAutonomia(double consumoMedio) {
        return (velocidadMaxima / consumoMedio) * 100;
    }

    public double mostrarVolumenCombustible(double capacidadTanque, double porcentajeLleno) {
        return capacidadTanque * (porcentajeLleno / 100);
    }
}
