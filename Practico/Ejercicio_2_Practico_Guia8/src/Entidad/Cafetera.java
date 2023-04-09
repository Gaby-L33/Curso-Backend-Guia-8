/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Cafetera {
    private double capadadMaxima; //la cantidad máxima de café que puede contener la cafetera
    private double cantidadActual; //la cantidad actual de café que hay en la cafetera

    public Cafetera() {
    }

    public Cafetera(double capadadMaxima, double cantidadActual) {
        this.capadadMaxima = capadadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapadadMaxima() {
        return capadadMaxima;
    }

    public void setCapadadMaxima(double capadadMaxima) {
        this.capadadMaxima = capadadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    

}
