public class EjecutarCarro {
    public static void main(String[] args) {

        Carro objCarrito1 = new Carro();
        objCarrito1.color = "Rojo";
        objCarrito1.marca = "Chevrolet";
        System.out.println(objCarrito1);
        objCarrito1.acelerar();
        // ----------------------------------
        Carro objCarrito2 = new Carro();
        objCarrito2.color = "Azul";
        objCarrito2.marca = "BMW";
        System.out.println(objCarrito2);
        objCarrito2.acelerar();
        // ----------------------------------
        Carro objCarrito3 = new Carro();
        objCarrito3.color = "Gris";
        objCarrito3.marca = "Tesla";
        System.out.println(objCarrito3);
        objCarrito3.acelerar();

    }
}