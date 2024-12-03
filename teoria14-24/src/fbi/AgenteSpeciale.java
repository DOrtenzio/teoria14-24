package fbi;

public class AgenteSpeciale extends Agente{
    private String nomeInCodice;

    //Costruttore
    public AgenteSpeciale(int identificativo, String nomeInCodice) {
        super(identificativo);
        this.nomeInCodice=nomeInCodice;
    }

    //get e set
    public String getNomeInCodice() { return nomeInCodice; }
    public void setNomeInCodice(String nomeInCodice) { this.nomeInCodice = nomeInCodice; }

    //To string e equals
    @Override
    public String toString(){
        return super.toString() + "nome in codice: "+this.nomeInCodice;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof AgenteSpeciale){
            AgenteSpeciale r=(AgenteSpeciale) obj;
            return super.equals(r) && this.nomeInCodice.equalsIgnoreCase(r.getNomeInCodice());
        }
        return false;
    }
}
