/**
 * This class is used to simulate a roll of a die
 */

import java.util.Random;

public class Dice {
    public int roll()
    {
        //Simulate a 6-face die
        Random r = new Random();               //Create a random generator

        int result = r.nextInt(6) + 1;  //Give a result between 1 and 6

        return result;
    }

    public void setDice1(int value)
    {
        dice1 = value;
    }

    public int getDice1()
    {
        return dice1;
    }

    public void setDice2(int value)
    {
        dice2 = value;
    }

    public int getDice2()
    {
        return dice2;
    }

    public void setDice3(int value)
    {
        dice3 = value;
    }

    public int getDice3()
    {
        return dice3;
    }

    public void setDice4(int value)
    {
        dice4 = value;
    }

    public int getDice4()
    {
        return dice4;
    }

    public void setDice5(int value)
    {
        dice5 = value;
    }

    public int getDice5()
    {
        return dice5;
    }

}
