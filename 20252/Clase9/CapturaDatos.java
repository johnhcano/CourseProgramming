import java.util.Scanner;

public class CapturaDatos {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        //Ejemplo 1 - Cadenas
        System.out.println("Digite nombre...");
        String name = leer.next();
        System.out.println("EL valor digitado es: " + name);

        //Ejemplo 2 - Números enteros
        System.out.println("Digite un número entero...");
        int numero = leer.nextInt();
        System.out.println("EL valor digitado es: " + numero);

        //Ejemplo 2 - Números reales
        System.out.println("Digite una nota (Real)...");
        double nota = leer.nextDouble();
        System.out.println("EL valor digitado es: " + nota);

        leer.close();
    }
}

/* 
 * Ejercicios para hacer pag 198 - 199:
 * 5.7, 5.9, 5.10, 5.13, 5.14, 5.15
*/