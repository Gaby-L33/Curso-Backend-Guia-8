 /**
         * Realizar una clase llamada Persona en el paquete de entidades que
         * tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre,
         * ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún
         * otro atributo, puede hacerlo. Agregar constructores, getters y
         * setters. En el paquete Servicios crear PersonaServicio con los
         * siguientes 3 métodos: Método esMayorDeEdad(): indica si la persona es
         * mayor de edad. La función devuelve un booleano. Metodo
         * crearPersona(): el método crear persona, le pide los valores de los
         * atributos al usuario y después se le asignan a sus respectivos
         * atributos para llenar el objeto Persona. Además, comprueba que el
         * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto
         * se deberá mostrar un mensaje
         * Método calcularIMC(): calculara si la persona está en su peso ideal
         * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
         * valor menor que 20, significa que la persona está por debajo de su
         * peso ideal y la función devuelve un -1. Si la fórmula da por
         * resultado un número entre 20 y 25 (incluidos), significa que la
         * persona está en su peso ideal y la función devuelve un 0. Finalmente,
         * si el resultado de la fórmula es un valor mayor que 25 significa que
         * la persona tiene sobrepeso, y la función devuelve un 1. A
         * continuación, en la clase main hacer lo siguiente: Crear 4 objetos de
         * tipo Persona con distintos valores, a continuación, llamaremos todos
         * los métodos para cada objeto, deberá comprobar si la persona está en
         * su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
         * indicar para cada objeto si la persona es mayor de edad. Por último,
         * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
         * en distintas variables(arrays), para después calcular un porcentaje
         * de esas 4 personas cuantas están por debajo de su peso, cuantas en su
         * peso ideal y cuantos, por encima, y también calcularemos un
         * porcentaje de cuantos son mayores de edad y cuantos menores. Para
         * esto, podemos crear unos métodos adicionales.
         */
package ejercicios_3_practico_guia8;

import entidades.Persona;
import Servicios.PersonaServicios;

public class Ejercicios_3_Practico_guia8 {

    public static void main(String[] args) {

        
        // Crear 4 Obtejos de persona
        
        PersonaServicios n1 = new PersonaServicios();
        Persona p1 = n1.crearPersona();
        Persona p2 = n1.crearPersona();
        Persona p3 = n1.crearPersona();
        Persona p4 = n1.crearPersona();
        
        Persona [] Vector = new Persona[4];
        
        Vector [0] = p1;
        Vector [1] = p2;
        Vector [2] = p3;
        Vector [3] = p4;
        
//        Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
//        de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
//        con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
        
        //Incializar un objeto Persona a null
        Persona pNull = null;
        
        //Intenta invocar el método esMayorDeEdad() en un objeto null
        try{
            if (n1.esMayorDeEdad(pNull)){
                System.out.println("Es mayor de edad");
            } else{
                System.out.println("Es menor de edad");
            }
        } catch (NullPointerException e){
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
        
        for (int i = 0; i < 4; i++) {
            Persona p = Vector[i];
            if (n1.esMayorDeEdad(p)){
                System.out.println(n1.getNombre(p) + " : Es Mayor de Edad"  );
            }else{
                System.out.println(n1.getNombre(p) + " Es Menor de Edad");
            }
            switch (n1.calcularIMC(p)) {
                case 1:
                    System.out.println(n1.getNombre(p) + " : Debajo del Peso ideal");
                    break;
                case 0:
                    System.out.println(n1.getNombre(p) + " : Peso Ideal");
                    break;
                case -1:
                    System.out.println(n1.getNombre(p) + " : Arriba del Peso ideal");
                    break;
            }
        }
    }
}
