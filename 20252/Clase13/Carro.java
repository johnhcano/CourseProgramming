public class Carro {

    // Atributos
    String color;
    String marca;

    // Métodos
    public void acelerar() {
        System.out.println("El " + marca + " está acelerando...");
    }

    public String toString() {
        return "Carro { Color: " + color + " Marca: " + marca + "}";
    }
}