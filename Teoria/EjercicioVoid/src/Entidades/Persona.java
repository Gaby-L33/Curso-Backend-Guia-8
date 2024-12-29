/*
Crea un método void que reciba un objeto tipo persona como parámetro y
utilice el get para mostrar sus atributos. Llama ese método desde el main.
*/
package Entidades;

public class Persona {
    String nombre;
    int edad;
    String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
        
}
