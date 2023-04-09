/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidad.Cafetera;

/**
 *
 * @author Usuario
 */
public class CafeteraServicios {
    Scanner leer = new Scanner(System.in); 
  Cafetera cafe = new Cafetera();

  public void llenarCafetera(){
 //hace que la cantidad actual sea igual a la capacidad máxima 
  cafe.setCantidadActual(cafe.getCapadadMaxima());
  }
  public void servirTaza(){
 //se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
 //Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
      System.out.println("Ingrese el tamaño de la taza vacía: ");
      int tazaVacia = leer.nextInt();
      
      if (cafe.getCantidadActual() <= tazaVacia) {
      cafe.setCantidadActual(cafe.getCantidadActual()-tazaVacia);
          System.out.println("Se ha llenado la taza.");    
      }else{
          System.out.println("No se pudo llenar la taza.");
          System.out.println(cafe.getCantidadActual()-tazaVacia + " Se sirvió esta cantidad en la taza");
          cafe.setCantidadActual(0);
      }//else if(cafe.getCantidadActual() == tazaVacia){
       //  System.out.println("Se ha llenado la taza. Pero no queda más café");
       // cafe.setCantidadActual(0);
      
    
      }
  public void vaciarCafetera(){
  cafe.setCantidadActual(0);
  }
 
  public void agregarCafe(){
      System.out.println("Ingrese cantidad de café molido.");
      int agregar = leer.nextInt();
  }
}
