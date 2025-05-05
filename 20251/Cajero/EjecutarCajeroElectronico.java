public class EjecutarCajeroElectronico {

    public static void main(String[] args) {
        
        //Crear el objeto para trabajar con los métodos del Cajero Electrónico
        //Se crea el objeto objP1 con saldo inicial de 1000.0
        CajeroElectronico objP1 = new CajeroElectronico(1000.0);

        //Escenario 1
        System.out.println("--------------Escenario 1-----------------------------");
        //Depositar 1300 dolares
        System.out.println("Nuevo Saldo: " + objP1.depositar(1300.0));

        //Consultar saldo actual
        System.out.println("Saldo Actual: " + objP1.consultarSaldo());

        //Retirar una cantidad de 2000.0
        objP1.retirar(2000.0);

        //Transferir 200 a Medelin
        objP1.transferir(200.0, "Medelin");

        //Escenario 2
        System.out.println("---------------Escenario 2----------------------------");
        
        //Se crea el objeto objP2 con saldo inicial de 500.0
        CajeroElectronico objP2 = new CajeroElectronico(500.0);

        objP2.depositar(200.0);

        objP2.retirar(1000.0);

        objP2.transferir(800.0, "Jhon Cano");


    }
}