package models;

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
            boolean ok = false;
            for(int i = 0; i < emptySlotIndex; i++)
                if(scooters[i].equals(scooter))
                {
                    for(int j = i; j < emptySlotIndex - 1; j++)
                    {
                        scooters[j] = scooters[j + 1];
                    }
                    ok = true;
                    break;
                }
            if(ok != true)
            {
                System.out.println("Scooter not found!");
            }
            else
            {
                emptySlotIndex--;
            }

        }
    }

    public void removeAllScooters(){
        for(int i = emptySlotIndex - 1; i >= 0; i--)
        {
            scooters[i] = null;
        }
        emptySlotIndex = 0;
    }
}
