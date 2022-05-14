# :book: Capitulo 1: Clases 2 y 3 Variables en Java (13APR y 22 APR)

## Temas:

- 2.1 Variables

- 2.2 Tipos enteros y String

- 2.3 Inferencia de tipos

- 2.4 Reglas para definir una variable

- 2.5 Concatenación: Ejercicio

- 2.6 Caracteres especiales

- 2.7 Clase Scanner: Ejercicio

---


## :star:  2.1 Variables

```
VARIABLES EN JAVA
-SUJETO A CAMBIO
-PERMITE INTERACTUAR
-ALMACENA VALORES
```

- Una variable nos va a permitir guardar información, esta inforamción van a ser los datos que vamos a procesar con nuestro programa, estos datos van a variar según la información que estemos recibiendo por parte del usuario o del tipo de información que estemos procesando.


- Nuestras variables pueden almacenar distintos tipos de datos: numéricos, textos o cadenas, hacen. referencias a Objetos


## Variables y operadores

- En Java, como en cualquier lenguaje de programación, para almacenar información, es necesaria la creación de **variables**, las cuales nos permitirán almacenar datos de nuestro programa de manera temporal.

- El objetivo de declarar una variable es reservar espacio de memoria dependiendo del tipo que vayamos a utilizar.

- Estas variables nos permiten también hacer programas dinámicos, por lo que en la mayoría de los casos los valores cambiarán durante la interacción con el usuario y el programa. 

**variable**...

... espacio en memoria que se define en un programa de computador para almacenar de forma temporal un valor de tipo de dato basico, el cual puede cambiar (tomar otros valores).

... los valores pueden cambiar mientras se esta ejecutando un programa de computador

... las variables en Java solo aceptan valores de un tipo de dato.


Por ejemplo tenemos:

```Java
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	int x = 5;
	x= -8;
	x = 2000;
    }
}
```

A lo largo del programa, la varaible **x** paso de guardar **5** a guardar **-8** a guardar **2000*, todos son tipo de dato **int**, el tipo de dato NO cambia.




En Java existen distintos datos:

```
 tipos primitivos en Java
    |            |
    v            v
  Enteros     Flotantes
``` 

-> Estos tipos de Java son los más básicos y son los que utilizaremos si necesitamos la mayor rapidez y ahorro en recursos, con el objetivo de que nuestros algoritmos sean lo más eficientes. Sin embargo en la práctica utilizaremos también funciones ya creadas que pueden hacer uso de manera indirecta de estos tipos primitivos, así que de cualquier manera los estaremos manejando en nuestros programas, ya sea de manera directa o indirecta. Cada uno de estos tipos primitivos, tiene un valor por default, el cual es importante conocer ya que cuando los utilicemos en conjunto con nuestras clases de Java, el compilador tomará en cuenta este valor por default según el tipo de dato que utilicemos.

- Dentro de **Enteros**:

*byte* - 8 bits - default: 0, entre -128 a 127

*short* - 16 bits - default: 0, entre -32.768 a 32.767

*char* - 16 bits - default: 0, entre -2.147.483.648 a 2.147.483.647
 
*int* - 32 bits - default: 0

*long* - 64 bits - default: 0


- Dentro de los **Float** (**Flotantes**):

*float* - 32 bits - default: 0, entre 3.4e-038 a 3.4e038

*double* - 64 bits - default: 0, entre 1.7e-308 a 1.7e308


- Otros tipos de datos son..

... **boolean** : true, false ``` boolean estaPrendido = true;```

... **char**, un solo caracter, va entre comillas. ```char a = 'a';```

... **String**, cadena de caracteres, van entre comillas. ```String saludo = "Buenos dias";```


Observar que los tipos de datos en Java comienzan en minuscula, excepto **String** porque es una **clase** y tiene metodos propios para poder manupular cadenas.


- Tipo que son extensiones de la clase Object (referencia a Objetos): *clases*, *Interfaces*, *Arrays*.

---

## ¿ Como se declara la variable?


En Java se pueden **declarar** (indicarle al compilador de Java que debe reservar en memoria el espacio para almacenar la variable) e **inicializar** (asignarle un valor a la variable) por separado o en una sola instrucción.

```Java
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	// Ejemplo por separado:
	int x;  // declaro  la variable, java reserva 32bits de memoria para 	guardar los datos que esta variable almacenara
	x = 20; // inicializo la variable

	// Ejemplo en una sola instruccion:
	int y = 30; // declaro e inicializo la variable al mismo tiempo, solo se guarda el valor en la variable y cuando se le asigna el 30 con el =
     }
}
```

Para los enteros se utiliza más **int** y para los decimales **double**

Variable de tipo **char**

```Java
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	char k;  // primero declaro
	k = 'k'; // luego inicializo
	char l = 'l'; // declaro e inicializo
    }
}
```

