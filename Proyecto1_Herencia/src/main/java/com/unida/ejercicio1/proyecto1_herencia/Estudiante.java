
package com.unida.ejercicio1.proyecto1_herencia;

public class Estudiante extends Persona {
    private String carrera;
    
    public Estudiante(String nombre, String carrera) {
        super(nombre); // Llama al constructor de la clase padre Persona
        this.carrera = carrera;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre + " | Carrera: " + carrera);
    }
}