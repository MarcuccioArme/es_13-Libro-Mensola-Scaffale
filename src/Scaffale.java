public class Scaffale {
    final byte MAXMENSOLE = 5;
    Mensola[] mensole = new Mensola[MAXMENSOLE];
    byte numeroMensole = 0;

    public Scaffale(Mensola[] mensola){
        int i;
        if(mensola.length > MAXMENSOLE){
            System.out.println("Non puoi aggiungere più di 5 mensole");
        }else{
            for(i=0;i<mensola.length;i++){
                this.mensole[i] = mensola[i];
                numeroMensole++;
            }
        }
    }

    public Scaffale(Mensola Mensola){
        this.mensole[0] = Mensola;
        numeroMensole ++;
    }

    public byte getNumeroMensole() {
        return numeroMensole;
    }

    public String getScaffale() {
        int i, j;
        String returnString = "";

        for (i = 0; i < numeroMensole; i++) {
            for (j = 0; j < this.mensole[i].getNumeroLibri(); j++) {
                returnString += this.mensole[i].getLibro(j) + "\n";
            }
            returnString += "\n";
        }

        return returnString;

    }

    public String getMensola(int index) {
        int i, j;
        String returnString = "";

        for (i=0;i<this.mensole[index].getNumeroLibri();i++){
            returnString += this.mensole[index].getLibro(i) + "\n";
        }
        return returnString;
    }

}