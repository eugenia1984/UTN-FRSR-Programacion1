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

**variable** -> 

-> espacio en memoria que se define en un programa de computador para almacenar de forma temporal.

-> los valores pueden cambiar mientras se esta ejecutando un programa de computador

-> las variables en Java solo aceptan 

En Java existen distintos datos:

```
 tipos primitivos en Java
    |            |
    v            v
  Enteros     Flotantes
``` 

-> Estos tipos de Java son los más básicos y son los que utilizaremos si necesitamos la mayor rapidez y ahorro en recursos, con el objetivo de que nuestros algoritmos sean lo más eficientes. Sin embargo en la práctica utilizaremos también funciones ya creadas que pueden hacer uso de manera indirecta de estos tipos primitivos, así que de cualquier manera los estaremos manejando en nuestros programas, ya sea de manera directa o indirecta. Cada uno de estos tipos primitivos, tiene un valor por default, el cual es importante conocer ya que cuando los utilicemos en conjunto con nuestras clases de Java, el compilador tomará en cuenta este valor por default según el tipo de dato que utilicemos.

- Dentro de *Enteros*:

byte - 8 bits - default: 0

short - 16 bits - default: 0

char - 16 bits - default: 0
 
int - 32 bits - default: 0

long - 64 bits - default: 0


- Dentro de los *Float*:

float - 32 bits - default: 0

double - 64 bits - default: 0


- Otros tipos de datos son..

... **boolean** : true, false

... **char**, un solo caracter, va entre comillas.

... **String**, cadena de caracteres, van en tre comillas. Es una **clase** y tiene metodos propios.


- Tipo que son extensiones de la clase Object (referencia a Objetos): *clases*, *Interfaces*, *Arrays*.


## ¿ Como se declara la variable?

En Java se pueden declarar e inicializar al mismo tiempo.

```Java
int x;  // declaro  la variable
x = 20; // inicializo la variable

int y = 30; // declaro e inicializo la variable al mismo tiempo
```

Para los enteros se utiliza más **int** y para los decimales **double**

Variable de tipo **char**

```Java
// primero declaro
char k;
// luego inicializo
k = 's';
// declaro e inicializo
char l = 'l';
```

Variable de tipo **boolean**
```Java
// primero declaro
boolean m;
// luego inicializo
m = true;
// declaro e inicializo
boolean n = false;
```

Variable de tipo **double**:
```Java
// declaro la variable
double salario;
// inicializo la variable
salario = 80000.8;
// declaro e inciializo
double kilos = 8.72;
```


---

## :star: Constantes

Las constantes no cambian su valor, deben declararse e inicializarce al mismo tiempo.

Llevan la palabra reservada **final**

Se escriben en **mayuscula** y si tengo mas de una palabra las uno con **guion bajo**

```Java
double final IVA_TIPO_1 = 0.16;
```

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
// declaro variable e inicializo
String saludo = "Hola mundo";
```

Puedo declarar y luego asignar:
```Java
// declaro la variable
String nombre;
// inicializo
nombre = "Eugenia";
```

- Podemos observar que para declarar una cadena en Java, únicamente basta con utilizar el tipo String, posteriormente definir su nombre (identificador), y finalmente asignar un valor, sin la necesidad de utilizar el operador new. Así, podemos asignar directamente el valor de una cadena, simplemente utilizando comillas dobles para envolver el valor deseado.

- En Java, a diferencia de otros lenguajes, no se permite la sobrecarga de operadores, lo que significa que no podemos alterar la función de los operadores para hacer lo que nosotros deseemos, sin embargo existe una excepción a esta regla cuando manejamos tipos cadena. Cuando usamos el operador + y se detecta un tipo String en la operación, se dice que tenemos el contexto String, y por lo tanto en lugar de sumar valores, lo que hace Java es concatenar los valores que se encuentren en la operación. Esto lo veremos más adelante con un ejercicio, pero es importante notar este punto ya que es otra simplificación importante al momento de usar cadenas en Java.


- Uno de los detalles más importantes que estudiaremos más adelante, es la forma en que se comparan objetos en Java, sin embargo en esta sección sólo aclararemos que al utilizar objetos no se utiliza el símbolo == como con los tipos primitivos, sino el método **equals()**. En el caso de cadenas esto nos permitirá comparar el contenido de la cadena. En el tema de objetos estudiaremos esto a más detalle, pero de momento es importante que conozcan este detalle para que sepan cómo comparar cadenas.

Para comparar:

```Java 
saludo.equals("Hola mundo");
```

En Java **String** es de tipo *Object*, por lo que se debe utilizar el operador *new* para crear un nuevo objeto.


### Caracteres de escape al utilizar cadenas

| Secuencia de escape | Descripcion |
| ------------------- | ----------- |
| \t | inserta un tabulador |
| \b | inserta un retroceso (backspace) |
| \n | inserta una nueva linea |
| \r | inserta un retorno de carro |
| \f | se mueve a la siguiente pagina (Form feed). Se utiliza para impresoras, no consolas |
| \' | inserta una comilla simple |
| \" | inserta una comilla doble |
| \\ | inserta una barra invertida |

En la tabla mostrada, podemos observar los caracteres de escape que son utilizados al momento de desplegar mensajes en la salida estándar. Estos caracteres los pondremos en práctica en los ejercicios que vamos a realizar a continuación.

---

## :star: 2.3 Inferencia de tipos

---

## :star: 2.4 Reglas para definir una variable

---

## :star: 2.5 Concatenación: Ejercicio

---

## :star: 2.6 Caracteres especiales

---

## :star: 2.7 Clase Scanner: Ejercicio

---