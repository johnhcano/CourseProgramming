import java.util.Scanner;

public class CuatroPuntoTrece {
    public static void main(String[] args) {
        
        //La clase Scanner permite leer datos por teclado
        Scanner leer = new Scanner(System.in);

        //Solicitar por teclado el mes
        System.out.println("Introduzca un mes (1 para Enero, 2 para Febrero,...)");
        int mes = leer.nextInt();
        //solicitar por teclado un dia del mes
        System.out.println("Introduzca un día del mes");
        int dia = leer.nextInt();

        //Segun_sea de Pseudocódigo en JAVA es switch
        switch(mes){
            case 1: System.out.println("ENERO");
                    if (dia >= 1 && dia <= 31){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 2: System.out.println("FEBRERO");
                    if (dia >= 1 && dia <= 28){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 3: System.out.println("MARZO");
                    if (dia >= 1 && dia <= 31){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 4: System.out.println("ABRIL");
                    if (dia >= 1 && dia <= 30){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 5: System.out.println("MAYO");
                    if (dia >= 1 && dia <= 31){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 6: System.out.println("JUNIO");
                    if (dia >= 1 && dia <= 30){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 7: System.out.println("JULIO");
                    if (dia >= 1 && dia <= 31){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 8: System.out.println("AGOSTO");
                    if (dia >= 1 && dia <= 31){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 9: System.out.println("SEPTIEMBRE");
                    if (dia >= 1 && dia <= 30){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 10: System.out.println("OCTUBRE");
                    if (dia >= 1 && dia <= 31){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 11: System.out.println("NOVIEMBRE");
                    if (dia >= 1 && dia <= 30){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            case 12: System.out.println("DICIEMBRE");
                    if (dia >= 1 && dia <= 31){
                        System.out.println("Día correcto");
                    }else{
                        System.out.println("Día incorrecto");
                    }
                    break;
            default: System.out.println("Número fuera del rango ente 1 y 12");
        }
    //Se debe cerrar el objeto de la clase Scanner
    leer.close();
    }
}