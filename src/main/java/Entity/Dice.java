package Entity;

//Dice class to set the Players position.
public class Dice {

    private int sides;

    //constructor to choose the amount of sides of the die

    /**
     *
     * @param sides
     */
    public Dice(int sides){
        this.sides=sides;
    }

    // roll the die and return the value (1-6)

    /**
     *
     * @return
     */
    public int roll() {
        int d1 = (int)(Math.random() * sides + 1);
        return d1;
    }

    // roll the die n times and print the values

    /**
     *
     * @param n
     */
    public void rollMultiple(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(roll() + " ");
        }
    }
}