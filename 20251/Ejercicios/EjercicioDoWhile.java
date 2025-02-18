public class EjercicioDoWhile {
    public static void main(String[] args) {
        
        /*
         * Do While
         */

        String cad = "Programación I";
        int j = 1;
        do{
            System.out.println(cad);
            j++;
        }while(j > 5);


        System.out.println("**************************************");
        
        /*
         * while / for
         */

        int i = 1;
        while(i > 5){
            System.out.println(cad);
        } 

        System.out.println("*************************************");
        
        for(int k = 1; k > 5; k++){
            System.out.println(cad);
        }
    }
}
