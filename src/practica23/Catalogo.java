package practica23;

public class Catalogo {

    public static void main (String[] args){

        Combustion bocho = new Combustion(1, 740, 1600);
        Combustion moto = new Combustion(2, 250, 200);
        Electrico scooter = new Electrico(3, 15, 13000);
        Electrico bicicleta = new Electrico(4, 23, 15000);

        Vehiculo[] almacen = {bocho, moto, scooter, bicicleta};

        for ( Vehiculo v : almacen){

            System.out.println(v.impuestoFinal());
        }

    }

}
