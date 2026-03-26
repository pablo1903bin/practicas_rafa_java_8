package practica23;

public class Combustion extends Vehiculo{

    int cilindrada;


    public Combustion (int num_bastidor, double peso, int cilindrada){

        super (num_bastidor, peso);
        this.cilindrada = cilindrada;

    }

    public int getCilindrada (){
        return cilindrada;
    }

    public void setCilindrada (int cilindrada){
        this.cilindrada = cilindrada;
    }

     public double impuestoFinal (){
        double impuestoFinal = super.impuestoBase() + (3 * cilindrada);
        return impuestoFinal;
    }



}
