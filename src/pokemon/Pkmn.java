package pokemon;

public class Pkmn {

    private String nombre;
    private String tipo;
    private int numPkdxNcnl;

    public Pkmn (){
        
    }

    public Pkmn(String nombre, String tipo, int numPkdxNcnl) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.numPkdxNcnl = numPkdxNcnl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumPkdxNcnl() {
        return numPkdxNcnl;
    }

    public void setNumPkdxNcnl(int numPkdxNcnl) {
        this.numPkdxNcnl = numPkdxNcnl;
    }

    @Override
    public String toString() {
        return nombre + " es un pokémon de tipo " + tipo + " y su numero de pokédex nacional es " + numPkdxNcnl + ".";
    }

    

    

}
