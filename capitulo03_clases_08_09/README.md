# :book: Clase 8 y 9

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