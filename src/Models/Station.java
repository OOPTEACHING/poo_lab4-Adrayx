package Models;

public class Station {

    public static final int SLOTS = 5;
    public Scooter[] scooters;
    private int emptySlotIndex;

    public Station(){
        scooters = new Scooter[SLOTS];
    }

    public void addScooter(Scooter scooter){
        if(emptySlotIndex < SLOTS)
        {
            scooters[emptySlotIndex] = scooter;
            emptySlotIndex++;
            System.out.println("A fost adaugat" + scooter.getName());
        }
    }

    public int getEmptySlot(){
        return this.emptySlotIndex;
    }

    public void setEmptySlot(int emptySlotIndex){
        this.emptySlotIndex = emptySlotIndex;
    }

    public void removeScooter(Scooter scooter){
        if(emptySlotIndex == 0){
            System.out.println("Statia este goala!");
            return;
        }
        else
        {
            emptySlotIndex--;
        }
    }

    public void removeAllScooters(){
        emptySlotIndex = 0;
    }
}
