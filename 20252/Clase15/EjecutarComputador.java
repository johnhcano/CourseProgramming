public class EjecutarComputador {
   public static void main(String[] args) {
    
      Computador compumax = new Computador("N200", 16, 14.0, "512GB");
      Computador lenovoRyzen = new Computador("Lenovo", 8, 15.6, "1T");

      System.out.println(compumax);
      System.out.println(lenovoRyzen);

   } 
}
