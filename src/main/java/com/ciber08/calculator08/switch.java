package com.example;

import java.util.Scanner;
import java.util.logging.*;

public class EjemploSwitch {
    // Create a logger instance
    private static final Logger logger = Logger.getLogger(EjemploSwitch.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Elije una opción:");
        logger.info("1. Saludar");
        logger.info("2. Despedir");
        logger.info("3. Agradecer");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                logger.info("¡Hola!");
                break;
            case 2:
                logger.info("¡Adiós!");
                break;
            case 3:
                logger.info("¡Gracias!");
                break;
            default:
                logger.warning("Opción no válida.");
                break;
        }

        scanner.close();
    }
}


