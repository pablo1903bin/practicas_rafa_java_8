package cuentasbancarias;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta (){

    }

    public Cuenta (String titular){

        this.titular = titular;

    }

    public String getTitular (){

        return titular;

    }

    public void setTitular (String titular){

        this.titular = titular;
        
    }

    public double getCantidad (){

        return cantidad;

    }

    public void setCantidad (double cantidad){

        this.cantidad = cantidad;

    }

    public double ingresar (double cantidad){

        if (cantidad > 0){

            this.cantidad = this.cantidad + cantidad;

        }
        
        return this.cantidad;

    }

    public double retirar (double cantidad){

        if (this.cantidad - cantidad < 0){

            this.cantidad = 0;

            return this.cantidad;

        }

        this.cantidad = this.cantidad -cantidad;

        return this.cantidad;

    }

    @Override
    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }

    





}
