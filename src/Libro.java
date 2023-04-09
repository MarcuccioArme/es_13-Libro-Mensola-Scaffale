public class Libro {


    private final float COSTOBASE = 5.5f;
    private static float costoPerPagina = 0.05f;
    private final Autore autore;
    private int codiceLibro;
    private final int nPagine;
    private float costoLibro;
    private final String titolo;

    public Libro(Autore autore, int nPagine,int codiceLibro,String titolo) {
        this.autore = autore;
        this.nPagine = nPagine;
        this.titolo = titolo;
    }

    public String getAutore() {
        return this.autore.toString();
    }

    public int getCodiceLibro() {
        return this.codiceLibro;
    }

    public int getnPagine() {
        return nPagine;
    }

    public float getCostoLibro() {
        this.costoLibro = COSTOBASE + (nPagine*costoPerPagina);
        return costoLibro;
    }

    public String getTitolo() {
        return titolo;
    }

    public static void setCostoPerPagina(float costoPerPagina) {
        Libro.costoPerPagina = costoPerPagina;
    }

    public String toString(){
        return (this.autore.toString() + ": " + getTitolo());
    }

}