# :book: Capitulo 3: Clases 4, 5 , 6 y 7 - Tipos Primitivos y Operadores en Java (29 Abril, 6 , 13 Mayo y 20 de Mayo)

## Temas:

- 3.1 Tipos Primitivos

- 3.2 Tipos numéricos Enteros

- 3.3 Tipos Flotantes: Ejercicio

- 3.4 Inferencia de tipos con var y tipos primitivos

- 3.5 Tipo char: Ejercicio

- 3.6 Tipo boolean: Ejercicio

- 3.7 Conversión de tipos primitivos: Ejercicio Parte 1

- 3.8 Conversión de tipos primitivos: Ejercicio Parte 2

- 3.9 Cuestionario 1: Preguntas de variables |  Cuestionario 2: Preguntas de números

- Tarea 3: Tienda de libros = Solución

---
---

## Tip: comentarios

Como todos los lenguajes Java tiene dos formas de comentar el código:

- Comentario de una línea, se marca con **//**.

Ejemplo:
```Java
// este es un comentario en linea
```

- Comentario multilínea, comienza con ```/*``` (abre) y finaliza con ```*/``` (cierra).

Ejemplo:
```Java
/* este es un 
comentario
multilinea */
```

-> También tenemos *Java DOC* que es para documentar.

---
---

## :star:  3.1 Tipos Primitivos

- Tipos primitivos **ENTEROS** : *byte*, *short*, *int* y *long*.

- Tipos primitivos **FLOTANTES** : *float* y *double*


---

## :star:  3.2 Tipos numéricos Enteros 


Comenzamos con los **tipos primitivos ENTEROS** : *byte*, *short*, *int* y *long*.

### byte

Este es el más pequeño de los tipos primitivos enteros, el más común y más utilizado es el **int**, por el hecho que los CPU son de 32 o de 64 bits.

Ahora podemos utilizar el tipo **byte**, pues al uarlo no garantiza que utilicemos solamente **8 bits**, ya que posiblemente estos 8 bits se van a almacenar en los **32 bits** que componen una palabra de una arquitectura de 32 bits. Esto es un detalle técnico, pero es importante saberlo.

- Valor mínimo del byte: -128

- Valor máximo del byte: 127

```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
        // byte de -128 a 127
        System.out.println("Valor mínimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte: " + Byte.MAX_VALUE);
    }  
}
```

El OUTPUT es :
```
Valor mínimo del byte: -128
Valor máximo del byte: 127
```


### short

- Almacena hasta 16 bits

- Valor mínimo del short: -32.768

- Valor máximo del short: 32.767


```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
        // short alamacena hasta 16 bits
        short numEnteroShort = 129;
        System.out.println("numEnteroShort: " + numEnteroShort);
        System.out.println("Valor mínimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del short: " + Short.MAX_VALUE);
    }  
}
```

El OUTPUT es:
```
numEnteroShort: 129
Valor mínimo del short: -32768
Valor máximo del short: 32767
```

### int

- Valor mínimo del int: -2.147.483.648 -2147483648

- Valor máximo del int: 2.147.483.647 2147483647

```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	// int, del -2147483648 al 2147483647
        int numEnteroInt = 32768;
        System.out.println("numEnteroInt: " + numEnteroInt);
        System.out.println("Valor mínimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del int: " + Integer.MAX_VALUE);
    }  
}
```

El OUTPUT es:
```
numEnteroInt: 32768
Valor mínimo del int: -2147483648
Valor máximo del int: 2147483647
```

### long 

- 64 bits

- Valor mínimo del int: -92.223.372.036.854.775.808

- Valor máximo del int: 92.233.720.368.547.758

-> *Recordar que por defaul Java va a asignar el tipo* **int** *por eso en este ejemplo utilizo* **L** *para indicar que es de tipo* **long**

```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	// long L
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong: " + numEnteroLong);
        System.out.println("Valor mínimo del int: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del int: " + Long.MAX_VALUE);
        
    }  
}
```

El OUTPUT es:
```
numEnteroLong: 9223372036854775807
Valor mínimo del int: -9223372036854775808
Valor máximo del int: 9223372036854775807
```


---

## :star: 3.3 Tipos Numéricos Flotantes (Decimales)

Los **flotantes** son con **punto decimal**.

Tenemos el **float** de **32 bits** y el **double** de **64 bits**.

Las literales en Java por default son de tipo **double**, así que un double tiene 64 bits, no se puede alamcenar de manera inmediata a un tipo float.

### float

- 32 bits

- Valor mínimo de float: 1.4E-45

- Valor mínimo de float: 3.4028235E38

Como por defecto Java toma de tipo double para indicar que es flotat debo poner al final del númeor la letra **F** (puede ser tanto F como f, pero se aconseja utilizar mayúscula).
```Java
float numFolat = 10,0F;
```

Otro modo es haciendo el casteo: 
```Java
float numFolat = (float)10,0;
```

```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	 // float
        float numFloat = 10.0F; // otro modo de casteo: (float)10.0
        System.out.println("numFloat: " + numFloat);
        System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor mínimo de float: " + Float.MAX_VALUE);
    }  
}
```

