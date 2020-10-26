package autovehicule;

public class Rezervor {

    private int capacitateMaxima;
    private int nivelCurent;

    public Rezervor()
    {
        this.capacitateMaxima = 40;
        this.nivelCurent = 0;
    }

    public Rezervor(int capacitateMaxima, int nivelCurent)
    {
        this.nivelCurent = nivelCurent;
        this.capacitateMaxima = capacitateMaxima;
    }

    public void setCapacitateMaxima(int capacitateMaxima)
    {
        this.capacitateMaxima = capacitateMaxima;
    }

    public int getcapacitateMaxima()
    {
        return capacitateMaxima;
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
        if(nivelCurent + litrii <= capacitateMaxima)
        {
            nivelCurent += litrii;
        }
        else
        {
            System.out.println("Rezervorul este suprasaturat cu " + (nivelCurent + litrii - capacitateMaxima));
            nivelCurent = capacitateMaxima;
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
