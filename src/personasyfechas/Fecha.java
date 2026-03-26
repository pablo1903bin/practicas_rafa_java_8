package personasyfechas;

public class Fecha {

   private int dia;
   private int mes;
   private int año;

   public Fecha (){

   }

   public Fecha(int dia, int mes, int año) {

    this.dia = dia;
    this.mes = mes;
    this.año = año;

   }

   public int getDia() {
    return dia;
   }

   public void setDia(int dia) {
    this.dia = dia;
   }

   public int getMes() {
    return mes;
   }

   public void setMes(int mes) {
    this.mes = mes;
   }

   public int getAño() {
    return año;
   }

   public void setAño(int año) {
    this.año = año;
   }

   @Override
   public String toString() {

    String formatoFecha = "";

    if (dia<10){

        formatoFecha = formatoFecha +"0"+dia;
    } else {

        formatoFecha = formatoFecha + dia;

    }

    if (mes<10){

        formatoFecha = formatoFecha +"/0"+ mes;
    
    } else {

        formatoFecha = formatoFecha +"/"+ mes;

    }
    formatoFecha = formatoFecha + "/" + año;

    return formatoFecha;

   }

   

   


}
