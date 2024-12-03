package fbi;

public class Missione {
    private String scopo;
    private String luogo;
    private int grado;

    //Costruttori
    public Missione(String scopo, String luogo, int grado) {
        this.scopo = scopo;
        this.luogo = luogo;
        setGrado(grado);
    }
    public Missione(){
        this("X","X",1);
    }

    //get e set
    public String getScopo() { return scopo; }
    public void setScopo(String scopo) { this.scopo = scopo; }

    public String getLuogo() { return luogo; }
    public void setLuogo(String luogo) { this.luogo = luogo; }

    public int getGrado() { return grado; }
    public void setGrado(int grado) {
        if (grado < 1 || grado > 5)
            this.grado=1;
        else
            this.grado = grado;
    }

    //To string e equals
    @Override
    public String toString(){
        return "MISSIONE: Luogo:"+this.luogo+" Scopo: "+this.scopo+" Grado di difficoltà: "+this.grado;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Missione){
            Missione r=(Missione) obj;
            return r.getGrado() == this.grado && r.getLuogo().equalsIgnoreCase(this.luogo) && r.getScopo().equalsIgnoreCase(this.scopo);
        }
        return false;
    }
}
