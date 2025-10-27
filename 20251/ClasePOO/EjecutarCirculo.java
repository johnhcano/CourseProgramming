public class EjecutarCirculo{
    public static void main(String[] args){
 
        double radio = 2.3; //radio
       
        //Creación del objeto de la clase Circulo
        Circulo objCirculo1 = new Circulo(radio);
 
        //llamado a los métodos de la clase
        System.out.println("Perímetro: " + objCirculo1.calcularPerimetro());
 
        System.out.println("Área: " + objCirculo1.calcularArea());
 
    }
}
 