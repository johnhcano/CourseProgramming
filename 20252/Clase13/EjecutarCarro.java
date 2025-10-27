public class EjecutarCarro {
    public static void main(String[] args) {

        Carro objCarrito1 = new Carro("Rojo", "Chevrolet");
        System.out.println(objCarrito1);
        objCarrito1.acelerar();
        // ----------------------------------
        Carro objCarrito2 = new Carro("Azul", "BMW");
        System.out.println(objCarrito2);
        objCarrito2.acelerar();
        // ----------------------------------
        Carro objCarrito3 = new Carro("Gris", "Tesla");
        System.out.println(objCarrito3);
        objCarrito3.acelerar();

    }
}