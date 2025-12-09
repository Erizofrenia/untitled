import java.util.List;

public class Bucles {
    public static void main(String[] args){

        int contador = 6;
        while (contador <= 5){
            System.out.println("Contador: " + contador);
            contador++;
        }

        //Do while
        int numero =6;
        do{
            System.out.println("Número: " + numero);
            numero++;
        }while (numero <= 5);

        //For clasico
        for (int i = 1; i<= 5; i++){
            System.out.println("Iteración: " + i);
        }

        // ofr-each (enhanced for)
        String[] frutas = {"Manzana","Banana","Naranja","Cereza"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        List<String> nombres = List.of("Ana", "Pedro", "Luis", "Maria");

        nombres.forEach(System.out::println);
        //for-each con lambda
        nombres.forEach(n -> System.out.println(n.toLowerCase()));
        //Stream forEach con lambda
        nombres.stream()
                .forEach(nombre -> System.out.println("Nombre: " + nombre));

        //Stream Filtrar y recorrer
        System.out.println("\nNombres con más de 3 letras");
        nombres.stream()
                .filter(n -> n.length() > 3)
                .forEach(System.out::println);
        //Buenas practicas:
        //Usa for-each cuando no necesitas indices
        //Usa whhile o do while cuando no sabes cuantas repeticiones habrá
        //Evita bucles infinitos → actualiza la condicion dentro del ciclo
        // Prefiere Streams para filtrado, mapeo o transformaciones
        // Manten la logica dentro del bucle simple; extrae a metodos si es necesario"

    }
}
