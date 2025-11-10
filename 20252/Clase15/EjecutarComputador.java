public class EjecutarComputador {
   public static void main(String[] args) {
    
      Computador compumax = new Computador("N200", 4, 14.0, "512GB", 1290.0);
      Computador lenovoRyzen = new Computador("Lenovo", 4, 15.6, "1T", 2560.0);

      System.out.println(compumax);
      System.out.println(lenovoRyzen);

      System.out.println("Solo tenemos memorias de 8GB, 16GB y 32GB");
      System.out.println("Valor del computador sin modificaciones: " + compumax.getPrecioBase());
      System.out.println("Computador " + compumax.getMarca() + 
                           " con memoria de 8GB tiene un valor de: " + compumax.cotizarMemoria("8GB"));
      System.out.println("Computador " + compumax.getMarca() + 
                           " con memoria de 16GB tiene un valor de: " + compumax.cotizarMemoria("16GB"));
      System.out.println("Computador " + compumax.getMarca() + 
                           " con memoria de 32GB tiene un valor de: " + compumax.cotizarMemoria("32GB"));

   } 
}
