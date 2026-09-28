package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
                new Cliente("Ana López", "04512378-9", "7777-1111", 4000.0),
                new Empleado("Luis Martínez", "06223344-5", 850.0),
                new Estudiante("Kevin Ramos", "03998877-1", "UPED-045", "Ing. Sistemas", 9.1),
                new Docente("Carlos Pérez", "01234567-8", "Bases de Datos", 5),
                new Proveedor("Comercial Ríos", "06554321-8", 8000.0)
        };

        System.out.println("=== PRUEBA DE SEGUNDO MÉTODO ABSTRACTO (RETO 8.4) ===");
        for (Persona p : personas) {
            System.out.println(p.getNombre() + " | ID Rol: " + p.obtenerIdentificadorRol() + " | Beneficio: $" + p.calcularBeneficioAnual());
        }
    }
}