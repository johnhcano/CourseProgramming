import java.util.Scanner;

public class CuatroPuntoTrece {
    public static void main(String[] args) {
        
        //La clase Scanner permite leer datos por teclado
        Scanner leer = new Scanner(System.in);

        //Solicitar por teclado el mes
        System.out.println("Introduzca un número de mes del 1 al 12");
        int mes = leer.nextInt();

        //Segun_sea de Pseudocódigo en JAVA es switch
        switch(mes){
            case 1: System.out.println("ENERO");
                    break;
            case 2: System.out.println("FEBRERO");
                    break;
            case 3: System.out.println("MARZO");
                    break;
            case 4: System.out.println("ABRIL");
                    break;
            case 5: System.out.println("MAYO");
                    break;
            case 6: System.out.println("JUNIO");
                    break;
            case 7: System.out.println("JULIO");
                    break;
            case 8: System.out.println("AGOSTO");
                    break;
            case 9: System.out.println("SEPTIEMBRE");
                    break;
            case 10: System.out.println("OCTUBRE");
                    break;
            case 11: System.out.println("NOVIEMBRE");
                    break;
            case 12: System.out.println("DICIEMBRE");
                    break;
            default: System.out.println("Número fuera del rango ente 1 y 12");
        }
    //Se debe cerrar el objeto de la clase Scanner
    leer.close();
    }
}