/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int contador = 1;
        int suma = 0;
        String cadena = "";
        
        do {
            suma = suma + contador;
            cadena = String.format("%s%d\n", cadena, contador);
            contador = contador + 1;
        } while (contador <= 10);
        
        cadena = String.format("%s\nLa suma es %d\n", cadena, suma);
        System.out.printf("%s\n", cadena);
    }

}
