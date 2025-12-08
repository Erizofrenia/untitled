public class ObjectString {
    public static void main(String[] args){
        // Ventajas del pool
        // Ahorro de memoria y comparaciones rápidas
        //Ejemplo
        String x1 = "Hola";
        String x2 = "Hola";
        System.out.println("s1 == s2 → " + (x1 == x2));
        //true → ambos apuntan al mismo objeto dentro del String Pool

        //========================================
        // ¿Qué es la memoria heap?
        //Cuando creas un String con "new, Java no lo guarda en el Pool
        // Siempre crea un nuevo objeto en memoria Heap
        //
        // Heap = memoria para objetos creados manualmente en tiempo de ejecución"
        String x3 = new String("Hola");

        System.out.println("s1 == s3 → " + (x1 == x3)); // false → diferente objeto
        System.out.println("s1.equals(s3) → " + x1.equals(x3)); //true → contenido igual

        // ======================
        //==Inmutabilidad del string
        // ================
        // Los Strings No se pueden modificar. Cada "modificación" crea un nuevo objeto
        String texto = "Java";
        texto.concat(" es genial"); // no modifica el original, se pierde el resultado
        System.out.println("\nTexto original (inmutable): " + texto);

        //Reasignación: ahora sí apunta a un nuevo objeto
        //texto =

        //Reemplazo tambien crea un nuevo objeto
        texto = texto.replace("+++", " fff");
        System.out.println("Texto reasignado " + texto);

        //===============
        // === Problema de concatenación en bucles ===
        // Cada concatenación crea un nuevo objeto → poco eficiente"
        String concatMal = "";
        for (int i=0;i < 5; i++){
            concatMal += i+" ";
        }
        System.out.println("\nConcatenación ineficiente: " + concatMal);

        //=============
        // === Solución: StringBuilder (mutable y eficiente) ===
        // ======================/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i)
                    .append(" ")
                    .append(" hola")
                    .append(" como estas? ")
                    .append("c")
                    .append("v");
        }
        System.out.println("Concatenación eficiente con StringBuilder: " + sb.toString());

        //==================
        //=== Conparación de rendimiento: String vs Stringbuilder ===
        //==================

        long inicio1 = System.nanoTime();
        String test1 = "";
        for (int i = 0;i < 1000; i++){
            test1 +=i; //cada vuelta crea un nuevo String → lento
        }
        long fin1=System.nanoTime();

        long inicio2 = System.nanoTime();
        StringBuilder test2 = new StringBuilder();
        for (int i = 0; i < 1000; i++){
            test2.append(i); //no crea objetos nuevos → rapido
        }
        long fin2 = System.nanoTime();

        System.out.println("\nTiempo concatenación con String (ns): " + (fin1 - inicio1));
        System.out.println("Tiempo concatenación con StringBuilder (ns): " + (fin2 - inicio2));

        //=======================
        // === StringBuffer: versión sincronizada de StingBuilder ==
        // ==
        // Es más lenta pero segura para múltiples hilos (multithreading)/
        StringBuffer sbf = new StringBuffer("Thread-Safe ");
        sbf.append("pero más lento");
        System.out.println("\nUso de StringBuffer: " + sbf);

        //============
        // ===Ejercicio: String Pool vs Heap==========
        // =
        String s1 = "Java"; //En Pool
        String s2 = "Java"; //Mismo objeto en Pool

        String s3 = new String("Java"); //objeto nuevo en Heap
        String s4 = new String("Java"); //otro objeto nuevo en Heap

        // intern() fuerza a guardar el String en el Pool o reutilizar el existente
        String s5 = new String("Java").intern(); //Apunta al del Pool



    }
}
