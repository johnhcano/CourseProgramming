import java.util.Scanner;

public class Circulo {
    public Circulo(double r) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {

        /*
         * 2.11 Calcular y visualizar la longitud de la circunferencia 2*radio*3.1416
         * y el área de un círculo de radio dado. PI*(r**2) ó PI*(r*r)
         */

        //Creación del objeto "leer" para utilizar los métodos de la clase Scanner 
        Scanner leer = new Scanner(System.in);

        //Se pide por teclado el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = leer.nextDouble();

        //Se ejecutan las fórmulas con el radio que digitó el usuario 
        double longitud = 2 * radio * 3.1416;
        double area = 3.1416 * (radio * radio);

        //Se muestra el resultado de las fórmulas
        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);

        leer.close();
    }

    public String calcularPerimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }

    public String calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }
}
