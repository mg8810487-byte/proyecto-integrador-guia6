package com.uped.proyecto.modelo;

public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, String dui, double salario) {
        super(nombre, dui);
        this.salario = salario;
    }

    @Override
    public double calcularBeneficioAnual() {
        return salario * 0.10;
    }

    @Override
    public String obtenerIdentificadorRol() {
        return "EMP-" + (int)(salario * 2);
    }

    @Override
    public String toString() {
        return presentarse() + " | Salario: $" + salario;
    }
}