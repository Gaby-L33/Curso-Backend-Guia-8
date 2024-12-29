package Servicios;

import java.util.Scanner;
import Entidades.Nif;

public class NifServicio {
    char[] VectorLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    Nif dni = new Nif();

    public NifServicio() {
    }

    public void crearNif(){
        /*
         * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra
         * que le corresponderá. Una vez calculado, le asigna la letra que le
         * corresponde según Método mostrar().
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el DNI : ");
        long DNI = leer.nextLong();
        dni.setDNI(DNI);
        int resto = (int) DNI % 23;
        char letra = VectorLetras[resto];
        dni.setLetra(letra);  
    }
    
    public void mostrar(){
        /*
        Método mostrar(): que nos permita mostrar el NIF
         * (ocho dígitos, un guion y la letra en mayúscula; por ejemplo:
         * 00395469-F).
        */
        System.out.println("DNI : " + dni.getDNI() + "-" + dni.getLetra());
        
    }
    
}
