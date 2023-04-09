public class Autore{

    private final String Nome;
    private final String Cognome;


    public Autore(String nome, String cognome) {
        this.Nome = nome;
        this.Cognome = cognome;
    }


    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public String toString(){
        return (Cognome + " " + Nome);
    }
}