package clasesYObjetos;

public class pruebaempleados {

    public static void main (String[] args){

        Empleado empleado1 = new Empleado ();
        Empleado empleado2 = new Empleado ("Rafa", "123-123", 1234);

        empleado1.incrementarSalario(200);
        empleado2.incrementarSalario(200);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());





    }

}
