import java.util.ArrayList;

public class Die{
    private int numSides;
    private int lastRoll;
    private int rollsAdd;
    private int add;

    public Die(){
        numSides = 6;
        lastRoll = -1;
    }

    public Die(int N){
        numSides = N;
        lastRoll = -1;
    }

    public int getNumSides(){
        return numSides;
    }

    public int getRoll(){
        int roll = (int) (1 + (Math.random()) * numSides);
        lastRoll = roll;
        return roll;
    }

    public int getLastRoll(){
        return lastRoll;
    }

    public ArrayList<Integer> getManyDie(){
        rollsAdd = 0;
        ArrayList<Integer> rollsInList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            add = getRoll();
            rollsAdd += add;
            rollsInList.add(add);

        }
        return rollsInList;
    }

    public int getRollsAdd(){
        return rollsAdd;
    }
}
