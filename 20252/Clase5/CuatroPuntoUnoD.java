import java.util.Scanner;

public class CuatroPuntoUnoD {
    public static void main(String[] args) {
        int x, y, z, p;

        Scanner leer = new Scanner(System.in);

        System.out.println("Digite un valor para x: ");
        x = leer.nextInt();
        System.out.println("Digite un valor para y: ");
        y = leer.nextInt();
        System.out.println("Digite un valor para z: ");
        z = leer.nextInt();

        if (x > y && z < 20) {
            System.out.println("Digite un valor para p: ");
            p = leer.nextInt();
            System.out.println("Valor para p fue: " + p);
        }

        leer.close();
    }
}
