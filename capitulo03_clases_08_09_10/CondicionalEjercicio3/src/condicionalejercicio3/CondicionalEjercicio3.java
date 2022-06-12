package condicionalejercicio3;

import java.util.Scanner;

/**
 * @author Maria Eugenia Costa
 */
public class CondicionalEjercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int calificacion;
        
        System.out.println("Ingrese un numero entre 0 y 10 : ");
        calificacion = read.nextInt();
        
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else if ( calificacion>= 8 && calificacion < 9) {
            System.out.println("B");
        } else if ( calificacion >= 7 && calificacion < 8 ) {
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else {
            System.out.println("Fuera de rango");
        }
        
    }
    
}
