package com.unida.ejercicio1.proyecto1_herencia;

public class Persona {
    protected String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
    }
}