Variable de tipo **boolean**
```Java
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	boolean m; // primero declaro
	m = true; // luego inicializo

	boolean n = false; // declaro e inicializo
   }
}
```

Variable de tipo **double**:
```Java
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	double salario; // declaro la variable
	salario = 80000.8; // inicializo la variable
	
	double kilos = 8.72; // declaro e inicializo
     }
}
```

---

Por default cuando se asigna un valor entero el tipo de dato que se maneja es **int** y en el caso de los reales el tipo de dato por default es **double**. Esto quiere decir que para asignar valores de los otros tipos de datos (real y entero) como float y long, se adiciona la incial del tipo de dato a continuacion del valor:

```
package clase02;

public class Clase02 {

    public static void main(String[] args) {
        float h = 20.4f;
        long j = 204988885695L;
    }
}
```

---
---

## :star: Constantes

- Las constantes no cambian su valor, deben declararse e inicializarce al mismo tiempo.

- Llevan la palabra reservada **final**

- Se escriben en **mayuscula** y si tengo mas de una palabra las uno con **guion bajo**

```Java
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	double final IVA_TIPO_1 = 0.16;
    }
}
```

---
---

## :star:  2.2 Tipos enteros(Integer) y String

```
CADENA
-TRATAMIENTO ESPECIAL
- NO ES DE TIPO PRIMITIVO
- CONTEXTO STRING
- NO SE NECESITA INSTANCIAR
```

- En Java el manejo de cadenas es un tipo Object, pero que tiene varias características en particular. Aunque aún no detallaremos aún el manejo de objetos, pero cabe mencionar que en Java es necesario el uso del operador new para crear un nuevo objeto.

- Sin embargo cuando hablamos de cadenas esto no es necesario. Podemos simplemente declarar un tipo String y asignar un valor cadena directamente a esta variable, es por ello que pareciera que el tipo String es un tipo primitivo pero no es así, sin embargo debido al uso tan frecuente de este tipo al momento de estar programando, es que se decidió simplificar el proceso de creación y asignación de valores en este tipo String en particular.

Para declarar String:

Puede declarar e inicializar juntos:

```Java 
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	String saludo = "Hola mundo"; // declaro variable e inicializo
    }
}
```

Puedo declarar y luego asignar:
```Java
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	String nombre; // declaro la variable
	nombre = "Eugenia"; // inicializo

	String nombre2 = "Ana";  // declaracion e inicializacion en una sola instruccion

	String nombre3 = new String("Andres");  // declaracion e inicializacion en una sola instruccion

	String nombre4;
	nombre4 = new String("Juan");  // declaro e inicializo por separado
   }
}
```

- Podemos observar que para declarar una cadena en Java, únicamente basta con utilizar el tipo String, posteriormente definir su nombre (identificador), y finalmente asignar un valor, sin la necesidad de utilizar el operador new. Así, podemos asignar directamente el valor de una cadena, simplemente utilizando comillas dobles para envolver el valor deseado.

- En Java, a diferencia de otros lenguajes, no se permite la sobrecarga de operadores, lo que significa que no podemos alterar la función de los operadores para hacer lo que nosotros deseemos, sin embargo existe una excepción a esta regla cuando manejamos tipos cadena. Cuando usamos el operador + y se detecta un tipo String en la operación, se dice que tenemos el contexto String, y por lo tanto en lugar de sumar valores, lo que hace Java es concatenar los valores que se encuentren en la operación. Esto lo veremos más adelante con un ejercicio, pero es importante notar este punto ya que es otra simplificación importante al momento de usar cadenas en Java.


- Uno de los detalles más importantes que estudiaremos más adelante, es la forma en que se comparan objetos en Java, sin embargo en esta sección sólo aclararemos que al utilizar objetos no se utiliza el símbolo == como con los tipos primitivos, sino el método **equals()**. En el caso de cadenas esto nos permitirá comparar el contenido de la cadena. En el tema de objetos estudiaremos esto a más detalle, pero de momento es importante que conozcan este detalle para que sepan cómo comparar cadenas.

Para comparar:

```Java 
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	saludo.equals("Hola mundo");
    }
}
```

En Java **String** es de tipo *Object*, por lo que se debe utilizar el operador *new* para crear un nuevo objeto.


### Caracteres de escape al utilizar cadenas

| Secuencia de escape | Descripcion |
| ------------------- | ----------- |
| ```\t``` | inserta un tabulador |
| ```\b``` | inserta un retroceso (backspace) |
| ```\n``` | inserta una nueva linea |
| ```\r``` | inserta un retorno de carro |
| ```\f``` | se mueve a la siguiente pagina (Form feed). Se utiliza para impresoras, no consolas |
| ```\'``` | inserta una comilla simple |
| ```\"``` | inserta una comilla doble |
| ```\\``` | inserta una barra invertida |


