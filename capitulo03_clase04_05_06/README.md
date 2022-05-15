# :book: Capitulo 3: Clases 4, 5 y 6 - Tipos Primitivos en Java (29 Abril, 6 y 13 Mayo)

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

- El caracter va entre comillas simples ''.

- caracteres UNICODE, la primer versión fue en 1991, version 1.0.0 y comenzo con 7.129 caracteres, a traves de las nuevas versiones se fueron modificando, hasta llegar a los **144.697 caracteres**, que son los que tienen actualmente.


```Java
package capitulo3primitivos;

public class Capitulo3Primitivos {

    public static void main(String[] args) {
	char miVariableChar = 'a';
        System.out.println("miVariableChar: " + miVariableChar);
    }  
}
```

OUTPUT:

```
miVariableChar: a
```

---

## :star: 3.6 Tipo boolean:

---

## :star: 3.7 Conversión de tipos primitivos: Ejercicio Parte 1

---

## :star: 3.8 Conversión de tipos primitivos: Ejercicio Parte 2

---

## :star: 3.9 Cuestionario 1: Preguntas de variables |       Cuestionario 2: Preguntas de números

---

## :star: Tarea 3: Tienda de libros = Solución

---