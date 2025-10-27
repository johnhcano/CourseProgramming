public class EjecutarCarro {
    public static void main(String[] args) {
        
        Carro objCarrito1 = new Carro(); 
        objCarrito1.color = "Rojo";
        objCarrito1.marca = "Chevrolet";
        objCarrito1.acelerar();
        //----------------------------------
        Carro objCarrito2 = new Carro();
        objCarrito2.color = "Azul";
        objCarrito2.marca = "BMW";
        objCarrito2.acelerar();
        //----------------------------------
        Carro objCarrito3 = new Carro();
        objCarrito3.color = "Gris";
        objCarrito3.marca = "Tesla";
        objCarrito3.acelerar();



    }
}