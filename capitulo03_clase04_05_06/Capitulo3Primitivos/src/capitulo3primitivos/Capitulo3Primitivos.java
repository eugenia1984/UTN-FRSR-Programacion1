/*
 * Clases 4, 5 y 6 - Capitulo 3 - Datos primitivos
 */
package capitulo3primitivos;

/**
 *
 * @author María Eugenia Costa
 */
public class Capitulo3Primitivos {

    public static void main(String[] args) {
        // tipos primitivos numericos: byte, short, int, long, float, double
        // byte de -128 a 127
        byte numEnteroByte = 10;
        System.out.println("numEnteroByte: " + numEnteroByte);
        System.out.println("Valor mínimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte: " + Byte.MAX_VALUE);
        // short almacena hasta 16 bits, de -32768 al 32767
        short numEnteroShort = 129;
        System.out.println("numEnteroShort: " + numEnteroShort);
        System.out.println("Valor mínimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del short: " + Short.MAX_VALUE);
        // int  del -2147483648 al 2147483647
        int numEnteroInt = 32768;
        System.out.println("numEnteroInt: " + numEnteroInt);
        System.out.println("Valor mínimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del int: " + Integer.MAX_VALUE);
        // long L
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong: " + numEnteroLong);
        System.out.println("Valor mínimo del int: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del int: " + Long.MAX_VALUE);
        // float
        float numFloat = 10.0F; // otro modo de casteo: (float)10.0
        System.out.println("numFloat: " + numFloat);
        System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor mínimo de float: " + Float.MAX_VALUE);
        //double
        double numDouble = 1.7976931348623157E308;
        System.out.println("numFloat: " + numDouble);
        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de double: " + Double.MAX_VALUE); 
        // tipo primitivo: char
        char miVariableChar = 'a';
        System.out.println("miVariableChar: " + miVariableChar);
        char caracterUnicode = '\u0024'; // indicamos a Java la asignacion en valor UNICODE
        System.out.println("caracterUnicode: " + caracterUnicode);
        char caracterDecimal = 36;
        System.out.println("caracterDecimal: " + caracterDecimal);
        char caracterSimbolo = '$';
        System.out.println("caracterSimbolo: " + caracterSimbolo);
        // tipo primitivo : booleanos
        boolean variableBooleana = true;
        System.out.println("variableBooleana: " + variableBooleana);
        // condicional IF
        if (variableBooleana) {
            System.out.println("Es verdadera. La bandera es verde");
        }
        // condicional: IF ELSE
        boolean variableBooleana2 = false;
        if (variableBooleana2) {
            System.out.println("Es verdadera. La bandera es verde");
        } else {
            System.out.println("Es falsa. La bandera es roja");
        }
        // Algoritmo : ¿es mayor de edad ?
        int edad = 30;
        boolean adulto = edad >=18;
        if (adulto) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        // Algoritmo con la condicion dentro del if
        int edad2 = 15;
        if (edad2 >=18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    } 
}
