package primitives;

public class Primitivos {

    public static void main (String[] args){
        System.out.println("Hello");
        otras();
    }

    public static void otras () {
        boolean conducir;
        char grupo;
        short np;
        long nm;
        double real = 0;
        float real2;
        int edad = 11; //el valor 11 se guarda directamente en la cajita o espacio
        int edad3 = 11;
        if (edad==edad3){
            System.out.println("Las edades son iguales");
        } else {
            System.out.println("Las edades no son iguales");
        }
        System.out.println("real es igual a: "+real);

        // los envoltorios o wraper son CLASES

        Integer edad2 = 11;
        Boolean mayorDeEdad; // esta es una declaracion de variable
        Character grupo2 = null;
        Long temperatura;
        Double distancia;
        Float latitud;
        String cadena;
        Integer v1 = 1212;
        Integer v2 = 1212;

        if (v1.equals(v2)){ // el metodo ".equals" es para comparar dos objetos
            System.out.println("Los integer son iguales");
        } else {
            System.out.println("Las integer no son iguales");
        }
        System.out.println("El grupo2 es: "+grupo2);




        mayorDeEdad = true; // esta es la inicializacion de la variable
    }

}
// 
