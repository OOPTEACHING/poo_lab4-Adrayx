package Models;

import Autovehicule.Autovehicul;
import Autovehicule.Rezervor;
import Autovehicule.Sofer;

import java.awt.*;

public class main {
    public static void main(String[] args){
//        User user1 = new User(1, "Andrei", "0711111111");
//        User user2 = new User(2, "Victor", "0722222222");
//
//        Scooter scooter1 = new Scooter(42, "Verde", "Lime", user1);
//        Scooter scooter2 = new Scooter(32, "Portocaliu", "Bolt", user2);
//

        Autovehicul autovehicul = new Autovehicul();

        Rezervor rezervor = new Rezervor();
        Sofer sofer = new Sofer();

        System.out.println(autovehicul.toString());

        sofer.setNume("Moldovan");
        sofer.setPrenume("Andrei");
        sofer.setVarsta(20);
        sofer.setPermis("A1 B");

        rezervor.setMaxCap(55);
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
