package practicas;

import java.util.Scanner;

public class misPracticas {

    Scanner sc = new Scanner(System.in); // este es un objeto de "clase Scanner" que utiliza la consola para
                                         // ingresar la info
                                         

    public static void practica1() {

        // practica 1: mostrar por consola un mensaje mediante el SYSO

        System.out.println("Hola mundo.");
        System.out.println();

    }

    public static void practica2() {
        Scanner sc = new Scanner(System.in);

        // practica 2: pedir por consola el nombre y edad de una persona y mostrarlo

        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad + " años.");
        System.out.println();
        sc.close();

    }

    public static void practica3() {
        Scanner sc = new Scanner(System.in);

        // practica 3: conversor de monedas mediante operador

        System.out.println("Ingresa la cantidad de dolares(US) para convertir a peso mexicano:");
        double dolares = sc.nextDouble();
        double pesosmx = dolares * 17.80;
        System.out.println(dolares + " dolares equivalen a " + pesosmx + " pesos mexicanos.");
        System.out.println();
        sc.close();

    }

    public static void practica4() {
        Scanner sc = new Scanner(System.in);
        // prectica 4: area de un triangulo

        System.out.println("Ingresa el valor de la base del triangulo:");
        double basetriangulo = sc.nextDouble();
        System.out.println("Ingresa el valor de la altura del triangulo:");
        double alturatriangulo = sc.nextDouble();
        double areatriangulo = (basetriangulo * alturatriangulo) / 2;
        System.out.println("Un triangulo de base " + basetriangulo + " y altura " + alturatriangulo
                + " tiene un área de: " + areatriangulo + " cm2.");
        System.out.println();
        sc.close();

    }

    public static void practica5() {
        Scanner sc = new Scanner(System.in);

        // practica 5: calculadora de enteros (suma, resta, multiplicación y división) y
        // controlar las excepciones mediante bloques try-catch

        int num1, num2;

        System.out.println("Introduce el primer numero entero:");

        try {

            num1 = sc.nextInt();

        } catch (Exception ex) {

            System.out.println("El valor ingresado no es un entero y tomara el valor de 1.");
            num1 = 1;
            sc.next();
        }

        System.out.println("Introduce el segundo numero entero");
        try {

            num2 = sc.nextInt();

        } catch (Exception ex) {

            System.out.println("El valor ingresado no es un entero y tomara el valor de 1.");
            num2 = 1;
            sc.next();
        }

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        int resta = num1 - num2;
        System.out.println("La resta es: " + resta);
        int multiplicación = num1 * num2;
        System.out.println("La multiplicación es: " + multiplicación);

        try {
            double división = (double) num1 / (double) num2;
            System.out.println("la division es: " + división);
        } catch (Exception ex) {
            System.out.println("La divión por 0 es indefinida.");
        }
        System.out.println();
        sc.close();

    }

    public static void practica6() {
        Scanner sc = new Scanner(System.in);

        // practica 6: número negativo y multiplo de 3

        int nnegativo;

        System.out.println("Ingresa un número y te dire si es negativo y multiplo de 3:");
        try {
            nnegativo = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Introducción incorrecta del valor. Por defecto se le asigna el valor de 1.");
            nnegativo = 1;
            sc.next();
        }
        if (nnegativo < 0 && nnegativo % 3 == 0) {
            System.out.println("El número " + nnegativo + " es un numero negativo y multiplo de 3.");
        } else {
            System.out.println("El número " + nnegativo + " no es negativo y multiplo de 3.");

        }
        System.out.println();
        sc.close();

    }

    public static void practica7() {
        Scanner sc = new Scanner(System.in);

        // practica 7: nota final

        double nota;

        System.out.println("Ingresa la nota numérica para saber su eficiencia:");

        try {
            nota = sc.nextDouble();
        } catch (Exception ex) {
            System.out.println("Valor introducido incorrecto. Por defecto se le asigna el valor de 0.");
            nota = 0;
            sc.next();
        }
        if (nota <= 3) {

            System.out.println("Troll.");

        } else if (nota > 3 && nota <= 5) {

            System.out.println("Desastroso.");

        } else if (nota > 5 && nota <= 6) {

            System.out.println("Insatisfactorio.");

        } else if (nota > 6 && nota <= 7) {

            System.out.println("Aceptable.");

        } else if (nota > 7 && nota <= 9) {

            System.out.println("Supera las expectativas.");

        } else if (nota > 9) {

            System.out.println("Extraordinario.");
        }
        System.out.println();
        sc.close();

    }

    public static void practica8() {
        Scanner sc = new Scanner(System.in);

        // practica 8: precio total de compra

        double precio, total, totalfinal;
        int np, descuento;

        System.out.println("¿Cúal es el precio del producto?");
        try {
            precio = sc.nextDouble();
        } catch (Exception ex) {
            System.out.println("Error al ingresar el precio. Por defecto tomara el valor de 0.");
            precio = 0;
            sc.next();
        }
        System.out.println("¿Cúantas unidades del producto son?");
        try {
            np = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Error al ingresar el numero de unidades. Por defecto tomara el valor de 0.");
            np = 0;
            sc.next();
        }

        total = precio * np;

        if (total < 100) {
            descuento = 0;
            totalfinal = total - ((descuento * total) / 100);
            System.out.println("Se debe pagar un total de: " + totalfinal + ".");
        } else if (precio > 200) {
            descuento = 15;
            totalfinal = total - ((descuento * total) / 100);
            System.out.println("Se debe pagar un total de: " + totalfinal + ".");
        } else {
            descuento = 10;
            totalfinal = total - ((descuento * total) / 100);
            System.out.println("Se debe pagar un total de: " + totalfinal + ".");
        }
        System.out.println();
        sc.close();

    }

    public static void practica9() {
        Scanner sc = new Scanner(System.in);

        // pracrtica 9: Dias de la semana (determinar si el dia de la semna ingresado es
        // laborable o no)

        int dia;
        System.out.println("Ingresa el número correspondiente a un día de la semana y te dire si es laborable");
        try {
            dia = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Error al ingresar el día de la semana. Se le dará el valor 0.");
            dia = 0;
            sc.next();
        }

        switch (dia) {
            case 1:
                System.out.println("El día es lunes y es laborable.");
                break;
            case 2:
                System.out.println("El día es martes y es laborable.");
                break;
            case 3:
                System.out.println("El día es miercoles y es laborable.");
                break;
            case 4:
                System.out.println("El día es jueves y es laborable.");
                break;
            case 5:
                System.out.println("El día es viernes y es laborable.");
                break;
            case 6:
                System.out.println("El día es sábado y no es laborable.");
                break;
            case 7:
                System.out.println("El día es domingo y no es laborable.");
                break;

            default:
                System.err.println("El valor no tiene un día de la semana definido.");
                break;
        }
        System.out.println();
        sc.close();

    }

    public static void practica10() {

        // practica 10: multiplos de 5 entre dos números

        int i;

        for (i = 5; i <= 100; i = i + 5) {
            System.out.println(i);

        }
        System.out.println();

    }

    public static void practica11() {
        Scanner sc = new Scanner(System.in);

        // practica 11: contador de altura

        int alumnos;
        int contMayor = 0, contMenor = 0;
        double estatura;
        double totalestatura = 0;

        System.out.println("Ingresa el numero de alumnos:");
        try {
            alumnos = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("El valor es incorrecto. Valor por defecto es 0.");
            alumnos = 0;
            sc.next();
        }

        for (int it = 1; it <= alumnos; it++) {
            System.out.println("Ingresa la estatura en metros del alumno " + it + " :");
            try {
                estatura = sc.nextDouble();
            } catch (Exception ex) {
                System.out.println("Formato de altura del alumno " + it + " incorrecto. Valor por defecto es 0.");
                estatura = 0;
                sc.next();
            }

            totalestatura = totalestatura + estatura;

            if (estatura < 1.8) {
                contMenor++;
            } else {
                contMayor++;
            }
        }
        double estaturturapromedio = totalestatura / alumnos;

        System.out.println("En el grupo hay " + alumnos + " alumnos");
        System.out.println("Alumnos con altura menos a 1.8 metros: " + contMenor);
        System.out.println("Alumnos con altura mayor a 1.8 metros: " + contMayor);
        System.out.println("El promedio de altura en el grupo es: " + estaturturapromedio);

        System.out.println();
        sc.close();

    }

    public static void practica12() {
        Scanner sc = new Scanner(System.in);

        // practica 12: cuenta pares e impares con While

        int contpares = 0, contimpares = 0, number;

        System.out.println("Introduce un numero entero (termino si ingresas un 0):");
        try {
            number = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("No se introdujo un número entero y se le asignará un valor por defecto de 0.");
            number = 0;
            sc.next();
        }
        while (number != 0) {

            if (number % 2 == 0) {

                contpares++;

            } else {
                contimpares++;
            }
            System.out.println("Introduce un numero entero:");
            try {
                number = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("No se introdujo un número entero y se le asignará un valor por defecto de 0.");
                number = 0;
                sc.next();
            }

        }

        System.out.println("Se introdujeron " + contpares + " números pares y " + contimpares + " números impares.");

        System.out.println();
        sc.close();

    }

    public static void practica13() {
        Scanner sc = new Scanner(System.in);

        // practica 13: Nota máxima y nota mínima
        double calificacion, calimax = -1, calimin = 11;

        System.out.println("Ingresa la calificación del alumno:");
        try {
            calificacion = sc.nextDouble();
        } catch (Exception ex) {
            System.out.println("Valor no valido. Valor por defecto es de 0.");
            calificacion = 0;
            sc.next();
        }
        while (calificacion >= 0 && calificacion <= 10) {
            if (calificacion > calimax) {
                calimax = calificacion;
            }
            if (calificacion < calimin) {
                calimin = calificacion;
            }
            System.out.println("Ingresa la calificaión de otro alumno:");
            try {
                calificacion = sc.nextDouble();
            } catch (Exception ex) {
                System.out.println("Valor no valido. Valor por defecto es de 0.");
                calificacion = 0;
                sc.next();
            }

        }
        System.out
                .println("La calificación más alta es " + calimax + " y la calificación más baja es " + calimin + ".");

        sc.close();

    }

    public static void practica14() {
        Scanner sc = new Scanner(System.in);

        // practica 14: Numero de espacios en una cadena

        int contespacios = 0;

        System.out.println("Ingresa una cadena:");
        String cadena = sc.nextLine();

        for (int i = 0; i <= cadena.length(); i++) {

            if (cadena.charAt(i) == ' ') {

                contespacios++;

            }

        }

        System.out.println("La cadena contiene " + contespacios + " espacios en blanco.");
        System.out.println();
sc.close();
    }

    public static void practica15() {
        Scanner sc = new Scanner(System.in);

        // practica 15: Validar una contraseña

        System.out.println(
                "Ingresa una contraseña de 10 a 20 caracteres e incluye almenos uno de estos caracteres: @, *, -:");
        String contraseña = sc.nextLine();
        boolean contraseñavalida = false;

        if (contraseña.length() >= 10 && contraseña.length() <= 20) {

            for (int i = 0; i <= contraseña.length(); i++) {

                if (contraseña.charAt(i) == '@' || contraseña.charAt(i) == '*' || contraseña.charAt(i) == '-') {
                    contraseñavalida = true;

                }

            }
            if (contraseñavalida) {

                System.out.println("La contraseñsa es valida.");
            }

        } else {

            System.out.println("La contraseña no es de 10 a 20 caracteres.");

        }
        sc.close();
    }

    public static void practica16() {
        Scanner sc = new Scanner(System.in);
        // practica 16: palabra palindromo

        System.out.println("Ingresa una cadena:");
        String palabra = sc.nextLine();
        String palabra2 = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            char lugar = palabra.charAt(i);
            palabra2 = palabra2 + lugar;
        }

        if (palabra.equals(palabra2)) {

            System.out.println("La cadena es un palindromo.");

        } else {
            System.out.println("La cadena no es un palindrimo");
        }
        sc.close();

    }

    public static void practica17(){

        Scanner sc = new Scanner(System.in);

        // practica 17: Array de numeros aleatorios, impresion de cada uno y la suma de ellos

        int[] array = new int[10];
        for (int i=0; i<array.length;i++){
            array[i] = (int)Math.floor(Math.random()*10+1);

        }
        int suma = 0;

    for (int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
        suma = suma +array[i];
    }
    System.out.println("La suma de todos los valores es: "+suma);
        sc.close();
    }

}
