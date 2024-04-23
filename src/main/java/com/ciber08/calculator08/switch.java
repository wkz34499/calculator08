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
