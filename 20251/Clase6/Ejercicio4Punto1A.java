import java.util.Scanner;

public class Ejercicio4Punto1A {
    public static void main(String[] args) {
        // Clase que me permite a través del objeto "leer" solicitar
        // datos por teclado
        Scanner leer = new Scanner(System.in);

        // Se declara la variable o las variables
        double angulo;

        // Solicitar por teclado el ángulo para su validación
        System.out.print("Digite el ángulo: ");
        angulo = leer.nextInt();

        // Se valida si el ángulo ingresado es o no es un ángulo recto
        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo NO es un águlo recto");
        }
        leer.close();
    }
}