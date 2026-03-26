package practica23;

public class Electrico extends Vehiculo{

    double precio;

    public Electrico (int num_bastidor, double peso, double precio){

        super (num_bastidor, peso);
        this.precio = precio;

    }

    public double getPeso (){

        return peso;
    }

    public void setPeso (double peso){

        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrico [num_bastidor=" + num_bastidor + ", precio=" + precio + ", peso=" + peso + "]";
    }

    public double impuestoFinal (){
        double impuestoFinal = super.impuestoBase() + (0.09 * precio);
        return impuestoFinal;
    }

    



}
