
public class Mensola {
    final static byte MAXLIBRI = 15;
    private Libro[] libri = new Libro[MAXLIBRI];
    private int numeroLibri = 0;

    public Mensola(Libro[] libri){
        int i;
        if(libri.length > MAXLIBRI){
            System.out.println("Non puoi aggiungere più di quindici libri");
        }else{
            for(i=0;i<libri.length;i++){
                this.libri[i] = libri[i];
                numeroLibri++;
            }
        }
    }

    public Mensola(Libro primoLibro){
        this.libri[0] = primoLibro;
        numeroLibri ++;
    }

    public int getNumeroLibri(){
        return this.numeroLibri;
    }

    public String getLibro(int index){
        return this.libri[index].toString();
    }

    public String ricercaPerTitolo(String titolo){
        int i;

        for (i=0;i<numeroLibri;i++){
            if(this.libri[i].getTitolo().equals(titolo.toUpperCase())){
                return getLibro(i);
            }
        }
        return ("Non trovato");
    }

    public String ricercaPerAutore(String autore){
        int i;
        String stringaFinale = "";

        for (i=0;i<numeroLibri;i++){
            if(this.libri[i].getAutore().equals(autore.toUpperCase())){
                stringaFinale += getLibro(i) + "\n";
            }
        }
        return stringaFinale;
    }

    public String ricercaPerAutore(Autore autore){
        int i;
        String stringaFinale = "";

        for (i=0;i<numeroLibri;i++){
            if(this.libri[i].getAutore().equals(autore.toString())){
                stringaFinale += getLibro(i) + "\n";
            }
        }
        return stringaFinale;
    }

    public void visualizzaMensola(){
        int i;

        for(i=0;i<this.numeroLibri;i++){
            System.out.println(getLibro(i));
        }
    }
    public void aggiungiLibro(Libro libro){
        if(numeroLibri < 5){
            this.libri[numeroLibri] = libro;
            numeroLibri++;
        }else{
            System.out.println("Mensola Piena");
        }

    }
    public void rimuoviLibro(Libro libro){
        byte i,j;
        Libro[] tempLibri = new Libro[numeroLibri];

        for(i=0;i<numeroLibri;i++){
            if(libro.getTitolo().equals(this.libri[i].getTitolo())){
                this.libri[i] = null;
                break;
            }
        }
        for(i=0,j=0;i<numeroLibri;i++){
            if(this.libri[i] != null){
                tempLibri[j] = this.libri[i];
                j++;
            }
        }
        numeroLibri--;
        this.libri = tempLibri;
    }

    public void ordinaPerCosto(){

        Libro temp;
        int i;

        for(i=0;i<numeroLibri-1;i++){
            if(this.libri[i].getCostoLibro() > this.libri[i+1].getCostoLibro()){
                temp = this.libri[i];
                this.libri[i] = this.libri[i+1];
                this.libri[i+1] = temp;
            }
        }

    }
}