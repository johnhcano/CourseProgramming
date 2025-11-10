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

    public String toString(){
        return "Computador [ Marca:" + marca + " Memoria " + memoria + " Pantalla: " + pantalla + " Capacidad: " + capacidad + " Precio: " + precioBase + "]"; 
    }

    //método para incrementar el costo del computador si se agrego mas memoria.
    public double cotizarMemoria(String memoria){
        
        if(memoria.equals("8GB")){
            precioBase += 20;
        }else if(memoria.equals("16GB")){
            precioBase += 40;
        }else if(memoria.equals("32GB")){
            precioBase += 100;
        }else{
            precioBase += 0.0;
        }
        return precioBase;
    }


}