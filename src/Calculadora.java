
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

    /*calculadora*/



public class Calculadora {
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número:");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            double num2 = scanner.nextDouble();
            System.out.println("Resultado de la suma: " + sumar(num1, num2));
            System.out.println("Resultado de la resta: " + restar(num1, num2));
            System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
            try {
                System.out.println("Resultado de la división: " + dividir(num1, num2));
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
        }
    }
}  

