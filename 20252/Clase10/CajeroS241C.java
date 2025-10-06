import java.util.Scanner;
 
public class CajeroS241C {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int intentos = 1;
        do {
            // Declaración de variables
            int CLAVE = 1234;
            int SALDO_INICIAL = 200000;
            int claveUsuario, retiro, nuevoSaldo;
           
            // Leer clave del usuario
            System.out.print("Por favor, digite su clave: ");
            claveUsuario = scanner.nextInt();
    
            // Verificar clave
            if (CLAVE == claveUsuario) {
                System.out.println("Bienvenido al cajero de la Uniajc");
                System.out.print("Digite la cantidad a retirar: ");
                retiro = scanner.nextInt();
    
                if (retiro > 200000) {
                    retiro = retiro + 2000;
    
                    if (retiro <= SALDO_INICIAL) {
                        nuevoSaldo = SALDO_INICIAL - retiro;
                        System.out.println("Su saldo actual es: " + nuevoSaldo + " Muchas Gracias");
                    } else {
                        System.out.println("El valor solicitado más el costo de la transacción es mayor al saldo");
                    }
                } else {
                    if (retiro <= SALDO_INICIAL) {
                        nuevoSaldo = SALDO_INICIAL - retiro;
                        System.out.println("Su saldo actual es: " + nuevoSaldo + " Muchas Gracias");
                    } else {
                        System.out.println("El valor solicitado es mayor al saldo actual....");
                    }
                }
            } else {
                System.out.println("Su clave no es correcta. intente nuevamente.");
                intentos++;
            }   

        }while(intentos <= 3);
        
        System.out.println("Tarjeta bloqueada...");
    }
}
 
 