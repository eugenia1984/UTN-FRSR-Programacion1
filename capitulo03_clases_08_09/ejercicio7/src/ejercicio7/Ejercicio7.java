/* Una compañia de venta de carros usados, paga a su personal de ventas un 
 * salario de $ 1000 mensuales mas una comision de $ 150 por cada carro vendido, 
 * mas el 5% del valor de la venta por carro. Cada mes el capturista de la 
 * empresa ingresa en la computadora los datos pertinentes.
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 * El salario de 1000 lo vamos a manejar como un dato constante, para
 * asignarlo debemos usar la palabra reservada final.
 */
package ejercicio7;

import java.util.Scanner;
/**
 * @author Maria Eugenia Costa
 */
public class Ejercicio7 {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final int SALARIO = 1000; // final porque es constante
        int comision = 150;
        int venta;
        float salarioMensual, ventaCarro, porcentajeVenta, totalPrecio;
        
        System.out.println("Ingrese la cantidad de carros vendidos: ");
        venta = read.nextInt();
        System.out.println("Ingrese el precio del carro: ");
        ventaCarro = read.nextFloat();
        
        comision *= venta;
        totalPrecio = ventaCarro * venta;
        porcentajeVenta = totalPrecio * 0.05f;
        salarioMensual = SALARIO + comision + porcentajeVenta;
        System.out.println("El salario mensual es: " + salarioMensual);
        
    }
    
}
