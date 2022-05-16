
package clase6trabajopractico;

import java.util.Scanner;


public class Clase6TrabajoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombreLibro;
        int idLibro;
        double precioLibro;
        boolean envioGratuito;
        
        System.out.println("Ingrese un nombre: ");
        nombreLibro = entrada.nextLine();
        System.out.println("Ingrese el id del libro: ");
        idLibro = entrada.nextInt();
        System.out.println("Ingrese el precio del libro: ");
        precioLibro = entrada.nextDouble();
        System.out.println("Indicar si el envío es gratuito (True/False)");
        envioGratuito = entrada.nextBoolean();
        System.out.println("Nombre: " + nombreLibro);
        System.out.println("ID: " + idLibro);
        System.out.println("Precio: " + precioLibro);
        System.out.println("Envío Gratuito? " + envioGratuito);   
    }  
}
