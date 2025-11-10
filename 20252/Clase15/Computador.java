public class Computador {

    private String marca;
    private int memoria;
    private double pantalla;
    private String capacidad;
    private double precioBase;

    public Computador(String marca, int memoria, double pantalla, String capacidad, double precioBase){
        this.marca = marca;
        this.memoria = memoria;
        this.pantalla = pantalla;
        this.capacidad = capacidad;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public double getPantalla() {
        return pantalla;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String toString(){
        return "Computador [ Marca:" + marca + " Memoria " + memoria + " Pantalla: " + pantalla + " Capacidad: " + capacidad + " Precio: " + precioBase + "]"; 
    }

    //método para incrementar el costo del computador si se agrego mas memoria.
    public double cotizarMemoria(String memoria){
        double total = 0.0;
        if(memoria.equals("8GB")){
            total = precioBase + 20;
        }else if(memoria.equals("16GB")){
            total = precioBase + 60;
        }else if(memoria.equals("32GB")){
            total = precioBase + 100;
        }else{
            total = precioBase + 0.0;
        }
        return total;
    }


}