El OUTPUT es:
```
numFloat: 10.0
Valor mínimo de float: 1.4E-45
Valor mínimo de float: 3.4028235E38
```

### double

- 64 bits

Para hacer el casteo hay dos modos:

```Java
double numDouble = 1.7976931348623157E308D;
```

Y de manera explicita: 
```Java
double numDouble = (double)1.7976931348623157E308;
```


```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	//double
 	double numDouble = 1.7976931348623157E308;
        System.out.println("numFloat: " + numDouble);
        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de double: " + Double.MAX_VALUE);
    }  
}
```

El OUTPUT es:
```
1.7976931348623157E308
Valor mínimo de double: 4.9E-324
Valor máximo de double: 1.7976931348623157E308
```

###Tipos Numéricos Flotantes: Ejercicio

Es todo el codigo que ya fui mostrando en cada tipo, tamibén está en la carpeta [**Capitulo3Primitivos**](https://github.com/eugenia1984/UTN-FRSR-Programacion1/tree/main/capitulo03_clases04_05_06/Capitulo3Primitivos)

---

## :star: 3.4 Inferencia de tipos con var y tipos primitivos


```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	var numEntero = 20; // las literales sin punto automaticamente son de tipo iNT
	var numDouble = 10.0;  // al tener el . es de tipo DOUBLE
	var numFloat = 10.0F; // al tener la F es de tippo FLOAT
	System.out.println("numEntero: " + numEntero); // numEntero: 20
	System.out.println("numDouble: " + numDouble); // numDouble: 10.0
	System.out.println("numFloat: " + numFloat); // numFloat: 10.0
    }  
}
```

Si agrego un **breakpoint** en ```var numEntero = 20;``` y en modo debug voy en paso a paso voy a ver en ese momento que mi variable *numEntero* es de tipo **int**.

Y si agrego otro **breakpoint** en ```var numDouble = 10.0;``` y en modo debug voy en paso a paso voy a ver en ese momento que mi variable *numDouble* es de tipo **double**.

Y si agrego otro **breakpoint** en ```var numFloat = 10.0F;``` y en modo debug voy en paso a paso voy a ver en ese momento que mi variable *numFloat* es de tipo **float**.

Con **F8** tenemos el shortcut del **step over** (próximo paso).

---

## :star: 3.5 Tipo char: 

- Puede alamcenar un solo caracter.

- de **16 bits**

- El caracter va entre comillas simples ''.

- caracteres UNICODE, la primer versión fue en 1991, version 1.0.0 y comenzo con 7.129 caracteres, a traves de las nuevas versiones se fueron modificando, hasta llegar a los **144.697 caracteres**, que son los que tienen actualmente.

- Se puede nombrar de distintas formas, por ejemplo...

... con **#** tenemos: **code** (U+0023), **decimal** (35), **octal** (043)

... con **null** tenemos: **code** (U+0000), **decimal** (0), **octal** (000)



```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	char miVariableChar = 'a';
        System.out.println("miVariableChar: " + miVariableChar);
	char caracterUnicode = '\u0024'; // indicamos a Java la asignacion en valor UNICODE
        System.out.println("caracterUnicode: " + caracterUnicode);
	char caracterDecimal = 36;
        System.out.println("caracterDecimal: " + caracterDecimal);
 	char caracterSimbolo = '$';
        System.out.println("caracterSimbolo: " + caracterSimbolo);
    }  
}
```



OUTPUT:

```
miVariableChar: a
caracterUnicode: $
caracterDecimal: $
caracterSimbolo: $
```

Con **var**:

```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	var caracterUnicode1 = '\u0024'; // indicamos a Java la asignacion en valor UNICODE
        System.out.println("caracterUnicode1: " + caracterUnicode);
	var caracterDecimal1 = 36;
        System.out.println("caracterDecimal1: " + caracterDecimal);
 	var caracterSimbolo1 = '$';
        System.out.println("caracterSimbolo1: " + caracterSimbolo);
    }  
}
```

OUTPUT:

```
caracterUnicode1: $
caracterDecimal1: 36
caracterSimbolo1: $
```

Para que con **var** nos lo tome como **char** debo realizar el **casteo**:

```var caracterDecimal1 = (char)36;```

-> Un char se puede asignar a un tipo entero, porque el int es de 32 bits y el char es de 16 bits.


```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	var varEnteroChar = '$'; 
        System.out.println("varEnteroChar: " + varEnteroChar);
    }  
}
```

OUTPUT:

```
varEnteroChar: 36
```

-> muestra el valor decimal asociado al simbolo.


```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	int caracterChar = 'b'; 
        System.out.println("caracterChar: " + caracterChar);
    }  
}
```

OUTPUT:

```
caracterChar: 98
```


---

## :star: 3.6 Tipo boolean:


- Dos valores: **true** o **false**.

- son **flag** (bandera): true/verde , false/rojo, si lo pensamos como un semaforo.

- las podemos usar en los condicionales

```Java
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
    } 
}
```

OUTPUT:
```
variableBooleana: true
Es verdadera. La bandera es verde
Es falsa. La bandera es roja
```

Rehacemos el ejercicio de ser menor de edad practicado con PseInt, pero con Java:

```Java
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
        // Algoritmo : ¿es mayor de edad ?
        int edad = 30;
        boolean adulto = edad >=18;
        if (adulto) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    } 
}
```

OUTPUT:
```
Eres mayor de edad
```

Otro modo es en la parte del **if** dejar ya la **condicion**:


```Java
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
        // Algoritmo : ¿es mayor de edad ?
        int edad2 = 15;
        if (edad2 >=18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    } 
}
```

OUTPUT:
```
Eres menor de edad
```

---

## :star: 3.7 y 3.8 Conversión de tipos primitivos: Ejercicio Parte 1 y 2

- **Integer.parseInt()** para castear a **int** teniendo un String (String -> int)

```Java
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
        // Conversion de tipo primitivos
        var edad = Integer.parseInt("20");
	System.out.println("edad - " + edad);
	System.out.println("edad - " + edad + 1);
	var edad2 = "20";
	System.out.println("edad2 - " + edad2 + 1);
}
```

-> Con la variable **edad**, en ```edad + 1``` como edad fue casteado a **int** se suman los valores.

-> Con la variable **edad2**, en ```edad2 + 1``` como edad2 NO fue casteado a **int**, sigue siendo **String** por lo que concatena y muestra **201**

OUTPUT:
```
edad - 20
edad - 21
edad - 201
```

- **.parseDouble()** para castear de String a double.


```Java
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
        // Conversion de tipo primitivos
        var valorPi = Double.parseDouble("3.1416");
	System.out.println("valorPi - " + valorPI);
}
```

OUTPUT:
```
valorPi - 3.1416
```

- con **Scanner** el INOUT es de tipo **String**, si utilizamos **.nextLine()** espera un String, si quiero manejar otro valor, entonces debería castearlo.


```Java
/*
 * Clases 4, 5 y 6 - Capitulo 3 - Datos primitivos
 */
package capitulo3primitivos;
import java.util.Scanner;

/**
 *
 * @author María Eugenia Costa
 */
public class Capitulo3Primitivos {

    public static void main(String[] args) {
        // Conversion de tipo primitivos
        var entrada = new Scanner(System.in);
	System.out.println("Digite su edad: ");
	// conversion de tipo de la clase Scanner
	edad = Integer.parseInt(entrada.nextLine());
	var edadTexto = String.valueOf(10);
	System.out.println("edadTexto: " + edadTexto);
	var fraseChar = "programadores"; // es de tipo STRING
	fraseChar1 = fraseChar.charAt(0); // 'p'
	fraseChar2 = fraseChar.charAt(1); // 'r'
	System.out.println("programadores, tiene como primer caracter: " + frase1);
	System.out.println("programadores, tiene como segundo caracter: " + frase2);
	System.out.println("Digite un caracter: ");
	fraseChar2 = entrada.nextLine().charAt(0);
	System.out.println("fraseChar2: " + fraseChar2);
    }
}
```

-> Para utilizar **Scanner** debo tenerlo importado: ```import java.util.Scanner;```

-> con **.charAt()** tomo un solo caracter de una String. Un ejemplo con datos ingresados por teclado:

```
System.out.println("Digite un caracter: ");
fraseChar2 = entrada.nextLine().charAt(0);
```


---


## :star: 3.9 

Realizar en el campus:

- Cuestionario 1: Preguntas de variables 

- Cuestionario 2: Preguntas de números

-> realizado en el campus

---

## :star: Tarea 3: Tienda de libros = Solución del equipo:

```Java
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
```

---
---


## :star: Clase 7 - Operadores


```
Operadores Aritméticos:  +, -, *, /, % 

Operadores de Relación: <, >, <=, >=, !=, ==

Operadores lógicos:  && o &, || o |, !, ^

Operadores unitarios:   ~, -

Operadores a nivel bits:  &, |, ^, <<, >>, >>>

Operadores de asignación: ++, --, =, *=, /=, %=, +=, -=, <<=, >>=, >>>=, &=, |=, ^=
Operador condicional: ?:
```


## Precedencia de operadores

Más Alta
```
unarios
aritmeticos
desplazamiento
comprobacion de tipos
igualdad
logicos
condicionales
```
Más Baja

---

## Ejemplos en codigo:


```Java
package clase06;
/**
 * @author Maria Eugenia Costa
 */
public class Clase06 {

    public static void main(String[] args) {
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
	// OPERADOR DE COMPOSICION
        num3 += 1; // 1 + 1 = 2 
    }
    
}

```

## Ejercicio 2:

Hacer un programa que calcule e imprima el salario de un empleado, a partir de sus horas semanales trabajadas y de su salario por hora.

```Java
package clase06;

import java.util.Scanner;

/**
 * @author Maria Eugenia Costa
 */
public class Clase06 {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
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


```


---
---
