        /**
         * Programa Nespresso. Desarrolle una clase Cafetera en el paquete
         * Entidades con los atributos capacidadMáxima (la cantidad máxima de
         * café que puede contener la cafetera) y cantidadActual (la cantidad
         * actual de café que hay en la cafetera). Agregar constructor vacío y
         * con parámetros así como setters y getters.
         * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
         * Método llenarCafetera(): hace que la cantidad actual sea igual a la
         * capacidad máxima.
         * Método servirTaza(int): se pide el tamaño de una
         * taza vacía, el método recibe el tamaño de la taza y simula la acción
         * de servir la taza con la capacidad indicada. Si la cantidad actual de
         * café “no alcanza” para llenar la taza, se sirve lo que quede.
         * El método le informará al usuario si se llenó o no la taza, y de no
         * haberse llenado en cuanto quedó la taza.
         * Método vaciarCafetera(): pone la cantidad de café actual en cero.
         * Método agregarCafe(int): se le pide al usuario una cantidad de café,
         * el método lo recibe y se añade a la cafetera la cantidad de
         * café indicada.
         */
package Servicios;

import java.util.Scanner;
import Entidad.Cafetera;

public class CafeteraServicios {
    Scanner leer = new Scanner(System.in);
    //Llena la cafetera hasta su capacidad maxima
    public void llenarCafetera(Cafetera cafe) {
        System.out.println("Cafetera LLENA ...");
        cafe.setCantidadActual(cafe.getCapacidadMaxima());    
    }
    //Se sca cafe de la cafetera para servirlo en una taza
    public int servirTaza(Cafetera cafe) {

        System.out.println("Ingrese el tamaño de la taza :");
        int taza = leer.nextInt();
        System.out.println("-- LLENANDO SU TAZA AGUARDE --");
        
        cafe.setCantidadActual(cafe.getCantidadActual()-taza);
        
        return taza;
    }
    //La cantidad del atributo de la cafetera se la deja a 0
    public void vaciarCafetera(Cafetera cafe) {
        System.out.println("Vaciando la Cafetera ... ");
        cafe.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafe ) {
        //Se le agrega cafe
       int cantCafe;
        System.out.println("Capacidad Actual es de : " + cafe.getCantidadActual());
        System.out.println("Ingrese Cantidad de Cafe que va Agregar : ");
        cantCafe = leer.nextInt();
        //Se envia la cantidad excedida o el total que se lleno
        if (cafe.getCantidadActual() + cantCafe > cafe.getCapacidadMaxima()) {
            System.out.println("Capacidad Maxima Exedida por : " + (cafe.getCantidadActual() + cantCafe - cafe.getCapacidadMaxima()));
        } else {
            cafe.setCantidadActual(cafe.getCantidadActual() + cantCafe); 
            System.out.println("Se agrego el Cafe, Capacidad Actual : " + cafe.getCantidadActual());
        }
        
    }
}

