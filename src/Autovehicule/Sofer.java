package Autovehicule;

public class Sofer {

    private String nume;
    private String prenume;
    private int varsta;
    private String permis;

    public Sofer() {
        this.nume = "Necunoscut";
        this.prenume = "Necunoscut";
        this.varsta = -1;
        this.permis = "Necunoscut";
    }

    public Sofer(String nume, String prenume, int varsta, String permis) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.permis = permis;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public String getPermis() {
        return permis;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString()
    {
        return this.nume + " " + this.prenume + " " + this.permis;
    }
}
