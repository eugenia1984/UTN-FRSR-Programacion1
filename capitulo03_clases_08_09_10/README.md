# :book: Clase 8 , 9 y 10

---

## :book: Clase 8

---

## :star: Ejercicio : Rectángulo

Se solicita calcular el área y el perímetro de un rectángulo, para esto deberemos crear las variables:

- Alto (int)

- Ancho(int)

El usuario debe proporcionar los valores de alto, ancho y después se debe imprimir el resultado en el siguiente formato: (recuerden no usar acentos, respetar los espacios, mayúsculas, minúsculas y saltos de líneas.

Le decimos al usuario:
Digite el alto del rectángulo:
Digite el ancho del rectángulo:

Fórmula: 

**Área = alto * ancho;**

**Perímetro = (alto + ancho) * 2;**

¿Cuál es el código del ejercicio planteado?


```Java
package clase8;
/**
 * @author Maria Eugenia Costa
 */
public class Clase8 {

    public static void main(String[] args) {
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
```
---

##  :star: Ejercicio: El mayor de 2 números

Usaremos el Operador Ternario

Le vamos a pedir los números al usuario


---

## :star: Prioridades


| Prior. | Operador | Tipo deOperador | Operacion |
| ------ | -------- | --------------- | --------- |
| 1 | ++ | aritmetico | incremento previo o posterior |
| 1 | -- | aritmetico | decremento previo o posterior |
| 1 | +, - | aritmetico | suma o resta unaria |
| 2 | (tipo) | cualquiera | | 
| 3 | * / & | aritmetico | multiplicaicon division resto |
| 4 | + - |aritmetico | suma resta |
| 4 | + | cadena | concatenacion |
| 5 | << | integral | desplazamiento de bits a la izq |
| 5 | >> | integral | desplazamiento de bits a la der con inclusion de signo |
| 5 | >>> | integral | desplazamiento de bits a la der con inclusion de vero |
| 6 | < , <= | aritmetico | menor que, menor o igual que |
| 6 | > , >= | aritmetico | mayor que, mayor o igual que |
| 6 | instance of | objeto, tipo | comparacion de tipos |
| 7 | == | primitivo | igual (valores identicos) |
| 7 | ¡= | primitivo | desigual (valores difernetes) |
| 7 | == | objeto | igual (referencia la mismo objeto) |
| 7 | ¡= | objeto | desigual (referencia a distintos objetos) |
| 8 | & | integral | cambio a bits AND |
| 8 | & | booleano | producto booleano |
| 9 | ^ | integral | cambio de bits XOR |
| 9 | ^ | booleano | suma exclusiva booleana |
| 10 | ```|``` | integral | cambio de bits OR |
| 10 | ```|``` | booleano | suma booleana |
| 11 | && | booleano | AND condicional |
| 12 | ```||``` | booleano | OR condicional |
| 13 | ```? :``` | booleano, cualquiera, cualquiera | operador condicional ternario |
| 14 | ```=``` | variable cualquiera | asignacion | 
| 14 | ```*=``` | variable cualquiera | asignacion | 
| 14 | ```/=``` | variable cualquiera | asignacion | 
| 14 | ```%=``` | variable cualquiera | asignacion | 
| 14 | ```+=``` | variable cualquiera | asignacion | 
| 14 | ```-=``` | variable cualquiera | asignacion | 
| 14 | ```<<=``` | variable cualquiera | asignacion | 
| 14 | ```>>=``` | variable cualquiera | asignacion | 
| 14 | ```&=``` | variable cualquiera | asignacion | 
| 14 | ```^=``` | variable cualquiera | asignacion | 
| 14 | ```!=``` | variable cualquiera | asignacion | 

---

## Operadores  unarios

```Java
package clase8;
/**
 * @author Maria Eugenia Costa
 */
public class Clase8 {

    public static void main(String[] args) {
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
    }
    
}
```

---


## Operador de igualdad y operadores relacionales

```Java
package clase8;
/**
 * @author Maria Eugenia Costa
 */
public class Clase8 {

    public static void main(String[] args) {
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
    }
    
}
```

---


## IF - ELSE

### Vemos si es mayor de edad

```Java
package clase8;
/**
 * @author Maria Eugenia Costa
 */
public class Clase8 {

    public static void main(String[] args) {
	// IF ELSE
        int edad = 30;
        int adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    } 
}
```

---


## CONDICIONALES

### Vemos si es mayor de edad, con el operador AND (&&)

```Java
package clase8;
/**
 * @author Maria Eugenia Costa
 */
public class Clase8 {

    public static void main(String[] args) {
	 int valorA = 7;
        int  valorMinimo = 0;
        int valorMaximo = 10;
        boolean respuesta = valorA > 0 && valorA <= 10; // va a estar entre 0 y 10
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }
    } 
}
```

### Vemos con el operador OR (||)

```Java
package clase8;
/**
 * @author Maria Eugenia Costa
 */
public class Clase8 {

    public static void main(String[] args) {
	boolean vacaciones = false;
        boolean diaLibre = false;
        if (vacaciones || diaLibre) { // ||operador or, con que uno sea treu ya es true
            System.out.println("Papa puede asistir al juego de su hijo");
        } else {
            System.out.println("Papa no puede asistir al juego de su hijo");
        }
    } 
}
```
---

## OPERADOR TERNARIO

CONDICION A EVALUAR -> ACCION POR TRUE -> ACCION POR FALSE

-  sirve para simplificar la expresion IF - ELSE


```Java
var resultadoTernario = ((5 > 4) ? "Verdadero" ? "Falso";
```


```Java
var numeroTernario = 7;
resultadoTernario = ( numeroTernario % 2 == 0 ) ? "Es par" ? "Es impar";
```


---
---

## :book: Clase 9

## Primer ejercicio

Hacer un programa que calcule e imprima la suma de tres calificaciones.

Pedir las calificaciones al usuario

Crear un nuevo proyecto llamado **ejercicio5**


```Java
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
```

->> [lo podes ver en ejercicio5](https://github.com/eugenia1984/UTN-FRSR-Programacion1/tree/main/capitulo03_clases_08_09/ejercicio5)

## Segundo ejercicio:

Guillermo tiene N dolares.

Luis tiene la mitad de lo que posee Guillermo.

Juan tiene la mitad de lo que posee Luis y Guillermo juntos.

Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.

Crear un nuevo proyecto llamado ejercicio 6.


```Java
package ejercicio6;

import java.util.Scanner;
/**
 * @author Maria Eugenia costa
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.println("Ingrese la cantidad de dinero de Guillermo: ");
        guillermo = read.nextFloat();
        luis = guillermo / 2;
        juan = (luis + guillermo ) / 2;
        total = luis + guillermo + juan;
        System.out.println("El dinero de Luis es: USD " + luis);
        System.out.println("El dinero de Juan es: USD " + juan);
        System.out.println("El total del dinero es: USD " + total);
    }
    
}
```


->> [lo podes ver en ejercicio 6](https://github.com/eugenia1984/UTN-FRSR-Programacion1/tree/main/capitulo03_clases_08_09/ejercicio6)

---


## Tercer ejercicio

Una compañia de venta de carros usados, paga a su personal de ventas un salario de $ 1000 mensuales mas una comision de $ 150 por cada carro vendido, mas el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.

Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.

El salario de 1000 lo vamos a manejar como un dato constante, para asignarlo debemos usar la palabra reservada final.


Crear un nuevo proyecto llamado ejercicio 7.


```Java
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
```


->> [lo podes ver en ejercicio 7](https://github.com/eugenia1984/UTN-FRSR-Programacion1/tree/main/capitulo03_clases_08_09/ejercicio7)

---
---


## :book: Clase 10

### :star: Sentencia de Control if else


Diagrama de flujo:

```
          INICIO
            |
            V
    ---- CONDICION ---
    |                 |
  false             true
    |                 |
    V                 V
 bloque            bloque
    2                 1
    |                 |
    -------------------
             |
             V
            FIN
```

### :star: Nuevo proyecto: Leccion2

#### IF - ELSe -> condicional doble

```Java
package leccion2;

/**
 * @author Maria Eugenia Costa
 */
public class Leccion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IF ELSE  
        boolean condicion = true;
        if (condicion) {
            System.out.println("Condicion Verdadera");
        } else {
            System.out.println("Condicion Falsa");
        }
    }
}
```

---

##  :star: Ejercicio con la estructura if else


```Java
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
        
    }
}
```

---

## :star: Cálculo de las estaciones del año con if else

Crear un nuevo proyecto con el nombre **CondicionalEjercicio1**

```Java
package consicionalejercicio1;

import java.util.Scanner;

/**
 * @author jMaria Eugenia Costa
 */
public class ConsicionalEjercicio1 {

    public static void main(String[] args) {
        // TIF ELSE ESTACIONES DEL AÑO
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
    }
    
}
```


---

## :star:  Sentencia de Control Switch

```
EXPRESION
  |
  |---caso1---> INSTRUCCIONES1 ---  --> |
  |                                     |
  |---caso2---> INSTRUCCIONES2 -------> |
  |                                     |
  |---caso3---> INSTRUCCIONES3 -------> |
  |                                     |
  |-->default-->instrucciones---------->|
```

->> LUEGO DE CADA CASE VA EL **BREAK**, ASI AL ENCONTRAR EL CASE QUE SEA ROMPE EL SITCH Y SALE, NO SIGUE BUSCANDO.

```Java
package consicionalejercicio1;

import java.util.Scanner;

/**
 * @author jMaria Eugenia Costa
 */
public class ConsicionalEjercicio1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
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
```

---

##  Ejercicio: Cálculo de las estaciones del año con Switch 

Creamos un nuevo proyecto **CondicionalEjercicio2**


```Java
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

```

---

## Ejercicio: sistema de calificaciones con if else, como tarea hacerlo también con la sentencia de control switch

Creamos un nuevo proyecto: **CondicionalEjercicio3**

```Java
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
```


---
---