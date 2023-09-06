/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardi
 */
import javax.swing.JOptionPane;

public class Auto {
    private String marca;
    private String modelo;
    private int año;

    public Auto() {
        // Constructor vacío
    }

    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarInformación() {
        JOptionPane.showMessageDialog(null, "Marca del auto: " + marca + "\nModelo del auto: " + modelo + "\nAño del auto: " + año);
    }

    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca del auto:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del auto:");
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del auto:"));

        Auto auto = new Auto(marca, modelo, año);

        auto.mostrarInformación();
    }
}


    