package ejercicio5;

import java.util.Scanner; 
/**
 
 * @author Maria Eugenia Costa
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Hacer un programa que calcule e imprima la suma de tres calificaciones.
        // Pedir las calificaciones al usuario
        float calificacion1, calificacion2, calificacion3, suma;
        System.out.println("Ingrese la primer calificacion: ");
        calificacion1 = read.nextInt();
        System.out.println("Ingrese la segunda calificacion: ");
        calificacion2 = read.nextInt();
        System.out.println("Ingrese la tercer calificacion: ");
        calificacion3 = read.nextInt();
        suma = calificacion1 + calificacion2 + calificacion3;
        System.out.println("La suma de las 3 calificaciones ingresadas es: " + suma);
    }
    
}
