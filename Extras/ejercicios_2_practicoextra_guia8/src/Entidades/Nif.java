/*        
* Dígito Verificador. Crear una clase NIF que se usará para mantener
* DNIs con su correspondiente letra (NIF). Los atributos serán el
* número de DNI (entero largo) y la letra (String o char) que le
* corresponde.
*/
package Entidades;

public class Nif {
    private long DNI;
    private char letra;

    public Nif() {
    }

    public Nif(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
}
