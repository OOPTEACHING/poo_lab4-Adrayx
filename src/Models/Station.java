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
            boolean ok = false;
            for(int i = 0; i < emptySlotIndex; i++)
                if(scooters[i].equals(scooter))
                {
                    for(int j = i; j < emptySlotIndex; j++)
                    {
                        scooters[j] = scooters[j + 1];
                    }
                    ok = true;
                    break;
                }
            if(ok == true){
                scooters[emptySlotIndex].setName("None");
                scooters[emptySlotIndex].setColor("None");
                scooters[emptySlotIndex].setId(0);
                scooters[emptySlotIndex].setUser(new User());
                emptySlotIndex--;
            }
            else
            {
                System.out.println("Scooter not found!");
            }

        }
    }

    public void removeAllScooters(){
        for(int i = emptySlotIndex; i >= 0; i--)
        {
            scooters[i].setName("None");
            scooters[i].setColor("None");
            scooters[i].setId(0);
            scooters[i].setUser(new User());
        }
        emptySlotIndex = 0;
    }
}
