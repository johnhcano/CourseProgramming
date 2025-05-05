public class CajeroElectronico {
    //Atributos
    private double saldo;
    
    //Constructor: Permite inicializar la clase
    public CajeroElectronico(double saldo){
        this.saldo = saldo;
    }

    //-----------------Métodos---------------------

    /**
     * Obtiene lo que tenga asignado el atributo saldo
     * @return saldo
     */
    public double getSaldo(){
        return saldo;
    }

    /**
     * Método para depositar dinero y asignarselo al saldo
     * @param cantidad
     * @return saldo 
     */
    public double depositar(double cantidad){
        return saldo += cantidad;
    }

    /**
     * Método retirar permite restarle al saldo el monto retirado
     * @param cantidad
     */
    public void retirar(double cantidad){
        if(cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("El nuevo saldo es: " + saldo);
        }else{
            System.out.println("La cantidad a retirar es mayor que el saldo");    
        }
    }

    /**
     * Obtener el saldo actual de la cuenta
     * @return saldo
     */
    public double consultarSaldo(){
        return saldo;
    }

    public void transferir(double cantidad, String destino){
        if(cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Se realizó una transferencia por: " + cantidad + 
            " a: " + destino + " y su saldo es: " + saldo);
        }else{
            System.out.println("La transferencia no se pudo hacer");
        }
    }

}