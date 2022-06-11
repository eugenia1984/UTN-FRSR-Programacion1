/*
 * Guillermo tiene N dolares.
 * Luis tiene la mitad de lo que posee Guillermo.
 * Juan tiene la mitad de lo que posee Luis y Guillermo juntos.
 * Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
package ejercicio6;

import java.util.Scanner;
/**
 * @author Maria Eugenia costa
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.println("Ingrese la cantidad de dinero de Guillermo: ");
        guillermo = read.nextFloat();
        luis = guillermo / 2;
        juan = (luis + guillermo ) / 2;
        total = luis + guillermo + juan;
        System.out.println("El dinero de Luis es: USD " + luis);
        System.out.println("El dinero de Juan es: USD " + juan);
        System.out.println("El total del dinero es: USD " + total);
    }
    
}
