public class DatosWrapper {
    public static void main(String[] args){
        //Byte: equivalente objeto del tipo primitivo byte
        Byte edad = 25;
        System.out.println("Byte edad = " + edad);
        System.out.println("Byte MAX_VALUE = " + Byte.MAX_VALUE);

        //Short
        Short anio = 2025;
        System.out.println("\nShort año = " + anio);
        System.out.println("Short MIN_VALUE = " + Short.MIN_VALUE);

        //Integer
        Integer poblacionCiudad = 1_500_00;
        System.out.println("\nInteger población ciudad = " + poblacionCiudad);
        System.out.println("Integer parseInt(\"123\") = ");
        System.out.println("Integer toHexString(255) = " + Integer.toHexString(255));

        //Long
        Long poblacionMundial = 8_000_000_000L;
        System.out.println("\nLong población mundial = " + poblacionMundial);
        System.out.println("Long compare(100L, 200L) = " + Long.compare(100L,200L));

        //Float
        Float precio = 99.99f;
        System.out.println("\nFloat precio = " + precio);
        System.out.println("Float isNaN(0.0f / 0.0f) = " + Float.isNaN(0.0f / 0.0f));

        //Double
        Double pi = 3.1415926535897963;
        System.out.println("\nDouble pi = " + pi);
        System.out.println("Double valueOf(\"2.718\") = " + Double.valueOf("2.718"));

        //Character
        Character inicial = 'C';
        System.out.println("\nCharacter inicial = " + inicial);
        System.out.println("Character.isLetter('9') = " + Character.isLetter('9'));
        System.out.println("Character.toLowerCase('A') = " + Character.toLowerCase('A'));

        //Boolean
        Boolean esJavaGenial = Boolean.TRUE;
        System.out.println("\nBoolean es Java genial = " + esJavaGenial);
        System.out.println("Boolean.parseBoolean(\"false\") = " + Boolean.parseBoolean("false"));

        //========== Operaciones con Wrappers ===========
        System.out.println("=== Operaciones con Wrappers ===");

        Integer x = 10;
        Integer y = 20;

        //Autoboxing (Java convierte int → Integer)
        //Unboxing (Integer → int)
        int suma = x + y; // Se hace unboxing automatico
        System.out.println("Suma (x + y) = " + suma);

        //Comparaciones usando métodos del wrapper
        System.out.println("x.compareTo(y) = " + x.compareTo(y)); // -1
        System.out.println("x.equals(y) = " + x.equals(y)); //false

        //Conversión de tipos
        String str = x.toString();
        System.out.print("x.toString() = " + str);

        int numero = Integer.parseInt("1234");
        System.out.println("Integer.parseInt(\"1234\")" + numero);

    }
}
