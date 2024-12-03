package fbi;

public class Agente {
    private int identificativo;
    private Missione missione;

    //Costruttore
    public Agente(int identificativo) {
        this.identificativo = identificativo;
        this.missione = null;
    }

    //get e set
    public int getIdentificativo() { return identificativo; }
    public void setIdentificativo(int identificativo) { this.identificativo = identificativo; }
    public Missione getMissione() { return missione; }
    public void setMissione(Missione missione) { this.missione = missione; }

    //To string e equals
    @Override
    public String toString(){
        if (this.missione==null)
            return "Agente: Id:"+this.identificativo+" Nessuna missione assegnata";
        else
            return "Agente: Id:"+this.identificativo + this.missione;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Agente){
            Agente r=(Agente) obj;
            return this.missione.equals(r.getMissione()) && r.getIdentificativo() == this.identificativo;
        }
        return false;
    }


}
