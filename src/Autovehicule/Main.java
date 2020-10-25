package Autovehicule;

import java.awt.*;

public class Main {
    public void main(String[] args)
    {
        Autovehicul autovehicul = new Autovehicul();

        Rezervor rezervor = new Rezervor();
        Sofer sofer = new Sofer();

        System.out.println(autovehicul.toString());

        sofer.setNume("Moldovan");
        sofer.setPrenume("Andrei");
        sofer.setVarsta(20);
        sofer.setPermis("A1 B");
        sofer.toString();

        rezervor.setCapacitateMaxima(55);
        rezervor.setNivelCurent(30);

        autovehicul.setMarca("BMW");
        autovehicul.setCuloare(Color.CYAN);
        autovehicul.setVitezaMaxima(230);
        autovehicul.accelerare(120);
        autovehicul.setRezervor(rezervor);
        autovehicul.setSofer(sofer);

        System.out.println(autovehicul.toString());
        System.out.println(autovehicul.calculDistanta(0.5f));

        System.out.println(autovehicul.getVitezaMaxima());
        autovehicul.limitareElectronica();
        System.out.println(autovehicul.getVitezaMaxima());
    }
}
