    /**
     * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
     * siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
     * saldoActual. 
     * Agregar constructor vacío, con parámetros, getters y setters. 
     * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga: 
     *  - Método para crear cuenta pidiéndole los datos al usuario.
     *  - Método ingresar(double): recibe una cantidad de dinero a ingresar 
     *    y se le sumará al saldo actual. 
     *  - Método retirar(double): recibe una cantidad de dinero a retirar y 
     *    se le restara al saldo actual. 
     *    Si la cuenta no tienela cantidad de dinero a retirar se retirará el 
     *    máximo posible hasta dejar la cuenta en 0. 
     *  - Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
     *    Validar que el usuario no saque más del 20%. 
     *  - Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
     *  - Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
     */
package ejercicios_1_practico_guia8;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Ejercicios_1_Practico_Guia8 {

    public static void main(String[] args) {
        CuentaBancariaServicio Persona1 = new CuentaBancariaServicio();
        System.out.println("BIENVENIDO ! a USI BANK");
        System.out.println(" Cree Una Cuenta BANCARIA ");
        CuentaBancaria Cuenta1 = Persona1.Crearcuenta();
        
        
        System.out.println("BIENVENIDO AL SERVICIO DE NUESTRO BANCO ");
        System.out.println("");
        System.out.println("Elija una opcion: ");
        System.out.println("MENU");
        System.out.println("1-Ingresar dinero");
        System.out.println("2-Retirar dinero");
        System.out.println("3-Extraer dinero rapido");
        System.out.println("4-Consultar saldo");
        System.out.println("5-Consultar datos");
        System.out.println("6-Salir");
        
        int var;
        do {   
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una opcion : ");
        var = leer.nextInt();
        
        switch (var) {
            case 1: 
                 Persona1.ingresarDinero(Cuenta1);
                 break;
            case 2:
                 Persona1.retirarDinero(Cuenta1);
                 break;
            case 3: 
                 Persona1.extraccionRapida(Cuenta1);
                 break;
            case 4:
                Persona1.consultarSaldo(Cuenta1);
                break;
            case 5:
                Persona1.consultarDatos(Cuenta1);
                break;
            case 6:
                System.out.println("Adios... vuelva pronto.");
            default:
                System.out.println("ERROR: La opcion no es valida");
            } 
        } while (var != 6);
    }
    }


