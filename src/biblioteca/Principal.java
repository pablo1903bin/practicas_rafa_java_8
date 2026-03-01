package biblioteca;

public class Principal {

    public static void main(String[] args) {

        Libro libro1 = new Libro(1, "Hush Hush", "Becca Fitzpatrick", 366);
        Libro libro2 = new Libro(2, "Crescendo", "Becca Fitzpatrick", 405);
        Libro libro3 = new Libro(3, "Silencio", "Becca Fitzpatrick", 412);

        Libro[] bloque1 = { libro1, libro2, libro3};
        Libro masGrueso = bloque1[0];

        

        for (Libro libro: bloque1){

            System.out.println(libro.toString());

            if (libro.getNumeroDePaginas() > masGrueso.getNumeroDePaginas()){

                masGrueso = libro;

            }
        }

        System.out.println("El libro con más páginas es " + masGrueso.getTitulo());

    }

}
