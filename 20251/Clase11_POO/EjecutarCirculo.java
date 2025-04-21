public class EjecutarCirculo{
    public static void main(String[] args){

        double r = 2.3; //radio
        
        //Creación del objeto
        Circulo objCirculo1 = new Circulo(r);

        //llamado a los métodos de la clase
        System.out.println("Perímetro: " + objCirculo1.calcularPerimetro());

        System.out.println("Área: " + objCirculo1.calcularArea());

    }
}