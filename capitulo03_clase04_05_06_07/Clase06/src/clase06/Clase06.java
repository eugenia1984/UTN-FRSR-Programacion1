package clase06;

import java.util.Scanner;

/**
 * @author Maria Eugenia Costa
 */
public class Clase06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // OPERADORES
        int num1 = 5;
        int num2 = 4;
        // Para tenerlas en el mismo segmento (no se puede hacer con var)
        // int num1 = 5, int num2 = 4;
        int suma= num1 + num2; // + esta sumando
        System.out.println("Solucion de la suma : " + suma);
        int resta = num1 - num2; // - esta restando
        System.out.println("Solucion de la resta: " + resta);
        int multiplicacion = num1 * num2; // * esta multiplicando
        System.out.println("Solucion de la multiplicacion: " + multiplicacion);
        float division = num1 / num2;  // / es la division
        System.out.println("Solucion de la division es: " + division);
        float residuo = num1 % num2; // % guarda el resto/residuo de la division
        System.out.println("Solucion del resto: " + residuo);
        // IF ELSE
        if (num1 % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        // OPERADOR DE ASIGNACION
        int num3 = 1;
        int num4 = 4;
        int num5 = num3 + 6 - num4;  // 1 + 6 - 4 = 3
        System.out.println("num5: " + num5);  
        // OPERADOR DE COMPOSICION : suma
        num3 += 1; // 1 + 1 = 2 
        /*
        Ejericio:
        Hacer un programa que calcule e imprima el salario de un empleado, 
        a partir de sus horas semanales trabajadas y de su salario por hora.
        */
        int horasTrabajadas;
        float precioPorHora;
        float salario;
        System.out.println("Vamos a calcular su salario");
        System.out.println("Ingrese las horas trabajadas en el mes: ");
        horasTrabajadas = entrada.nextInt();
        System.out.println("Ingrese el precio de la hora de trabajo: ");
        precioPorHora = entrada.nextFloat();
        salario = horasTrabajadas * precioPorHora;
        System.out.println("Su sueldo emnsual es de: $ " + salario);
    } 
}
