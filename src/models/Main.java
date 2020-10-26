package models;

public class Main {
    public static void main(String[] args){
        User user1 = new User(1, "Andrei", "0711111111");
        User user2 = new User(2, "Victor", "0722222222");

        Scooter scooter1 = new Scooter(42, "Verde", "Lime", user1);
        Scooter scooter2 = new Scooter(32, "Portocaliu", "Bolt", user2);

        Station station = new Station();
        station.addScooter(scooter1);
        station.addScooter(scooter2);

        station.removeScooter(scooter1);

        station.addScooter((scooter2));

        station.removeAllScooters();
    }
}
