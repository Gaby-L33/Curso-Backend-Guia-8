/*
Crea un método void que reciba un objeto tipo persona como parámetro y
utilice el get para mostrar sus atributos. Llama ese método desde el main.
*/
package ejerciciovoid;

import Entidades.Persona;
import Servicios.PersonaServicies;

public class EjercicioVoid {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Gabriel Lewicki", 20, "44677037");
        PersonaServicies.mostrarpersona(persona1);
    }
    
}
