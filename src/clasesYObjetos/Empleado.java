package clasesYObjetos;

import java.security.PrivateKey;

public class Empleado {

    //Atributos: se manejan en private para encapsularlos y solo se accede a ellos mediante sus metods que si son publicos
    private String nombre;
    private String numTrabajador;
    private double salario;

    //Metodos: se mantienen publicos para ser solicitados en otras clases u objetos perosin que tengan acceso a los atributos 

      //para inicializar los valores de los atributos se hace un CONSTRUCTOR

    public Empleado(){                                                            // este es un constructor sin atributos

    }

    // este es un contructor con atributos

    public Empleado (String nombre, String numTrabajador, double salario){

        this.nombre = nombre;
        this.numTrabajador = numTrabajador;
        this.salario = salario;
    }

    // getters y setters
    
    public String getNombre () {

        return nombre;

    }

    public void setNombre (String nombre){

        this.nombre = nombre;

    }

    public String getNumTrabajador () {

        return numTrabajador;

    }

    public void setNumTrabajador (String numTrabajador){

        this.numTrabajador = numTrabajador;

    }

    public double getSalario () {

        return salario;

    }

    public void setSalario (double salario){

        this.salario = salario;
    }



    // este metodo actualiza la propiedad salario 

    public double incrementarSalario(double incremento){

        this.salario = this.salario + incremento;

        return this.salario;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", numTrabajador=" + numTrabajador + ", salario=" + salario + "]";
    }

    


    
}
