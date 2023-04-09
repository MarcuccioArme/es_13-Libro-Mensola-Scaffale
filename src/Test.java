public class Test {
    public static void main(String...args){
        Autore a1 = new Autore("Italo","Calvino");
        Autore a2 = new Autore("Luigi","Pirandello");
        Autore a3 = new Autore("Gabriele","D'annunzio");

        Libro l1 = new Libro(a2,72,3352,"Sei personaggi in cerca d'autore");
        Libro l2 = new Libro(a2,300,2213,"Il fu Mattia Pascal");
        Libro l3 = new Libro(a2,100,44221,"Enrico IV");

        Libro l4 = new Libro(a3,108,123132,"La figlia di Iorio");
        Libro l5 = new Libro(a3,216,123132,"Il piacere");
        Libro l6 = new Libro(a3,198,123132,"Il trionfo della morte");

        Libro l7 = new Libro(a1,187,12345,"Le città invisibili");
        Libro l8 = new Libro(a1,183,231341,"Se una notte d'inverno un viaggiatore");
        Libro l9 = new Libro(a1,155,12345,"Il barone rampante");


        Libro[] arrayLib1 = {l1,l2,l3};
        Libro[] arrayLib2 = {l4,l5,l6};
        Libro[] arrayLib3 = {l7,l8,l9};

        Mensola mensola1 = new Mensola(arrayLib1);
        Mensola mensola2 = new Mensola(arrayLib2);
        Mensola mensola3 = new Mensola(arrayLib3);

        Mensola[] arrayMensola = {mensola1,mensola2,mensola3};

        Scaffale scaffale1 = new Scaffale(arrayMensola);

        mensola1.visualizzaMensola();

        System.out.println(mensola1.ricercaPerAutore(a1));

        mensola1.rimuoviLibro(l7);
        mensola1.rimuoviLibro(l4);

        mensola1.visualizzaMensola();

        System.out.println(scaffale1.getScaffale());
        System.out.println(scaffale1.getMensola(1));

    }
}