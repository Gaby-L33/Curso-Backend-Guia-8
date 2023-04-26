package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria Crearcuenta() {

        System.out.println("Ingrese el numero de cuenta ");
        int numeroCuenta = leer.nextInt();

        System.out.println("Ingrese su DNI ");
        long dni = leer.nextLong();

        System.out.println("Ingrese la cantidad de dinero que va a Ingresar");
        double saldo = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dni, saldo);
    }

    public void ingresarDinero(CuentaBancaria cuenta1) {
        System.out.println("Ingrese la cantidad de dinero que va a Ingresar");
        double dineroIngresado = leer.nextDouble();

        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + dineroIngresado);
        
        System.out.println("Usted ingreso " + dineroIngresado + "$");
        System.out.println("-------------------------------------------------");
    }

    public void retirarDinero(CuentaBancaria cuenta1) {
        System.out.println("Ingrese la cantidad de dinero que va a Retirar");
        double dineroRetirado = leer.nextDouble();

        if (dineroRetirado < cuenta1.getSaldoActual()) {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - dineroRetirado);
            System.out.println("Usted retiro " + dineroRetirado + "$");
            System.out.println("-------------------------------------------------");
        } else {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - cuenta1.getSaldoActual());
            System.out.println("Usted retiro " + cuenta1.getSaldoActual() + "$");
            System.out.println("-------------------------------------------------");
        }
        
        
    }
    
    public void extraccionRapida(CuentaBancaria cuenta1){
        System.out.println("Usted a accedido al servicio de extraccion rapida");
        System.out.println("Podra retirar hasta un maximo del 20% de su sueldo");
        System.out.println("");
        System.out.println("Ingrese la cantidad que quiere Retirar");
        double retiro = leer.nextDouble();
        
        double porcentaje = (retiro*100)/cuenta1.getSaldoActual();
        
        if (porcentaje <= 20) {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
            System.out.println("Usted retiro " + retiro + "$");
            System.out.println("-------------------------------------------------");
        } else{
            System.out.println("ERROR: Usted ha intentado sacar mas del 20% de su sueldo");
            System.out.println("-------------------------------------------------");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta1){
        System.out.println("Su saldo actualmente es de " + cuenta1.getSaldoActual());
        System.out.println("-------------------------------------------------");
    }
    
    public void consultarDatos(CuentaBancaria cuenta1){
        System.out.println("Su numero de cuenta es " + cuenta1.getNumeroCuenta());
        System.out.println("Su numero de DNI es " + cuenta1.getDniCliente());
        System.out.println("-------------------------------------------------");
    }
}
