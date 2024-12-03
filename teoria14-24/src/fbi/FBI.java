package fbi;

import java.util.ArrayList;

public class FBI {
    private ArrayList<Agente> agenti;

    //Costruttore
    public FBI (ArrayList<Agente> agenti){
        this.agenti=agenti;
    }
    public FBI(){
        this(new ArrayList<Agente>());
    }

    //get e set
    public ArrayList<Agente> getAgenti() { return agenti; }
    public void setAgenti(ArrayList<Agente> agenti) { this.agenti = agenti; }

    //metodi
    public void addAnAgente(Agente agente){ agenti.add(agente); }
    public String getNomeInCodice(int codiceAgente){
        for (int i=0;i<agenti.size();i++){
            if (agenti.get(i).getIdentificativo() == codiceAgente){
                if (agenti.get(i) instanceof AgenteSpeciale)
                    return ((AgenteSpeciale) agenti.get(i)).getNomeInCodice();
                else
                    return "Non è un'agente speciale, non ha nome in codice";
            }
        }
        return "Agente non trovato";
    }
    public boolean assegnaMissione(Missione missione){
        for (int i=0;i<agenti.size();i++){
            if (agenti.get(i).getMissione() == null){
                if (missione.getGrado()<5){
                    agenti.get(i).setMissione(missione);
                    return true;
                } else if(agenti.get(i) instanceof AgenteSpeciale){
                    agenti.get(i).setMissione(missione);
                    return true;
                }
            }
        }
        return false;
    }
}
