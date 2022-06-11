package clase8;

import java.util.Scanner;

/**
 * @author Maria Eugenia Costa
 */
public class Clase8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Operadores Unarios
        int num1 = 7;
        int num2 = -num1; // cambio de signo: -7
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        // operador de negacion
        boolean boleano = true;
        boolean boleanoNegado = !boleano; // false
        System.out.println("boleano: " + boleano);
        System.out.println("boleanoNegado: " + boleanoNegado);
        // Operador unario de incremento: preincremento
        int num3 = 9;
        int num4 = ++num3;
        System.out.println("num3: " + num3); //10
        System.out.println("num4: " + num4); //10
        // Operador unario de incremento: postincremento
        int num5 = 3;
        int num6 = num5++;
        System.out.println("num5: " + num5); // 4
        System.out.println("num6: " + num6); // 3
        // Operador unario de decremento: predecremento
        int num7 = 4;
        int num8 = --num7;
        System.out.println("num7: " + num7); // 4
        System.out.println("num8: " + num8); // 2
        // Operador unario de decremento: postdecremento
        int num9 = 8;
        int num10 = num9--;
        System.out.println("num9: " + num9); // 7
        System.out.println("num1: " + num10); // 8
        // Operador de igualdad
        int numA = 5;
        int numB = 4;
        boolean numC = numA == numB;
        boolean numD = numA != numB;
        System.out.println("numC: " + numC); // false
        System.out.println("numD: " + numD); // true
        String cadenaA = "Hello";
        String cadenaB ="bye bye";
        boolean cadenaComparada = cadenaA == cadenaB; // eta re mal, hay que usar .isequal()
        System.out.println("cadenoComparada: " + cadenaComparada); // false      
        // operadores relacionales
        boolean esMayor = num9 > num10; // > es mayor que ...
        boolean esDiferente = num9 != num10; // != es diferente que...
        System.out.println("esMayor: " + esMayor); // false
        System.out.println("esDifernete: " + esDiferente); // true
        // IF ELSE
        int edad = 30;
        int adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        // Condicionales: EJEMPLO 1
        int valorA = 7;
        int  valorMinimo = 0;
        int valorMaximo = 10;
        boolean respuesta = valorA > 0 && valorA <= 10; // va a estar entre 0 y 10
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }
        // CONDICIONALES: EJEMPLO 2
        boolean vacaciones = false;
        boolean diaLibre = false;
        if (vacaciones || diaLibre) { // ||operador or, con que uno sea treu ya es true
            System.out.println("Papa puede asistir al juego de su hijo");
        } else {
            System.out.println("Papa no puede asistir al juego de su hijo");
        }
        /*
        Se solicita calcular el área y el perímetro de un rectángulo, para 
        esto deberemos crear las variables:
        - Alto (int)
        - Ancho(int)
        El usuario debe proporcionar los valores de alto, ancho y después se 
        debe imprimir el resultado en el siguiente formato: (recuerden no usar 
        acentos, respetar los espacios, mayúsculas, minúsculas y saltos de líneas.

        Le decimos al usuario:
        Digite el alto del rectángulo:
        Digite el ancho del rectángulo:

        Fórmula: 
        Área = alto * ancho;
        Perímetro = (alto + ancho) * 2;
        */
        int alto;
        int ancho;
        System.out.println("Ingrese el alto del rectangulo: ");
        alto = leer.nextInt();
        System.out.println("Ingrese el ancho del rectangulo: ");
        ancho = leer.nextInt();
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es : " + perimetro);
                
          
    } 
}
