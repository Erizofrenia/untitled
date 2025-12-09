import java.util.HashMap;

public class EjemplosHashMap {
    public static void main(String[] args){
        /// Creacion de HashMap
        //Mapa donde la clave es String y el valor es Integer
        HashMap<String, Integer> edades = new HashMap<>();

        //Agregar elementos
        edades.put("Oscar", 25);
        edades.put("Maria", 30);
        edades.put("Carlos", 28);

        //Obtener un valor por su clave
        int edadOscar = edades.get("Oscar");
        System.out.println("Edad de Oscar: " + edadOscar);

        /// ///Verificar existencia de una clave
        if (edades.containsKey("Maria")){
            System.out.println("Maria está en el mapa.");
        }
        edades.remove("Carlos");

        //Recorrer un hashmap
        //keySet() devuelve todas las claves del mapa
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " tiene " + edades.get(nombre) + " años.");
        }

        //Tamaño del mapa
        System.out.println("Tamaño del mapa: " + edades.size());


    }
}
