
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardi
 */

    /*ANIMAL*/
  

    /**
     *
     */
    public class Animal {
    private String nombre;
    private String tipo;

    public Animal() {
        // Constructor vacío
    }

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInformación() {
        JOptionPane.showMessageDialog(null, "Nombre del animal: " + nombre + "\nTipo del animal: " + tipo);
    }

        /**
         *
         * @param args
         */
        public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo del animal:");

        Animal animal = new Animal(nombre, tipo);

        animal.mostrarInformación();
    }
}   

    

