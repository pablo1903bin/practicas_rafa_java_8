package clasesYObjetos;

public class pruebaempleados {

    public static void main (String[] args){

        Nacionalidad nacionalidad = new Nacionalidad(7, "mexicana");

        Empleado empleado1 = new Empleado ();
        Empleado empleado2 = new Empleado ("Rafa", "123-123", 1234, nacionalidad);
        Programador programer1 = new Programador("Pablo", "1942", 20000, nacionalidad, "Java");
        Mensajero mensajero1 = new Mensajero("Jorge", "men-sajero", 1000, nacionalidad, 8);

        empleado1.incrementarSalario(200);
        empleado2.incrementarSalario(200);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println(programer1.toString());

        programer1.incrementarSalario(1000);
        System.out.println(programer1.getSalario());

        System.out.println(mensajero1.toString());
        mensajero1.incrementarSalario(100);
        System.out.println(mensajero1.getSalario());





    }

}
