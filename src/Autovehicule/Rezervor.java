package Autovehicule;

public class Rezervor {

    private int maxCap;
    private int nivelCurent;

    public Rezervor()
    {
        this.maxCap = 40;
        this.nivelCurent = 0;
    }

    public Rezervor(int maxCap, int nivelCurent)
    {
        this.nivelCurent = nivelCurent;
        this.maxCap = maxCap;
    }

    public void setMaxCap(int maxCap)
    {
        this.maxCap = maxCap;
    }

    public int getMaxCap()
    {
        return maxCap;
    }

    public void setNivelCurent(int nivelCurent)
    {
        this.nivelCurent = nivelCurent;
    }

    public int getNivelCurent()
    {
        return nivelCurent;
    }

    public void umplere(int litrii)
    {
        if(nivelCurent + litrii <= maxCap)
        {
            nivelCurent += litrii;
        }
        else
        {
            System.out.println("Rezervorul este suprasaturat cu " + (nivelCurent + litrii - maxCap));
            nivelCurent = maxCap;
        }
    }

    public void golire(int litrii)
    {
        if(nivelCurent - litrii > 0)
        {
            nivelCurent -= litrii;
        }
        else
        {
            System.out.println("Maxina a ramas fara combustibil!");
            nivelCurent = 0;
        }
    }
}
