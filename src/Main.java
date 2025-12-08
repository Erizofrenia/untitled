/*
*  @author Erick Enriquez
*  @version 1.0
* */
public class Main {
    public static void main(String[] args) {
        //byte: entero pequeño (-128 a 127). Se usa cuando se necesita ahorrar memoria
        byte edad = 25;
        System.out.println("byte edad = " + edad);

        //short: entero de tamaño mediano (-32,768 a 32,767).
        short anio = 2025;
        System.out.println("short año = " + anio);

        //int : entero más usado en Java. Permite valores grandes
        int poblacionCiudad = 1500000;
        System.out.println("int población ciudad = " + poblacionCiudad);

        //long: entero muy grande. Debe terminar con 'L'
        long poblacionMundial = 8_000_000_000L; //El guion bajo es decorativo para mejor lectura

        //float: número decimal de presición simple. Debe terminar con 'f'
        float precio = 99.99f;
        System.out.println("float precio = " + precio);

        //double: número decimal de mayor presición. Es el tipo decimal por defecto.
        double pi = 3.141592653589793;
        System.out.print("double pi = " + pi);

        //char: almacena un solo carácter (letras, simbolos).
        char inicial = 'C';
        System.out.println("char inicial = " + inicial);

        //boolean: almacena valores lógicos (true o false).
        boolean esJavaGenial = true;
        System.out.println("boolean es Java genial = " + esJavaGenial);

        //=============== OPERACIONES ARITMETICAS Y LÓGICAS ====================)

        //Suma: cuando se usa byte o short en operaciones, Java los convierte automaticamente a int.
        int suma = edad+anio;
        System.out.println("\nOperacion Suma: edad + año = " + suma);

        //Resta:
        int resta = anio - edad;
        System.out.println("\nOperacion Resta: año - edad = " + resta);

        //División:
        double division = pi / 2;
        System.out.println("\nOperacion División: pi / 2 = " + division);

        //Multiplicación:
        double multiplicacion = pi * 2;
        System.out.println("\nOperación Multiplicación: pi * 2 = " + multiplicacion);

        //Comparación lógica (>):
        boolean comparacion = poblacionCiudad > 1_000_000;
        System.out.println("\n¿La población de la ciudad es mayor a 1,000,000? " + comparacion);

        //=============== CONVERSIONES (CASTING ====================)

        //Conversión explicita: float -> int
        //Se "trunca" eñ decimal, no redondea.
        int precioEntero = (int) precio; //99.99 -> 99
        System.out.println("\nCasting float -> int, precioEntero = " + precioEntero);
    }
}