package ejerciciovoid;

import clases.Persona;



public class EjercicioVoid {

    /**
     * Crea un método void que reciba un objeto tipo persona como parámetro y
     * utilice el get para mostrar sus atributos. Llama ese método desde el
     * main.
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Gabriel Lewicki", 20, "44677037");
        mostrarpersona(persona1);
        
        
    }
    
    public static void mostrarpersona(Persona persona1){
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("DNI: " + persona1.getDni());
    }
}
