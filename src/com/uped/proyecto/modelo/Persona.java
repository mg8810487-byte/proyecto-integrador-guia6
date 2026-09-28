package com.uped.proyecto.modelo;

public abstract class Persona {
    protected String nombre;
    protected String dui;

    public Persona(String nombre, String dui) {
        this.nombre = nombre;
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDui() {
        return dui;
    }

    public String presentarse() {
        return nombre + " (DUI: " + dui + ")";
    }

    // Primer método abstracto
    public abstract double calcularBeneficioAnual();

    // Segundo método abstracto (Reto 8.4)
    public abstract String obtenerIdentificadorRol();
}