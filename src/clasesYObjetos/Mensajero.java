package clasesYObjetos;

public class Mensajero extends Empleado {

    private int numDeEntregas;

    public Mensajero(){

    }

    public Mensajero (String nombre, String numEmpleado, double salario, Nacionalidad nacionalidad, int numDeEntregas){

        super(nombre, numEmpleado, salario, nacionalidad);
        this.numDeEntregas = numDeEntregas;

    }

    public int getNumDeEntregas() {
        return numDeEntregas;
    }

    public void setNumDeEntregas(int numDeEntregas) {
        this.numDeEntregas = numDeEntregas;
    }

    @Override
    public String toString() {
        return super.toString() + "Mensajero [numDeEntregas=" + numDeEntregas + "]";
    }

    public double incrementarSalario (double salario){

        double comision = 50 * numDeEntregas;

        super.setSalario(super.getSalario() + comision + salario);

        return salario;
    }

    

}
