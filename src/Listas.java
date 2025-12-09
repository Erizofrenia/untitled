import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //Creacion de una lista
        //Usar la interfaz List es buena práctica (programacion orientada a interfaces))
        List<String> nombres = new ArrayList<>();

        //Agregar elementos a la lista
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Lucia");

        System.out.println("Lista original: " + nombres);

        //Acceso a elementos
        //
        String primero = nombres.get(0);
        System.out.println("");

        //Diferentes formas de iterar
        System.out.println("\nIteración con for tradicional:");
        for(int i = 0; i<nombres.size(); i++){
            System.out.println("Indice " + i + ": " + nombres.get(i));
        }

        System.out.println("\nIteracion con while");
        int index = 0;
        while (index < nombres.size()){
            System.out.println("Indice " + index + ": " + nombres.get(index));
            index++;
        }

        System.out.println("\nIteracion con forEach (lambda):");
        nombres.forEach(nombre -> System.out.println(" - " + nombre));

        //Busqueda
        System.out.println("\n¿La lista contiene a 'Ana'? " + nombres.contains("Ana"));

        //Ordenamiento
        Collections.sort(nombres); // orden alfabetico natural
        System.out.println("\nList ordenada alfabeticamente: " + nombres);

        nombres.sort(Comparator.reverseOrder());
        System.out.println("Lista ordenada inversamente: " + nombres);

        //Eliminacion
        nombres.remove("Pedro"); //elimina por valor
        System.out.println("\nLista después de eliminar 'Pedro': " + nombres);

        //Filtro con streams
        System.out.println("\nNombres que empiezan con 'C':");
        nombres.stream()
                .filter(nombre->nombre.startsWith("C"))
                .forEach(System.out::println);

        //Lista inmutable
        //Buena practica cuando no queremos que la lista cambie más
        List<String> nombresInmutables = List.copyOf(nombres);
        System.out.println("\nLista inmutable: " + nombresInmutables);

    }
}
