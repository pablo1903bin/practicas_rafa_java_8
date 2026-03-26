package personasyfechas;

public class Main {

    public static void main (String[] args){

        Persona personaPrueba = new Persona ();
        Fecha fecha1 = new Fecha(01,04,1992);
        Fecha fecha2 = new Fecha (28,04,1996);
        Fecha fecha3 = new Fecha(04,06,1998);
        Persona persona1 = new Persona ("Pablo", "Rosas", "Portillo", fecha1);
        Persona persona2 = new Persona("Rafael", "Rocha", "Rosas", fecha2);
        Persona persona3 = new Persona ("Diana Citlali", "Rocha", "Rosas", fecha3);

        Persona[] grupo = {persona1, persona2, persona3};

        for (Persona p: grupo){

            System.out.println(p.getFecha().toString()); 

        }



    }


        




    }


