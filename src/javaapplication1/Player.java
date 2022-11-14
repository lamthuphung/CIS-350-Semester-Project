package javaapplication1;

import javax.swing.*;

/**
 * Description: This class is used to create a player
 */
public class Player {
    private String name;        //Player name
    private int numOrder;       //Numerical order of players
    private int numDice;        //The number of javaapplication1.dice the players have
    private int dice1, dice2, dice3, dice4, dice5;
//    private Dice[] dices;
//
//    public Player()
//    {
//        dices = new Dice[4];
//    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setPlayerOrder(int num)
    {
        numOrder = num;
    }

    public int getPlayerOrder()
    {
        return numOrder;
    }

    public void setNumDice(int numDice)
    {
        this.numDice = numDice;
    }

    public int getNumDice()
    {
        return numDice;
    }




    public String toString()
    {
        return "Hello " + name + ". You are player #" + numOrder + ".\n" + "The number of javaapplication1.dice you have: " + numDice;
    }
}
