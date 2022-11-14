package javaapplication1;

import javax.swing.*;

public class Dice {

    public void dicePicture () {

    }

    /**
     * Picks a random value from 1 - 6
     *
     * @return - random value from 1 - 6
     */
    public Icon randomNumberDice() {
        int min = 1;
        int max = 6;
        ImageIcon die = new ImageIcon();;
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);

        ImageIcon die1 = new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
                "src\\javaapplication1\\dice\\Die1.png");
        ImageIcon die2 = new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
                "src\\javaapplication1\\dice\\Die2.png");
        ImageIcon die3 = new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
                "src\\javaapplication1\\dice\\Die3.png");
        ImageIcon die4 = new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
                "src\\javaapplication1\\dice\\Die4.png");
        ImageIcon die5 = new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
                "src\\javaapplication1\\dice\\Die5.png");
        ImageIcon die6 = new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
                "src\\javaapplication1\\dice\\Die6.png");

        switch (random) {
            case 1:
                die = die1;
                break;
            case 2:
                die = die2;
                break;
            case 3:
                die = die3;
                break;
            case 4:
                die = die4;
                break;
            case 5:
                die = die5;
                break;
            case 6:
                die = die6;
                break;
            default:
                System.out.println("No correct value was output: " + random);

        }

        return die;
    }
}
