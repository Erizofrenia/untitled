public class Condicionales {
    public static void main(String[] args){

        int edad = 20;
        if(edad >= 18){
            System.out.println("Eres mayor de edad.");
        }

        // if - else
        if(edad>=20){
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("Eres menor de edad.");
        }

        //Operador ternario
        String mensaje = (edad>=18) ? "Eres mayor de edad." : "Eres menor de edad";
        System.out.println(mensaje);

        int dia = 3;
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            default -> System.out.println("Fin de semana");
        }

        //Buenas prácticas
        int x = 1;
        int y = 2;
        int z = 3;
        int w = 4;

        //Mala práctica: condición dificil de leer
        if(x == 1 && y!= 2 || z == 3 && w < 5){
            //codigo
        }
    }
}
