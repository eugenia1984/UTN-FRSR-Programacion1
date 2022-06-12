package condicionalejercicio2;

import java.util.Scanner;

/**
 * @author Maria Eugenia Costa
 */
public class CondicionalEjercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int mes;
        String estacion = "Estacion desconocida";
        System.out.println("ingresa un mes (en numero): ");
        mes = read.nextInt();
        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion ="Verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion ="Otoño";
                break;
            case 7:
            case 8:
            case 9:
                estacion ="Invierno";
                break;
            case 10:
            case 11:
            case 12:
                estacion ="Primavera";
                break;
            default:
                estacion="No ingreso la estacion correcta";
        }
        System.out.println("Estacion: " + estacion);
    }
    
}
