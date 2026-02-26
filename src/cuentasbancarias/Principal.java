package cuentasbancarias;

public class Principal {

    public static void main (String[] args){

        // se instancian dos onjetos de la clase Cuenta

        Cuenta cuenta1 = new Cuenta();

        Cuenta cuenta2 = new Cuenta("Rafael");


        // se prueban los metodos de la clase

        cuenta1.setCantidad(120);

        cuenta1.retirar(150);

        System.out.println(cuenta1.toString());

        cuenta2.ingresar(200);

        System.out.println(cuenta2.toString());






    }

}
