public class Carro {

    // Atributos
    private String color;
    private String marca;

    //Método Constructor
    public Carro(String color, String marca){
        this.color = color;
        this.marca = marca;
    }
    
    // Métodos
    public void acelerar() {
        System.out.println("El " + marca + " está acelerando...");
    }

    public String toString() {
        return "Carro { Color: " + color + " Marca: " + marca + "}";
    }
}