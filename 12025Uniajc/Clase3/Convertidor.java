import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        //Declaración de las variables para el ejercicio
        // c -> grados celsius, f -> grados farenheit
        // gradosCelcius, gradosFarenheit 
        double c, f, gradosCelcius, gradosFarenheit;

        //Pedir datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los grados Celcius");
        c = leer.nextInt();
        System.out.println("Digite lo grados Farenheit");
        f = leer.nextInt();


        leer.close();
    }
}
