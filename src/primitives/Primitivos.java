package primitives;

import java.util.Scanner;

import practicas.*;

public class Primitivos {

    public static void main(String[] args) {

        System.out.println("Hello");

        otras();
        practicas();

        
    }
    

    public static void otras() {
        boolean conducir;
        char grupo;
        short np;
        long nm;
        double real = 0;
        float real2;
        int edad = 11; // el valor 11 se guarda directamente en la cajita o espacio
        int edad3 = 11;
        if (edad == edad3) {
            System.out.println("Las edades son iguales");
        } else {
            System.out.println("Las edades no son iguales");
        }
        System.out.println("real es igual a: " + real);

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

        if (v1.equals(v2)) { // el metodo ".equals" es para comparar dos objetos
            System.out.println("Los integer son iguales");
        } else {
            System.out.println("Las integer no son iguales");
        }
        System.out.println("El grupo2 es: " + grupo2);

        mayorDeEdad = true; // esta es la inicializacion de la variable
    }

    public static void practicas (){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el número de la practica (entre 1 y 16)");

        int practica = sc.nextInt();

        switch (practica) {
            case 1:
                misPracticas.practica1();
                break;

            case 2:
                misPracticas.practica2();
                break;

            case 3:
                misPracticas.practica3();
                break;

            case 4:
                misPracticas.practica4();
                break;

            case 5:
                misPracticas.practica5();
                break;

            case 6:
                misPracticas.practica6();
                break;

            case 7:
                misPracticas.practica7();
                break;

            case 8:
                misPracticas.practica8();
                break;

            case 9:
                misPracticas.practica9();
                break;

            case 10:
                misPracticas.practica10();
                break;

            case 11:
                misPracticas.practica11();
                break;

            case 12:
                misPracticas.practica12();
                break;

            case 13:
                misPracticas.practica13();
                break;

            case 14:
                misPracticas.practica14();
                break;

            case 15:
                misPracticas.practica15();
                break;

            case 16:
                misPracticas.practica16();
                break;

            default:
                System.out.println("No existe practica para ese numero.");
                break;
        }
    }

}
//
