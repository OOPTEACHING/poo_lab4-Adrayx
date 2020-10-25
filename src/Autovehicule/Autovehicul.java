package Autovehicule;

import java.awt.*;

public class Autovehicul {

    private final int vitezaMaximaLimitata = 200;
    private String marca;
    private Color culoare;
    private int vitezaCurenta;
    private int treaptaCurenta;
    private int vitezaMaxima;
    private int numarTrepte;
    private Sofer sofer;
    private Rezervor rezervor;

    public Autovehicul(String marca, Color color, int vitezaCurenta, int treaptaCurenta, int vitezaMaxima, int numarTrepte, Sofer sofer, Rezervor rezervor){
        this.marca = marca;
        this.culoare = color;
        this.vitezaCurenta = vitezaCurenta;
        this.treaptaCurenta = treaptaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.numarTrepte = numarTrepte;
        this.sofer = sofer;
        this.rezervor = rezervor;
    }

    public Autovehicul(){
        this("Dacia", Color.BLUE, 20, 2, 180, 5, new Sofer(), new Rezervor());
    }

    public float calculDistanta(float perioada){
        return perioada * (float)vitezaCurenta;
    }

    public void accelerare(int viteza)
    {
        if(viteza + vitezaCurenta < vitezaMaxima){
            vitezaCurenta += viteza;
        }
        else{
            System.out.println("Vehiculul nu poate depasi viteza de:" + vitezaMaxima);
            vitezaCurenta = vitezaMaxima;
        }
    }

    public void decelerare(int viteza){
        if(vitezaCurenta - viteza < 0){
            System.out.println("Vehiculul este oprit");
            vitezaCurenta = 0;
        }
        else
        {
            vitezaCurenta -= viteza;
        }
    }

    public void schimbareTrepte(int fel){
        if(fel == 0)
        {
            if(treaptaCurenta == 1)
            {
                System.out.println("Masina se afla in treapta cea mai mica!");
            }
            else
                treaptaCurenta--;
        }
        else
        {
            if(treaptaCurenta == numarTrepte){
                System.out.println("Masina se afla in treapta cea mai mare!");
            }
            else
                treaptaCurenta++;
        }
    }

    public void oprire(){
        this.decelerare(this.vitezaCurenta);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setCuloare(Color color){
        this.culoare = color;
    }

    public Color getCuloare(){
        return this.culoare;
    }

    public void setVitezaCurenta(int viteza){
        if(viteza > vitezaMaxima)
            this.vitezaCurenta = vitezaMaxima;
        else
            this.vitezaCurenta = viteza;
    }

    public int getVitezaCurenta() {
        return this.vitezaCurenta;
    }

    public void setNumarTrepte(int numarTrepte) {
        this.numarTrepte = numarTrepte;
    }

    public int getNumarTrepte(){
        return this.numarTrepte;
    }

    public void setTreaptaCurenta(int treaptaCurenta) {
        if(treaptaCurenta > numarTrepte)
            this.treaptaCurenta = numarTrepte;
        else
            this.treaptaCurenta = treaptaCurenta;
    }

    public int getTreaptaCurenta() {
        return treaptaCurenta;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setRezervor(Rezervor rezervor) {
        this.rezervor = rezervor;
    }

    public Rezervor getRezervor() {
        return rezervor;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public int getVitezaMaximaLimitata() {
        return vitezaMaximaLimitata;
    }

    public void limitareElectronica()
    {
        this.vitezaMaxima = vitezaMaximaLimitata;
        System.out.println("Masina a fost limitata electronic la " + vitezaMaximaLimitata);
    }

    @Override
    public String toString(){
        return this.marca+ " " + this.culoare.toString();
    }
}
