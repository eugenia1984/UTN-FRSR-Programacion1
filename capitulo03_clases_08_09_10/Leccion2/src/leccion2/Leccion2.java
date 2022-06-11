package leccion2;

/**
 * @author Maria Eugenia Costa
 */
public class Leccion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IF ELSE : PRIMER EJERCICIO 
        boolean condicion = true;
        if (condicion) {
            System.out.println("Condicion Verdadera");
        } else {
            System.out.println("Condicion Falsa");
        }
        // IF ELSE: SEGUNDO EJERCICIO
        int numero = 2;
        String numeroTexto = "Numero desconocido";
        
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2)  {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if(numero  == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto: " + numeroTexto);
        
    }
}
