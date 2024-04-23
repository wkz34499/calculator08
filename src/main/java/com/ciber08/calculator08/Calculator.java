package com.ciber08.calculator08;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) { return a * b; }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elije una opción:");
        System.out.println("1. Saludar");
        System.out.println("2. Despedir");
        System.out.println("3. Agradecer");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¡Hola!");
                break;
            case 2:
                System.out.println("¡Adiós!");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
            case 3:
                System.out.println("¡Gracias!");
                break;
        }

        scanner.close();
    }
}

}


