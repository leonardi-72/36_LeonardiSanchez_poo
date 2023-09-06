
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardi
 */



public class Persona {
    private String nombre;
    private int edad;
    private String género;

    public Persona() {
        // Constructor vacío
    }

    public Persona(String nombre, int edad, String género) {
        this.nombre = nombre;
        this.edad = edad;
        this.género = género;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGénero() {
        return género;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public void imprimirInformación() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + género);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre de la persona:");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese la edad de la persona:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            System.out.println("Ingrese el género de la persona:");
            String género = scanner.nextLine();
            
            Persona persona = new Persona(nombre, edad, género);
            
            System.out.println("Información de la persona:");
            persona.imprimirInformación();
        }
    }
    
    
}