En la tabla mostrada, podemos observar los caracteres de escape que son utilizados al momento de desplegar mensajes en la salida estándar. Estos caracteres los pondremos en práctica en los ejercicios que vamos a realizar a continuación.


---
---

## :star: 2.3 Inferencia de tipos (VAR)

El valor de una variable se conoce como **literal** y el tipo de valor se asigna tanto a la varaible como a la literal, una literal de tipo cadena sera automaticamente String.

A partir de la versión 10 de Java podemos utilizar **var** (es una palabra reservada) en vez de usar el tipo de dato definido y Java lo infiere.

JDK debe ser de 10 en adelante para poder utilizar var.

```Java 
package clase02;

public class Clase02 {

    public static void main(String[] args) {
	var miVariableEntera = 2;  // es de tipo int
	var miVariableCadena = "Hola";  // es de tipo String
        System.out.println("MiVariableCadena : "+miVariableCadena)  // concatenacion de cadenas con +
    }
}
```

Dentro del metodo **main** se puede usar VAR sin problemas, fuera de main no se puede usar.


---
---


## :star: 2.4 Reglas para definir una variable

- El primer caracter del nombre de la variable puede ser cualquier letra del alfabeto, por convension se utiliza camelCase.

- No se pueden utilizar numeros como primer caracter de la varaible, si se pueden usar como segundo, tercer, cuarto etc.

- Si puede tener guion bajo, inclusive puede ser el primer caracter (pero no es comun que empiece con _)

- se puede utilizar el $.

- se puede usar acentos, pero NO es recomendable.

- No se puede utilizar caracteres especiales como : ```#```

- No puede tener alguna de las palabras reservadas:


```
abstract   continue     for          new        swith
assert     dafault      goto         package    synchronized
boolean    do           if           private    this
break      double       implements   protected  throw
byte       else         import       public     throws
case       enum         instance of  return     transient
catch      extends      int          short      try
char       final        interface    static     void
class      finally      long         strict     volatile 
const      float        native        super     while

```


---
---

## :star: 2.5 Concatenación: Ejercicio


#### Concatenar String con +

```Java
public class Clase02 {

    public static void main(String[] args) {
	var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " +usuario // con " " concateno un espacio, sino me quedan las palabras pegadas
	System.out.println(union);  // Osvaldo Ingeniero
    }
}
```


#### El caso de int con + es la suma

```Java
public class Clase02 {

    public static void main(String[] args) {
	var numero1 = 8;
        var numero2 = 4;
	var suma = 8 + 4;
	System.out.println(suma);  // 12 , no se concatena, sino que suma
    }
}
```

De izquierda a derecha evalua las expresiones, como primero encontro un int, entonces los toma como numeros y lo suma.

Si por el contrario seria un String, me lo concatenaria, por ejemplo:

```Java
public class Clase02 {

    public static void main(String[] args) {
	var numero1 = "8";
        var numero2 = 4;
	var suma = numero1 + numero2;
	System.out.println(suma);  // 84 , me lo concatena porque numero1 que esta a la izquierda es String
    }
}
```
Si tuviera 3 variables y entre parentesis pongo las variables que son int, entonces por prioridad va primero a los parentesis, entonces va a sumar en vez de concatenar (esto es por la prioridad de parentesis), si lo de afuera del parentesis es un String a esa si la va a concatenar.

-> **click derecho** -> **format** para tener el codigo ordenado


---
---


## :star: 2.6 Caracteres especiales



```Java
public class Clase02 {

    public static void main(String[] args) {
	String nombre = "Eugenia";
	System.out.println(nombre); // Eugenia
	System.out.println("Nueva linea \n"+nombre); // el caracter \n me da un salto de linea
	System.out.println("Tabulador: \t"+nombre); // el caracter \t me tabula linea
    }
}
```

```\n``` -> salto de linea

```\t``` -> tabulador


```\b ``` -> caracter de retroceso, saca un lugar hacia atras

```\' ``` -> comilla simple

```\'' ``` -> comilla doble

---
---


## :star: 2.7 Clase Scanner: Ejercicio

La clase Scanner nos va a permitir poder ingresar datos por teclado, para almacenarlo en variable.


```
public class Clase02 {
import Scanner;

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); // instancio un objeto de la clase Scanner para poder utilizar sus metodos
	System.out.println("Proporciona el titulo: ");
	String titulo = scanner.neaxtLine();
	System.out.println("Proporciona el autor: ");
	String autor = scanner.nextLine();
	System.out.println(titulo+" fue escrito por "+autor);
    }
}
``` 

[**Documentación de Oracle de la clase Scanner**](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

---
---