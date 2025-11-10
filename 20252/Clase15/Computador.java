public class Computador {

    private String marca;
    private int memoria;
    private double pantalla;
    private String capacidad;

    public Computador(String marca, int memoria, double pantalla, String capacidad){
        this.marca = marca;
        this.memoria = memoria;
        this.pantalla = pantalla;
        this.capacidad = capacidad;
    }

    public String toString(){
        return "Computador [ Marca:" + marca + " Memoria " + memoria + " Pantalla: " + pantalla + " Capacidad: " + capacidad +"]"; 
    }


}