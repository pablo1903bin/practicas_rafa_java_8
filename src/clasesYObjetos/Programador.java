package clasesYObjetos;

public class Programador extends Empleado {

    private String lenguaje;

    public Programador() {

    }

    public Programador(String nombre, String numTrabajador, double salario, Nacionalidad nacionalidad,
            String lenguaje) {

                super(nombre, numTrabajador, salario, nacionalidad);
                this.lenguaje = lenguaje;

    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return super.toString() + "Programador [lenguaje=" + lenguaje + "]";
    }

    // metodos propios de una clase hija

    public void lenguajeDominante(){

        System.out.println("Lenguaje de programación que domina: " + lenguaje);

    }

    public double incrementarSalario (double salario){

        super.setSalario(super.getSalario() + 100 + salario);

        return salario;
    }

    

}
