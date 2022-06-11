package consicionalejercicio1;

import java.util.Scanner;

/**
 * @author jMaria Eugenia Costa
 */
public class ConsicionalEjercicio1 {

    public static void main(String[] args) {
        // IF ELSE ESTACIONES DEL AÑO
        Scanner read = new Scanner(System.in);
        int mes;
        String estacion = "Estacion desconocida";
        System.out.println("Ingrese un mes del año (en numero): ");
        mes = read.nextInt();
        if (mes == 1 ||mes == 2 ||mes == 3) {
            estacion = "Verano";
        } else if (mes == 4 || mes == 5 ||mes == 6) {
            estacion = "Otoño";
        } else if (mes == 7 || mes == 8 || mes == 9) {
            estacion ="Invierno";
        } else if (mes == 10 || mes == 11 || mes ==12) {
            estacion ="Primavera";
        } else {
            estacion = "Mes invalido";
        }
        System.out.println("Es: " + estacion);
        // SWITCH
        int numero;
        String numeroATexto = "Valor desconocido";
        System.out.println("Ingrese un numero entre 1 al 4 : ");
        numero = read.nextInt();
        switch (numero) {
            case 1:
                numeroATexto = "Numero uno";
                break;
            case 2:
                numeroATexto = "Numero dos";
                break;
            case 3:
                numeroATexto = "Numero tres";
                break;
            case 4:
                numeroATexto = "Numero cuatro";
                break;
            default:
                numeroATexto ="No cumplio la consigna";
        }
        System.out.println("numeroATexto: " + numeroATexto);
    }
    
}
