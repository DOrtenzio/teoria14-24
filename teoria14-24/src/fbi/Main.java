package fbi;

public class Main {
    public static void main(String[] args) {
        FBI fbi=new FBI();
        Agente a1=new Agente(1);
        Agente a2=new Agente(2);
        AgenteSpeciale as1=new AgenteSpeciale(3,"Mario");
        Agente a3=new Agente(4);

        fbi.addAnAgente(a1);
        fbi.addAnAgente(a2);
        fbi.addAnAgente(a3);
        fbi.addAnAgente(as1);

        System.out.println(fbi.getNomeInCodice(1));
        System.out.println(fbi.getNomeInCodice(3));
        System.out.println(fbi.getNomeInCodice(20000));

        Missione m1=new Missione("Arresto latitante","Ambriola",5);
        Missione m2=new Missione("Eliminare le banane dal mondo","Mondo",1);

        System.out.println("Assegnazione missione: "+fbi.assegnaMissione(m1));
        System.out.println("Assegnazione missione: "+fbi.assegnaMissione(m2));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(as1);
    }
}