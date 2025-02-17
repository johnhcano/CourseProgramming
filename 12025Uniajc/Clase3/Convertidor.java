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
        c = leer.nextDouble();
        System.out.println("Digite lo grados Farenheit");
        f = leer.nextDouble();
        //calculamos las fórmulas para cada una de las conversiones
        gradosCelcius = (f - 32.0) * (5.0/9.0);
        gradosFarenheit = c * (9.0/5.0) + 32.0;
        //Mostrar los resultados de las fórmulas
        System.out.println("°F -> °C = " + gradosCelcius);
        System.out.println("°C -> °F = " + gradosFarenheit);
        leer.close();
    }
}
