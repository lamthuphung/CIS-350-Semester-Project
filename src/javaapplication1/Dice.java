package javaapplication1;

import javax.swing.*;

public class Dice extends NewJFrame{

    public void dicePicture(){

    }

    /**
     * Picks a random value from 1 - 6
     *
     * @return - random value from 1 - 6
     */
    public Icon[] DicePhoto() {
        Icon die = null;

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

        int[] diceNumber = getDieNumber();
        Icon[] picDie = new Icon[25];
        for (int i = 0; i <= 24; i++) {
            switch (diceNumber[i]) {
                case 1 -> picDie[i] = die1;
                case 2 -> picDie[i] = die2;
                case 3 -> picDie[i] = die3;
                case 4 -> picDie[i] = die4;
                case 5 -> picDie[i] = die5;
                case 6 -> picDie[i] = die6;
            }
        }

        return picDie;
    }
    public int[] getDieNumber() {
        final int DICEARRAY_SIZE = 24;

        final int[] ARR = new int[25];
        final int[] DIECOUNT = new int[7];

        int min = 1;
        int max = 6;
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);

        for (int i = 0; i <= DICEARRAY_SIZE; i++) {
            ARR[i] = random;
        }

        for (int i = 0; i <= DICEARRAY_SIZE; i++) {
            switch (ARR[i]) {
                case 1 -> DIECOUNT[1]++;
                case 2 -> DIECOUNT[2]++;
                case 3 -> DIECOUNT[3]++;
                case 4 -> DIECOUNT[4]++;
                case 5 -> DIECOUNT[5]++;
                case 6 -> DIECOUNT[6]++;
            }
        }

//        JOptionPane.showMessageDialog(null,
//                "Die 1: " + dieFace1);
        System.out.println(DIECOUNT[1]);
        System.out.println(DIECOUNT[2]);
        System.out.println(DIECOUNT[3]);
        System.out.println(DIECOUNT[4]);
        System.out.println(DIECOUNT[5]);
        System.out.println(DIECOUNT[6]);

        return DIECOUNT;
    }

    public void setDiceImage() {
        Icon[] DicePic = DicePhoto();

        player1Die1.setIcon(DicePic[0]);
        player1Die2.setIcon(DicePic[1]);
        player1Die3.setIcon(DicePic[2]);
        player1Die4.setIcon(DicePic[3]);
        player1Die5.setIcon(DicePic[4]);
        //gets pictures of javaapplication1.dice for player1 javaapplication1.dice
//        GUI.player1Die1 = new JLabel(new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
//                "src\\javaapplication1\\dice\\Die1.png"));
//        GUI.player1Die2 = new JLabel(new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
//                "src\\javaapplication1\\dice\\Die1.png"));
//        GUI.player1Die3 = new JLabel(new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
//                "src\\javaapplication1\\dice\\Die1.png"));
//        GUI.player1Die4 = new JLabel(new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
//                "src\\javaapplication1\\dice\\Die1.png"));
//        GUI.player1Die5 = new JLabel(new ImageIcon("C:\\Users\\gavin\\IdeaProjects\\Liars Dice\\CIS-350-Semester-Project\\" +
//                "src\\javaapplication1\\dice\\Die1.png"));

//        //gets pictures of javaapplication1.dice for player2 javaapplication1.dice
//        player2Die1.setIcon(rand.randomNumberDice());
//        player2Die2.setIcon(rand.randomNumberDice());
//        player2Die3.setIcon(rand.randomNumberDice());
//        player2Die4.setIcon(rand.randomNumberDice());
//        player2Die5.setIcon(rand.randomNumberDice());
//
//        //gets pictures of javaapplication1.dice for player3 javaapplication1.dice
//        player3Die1.setIcon(rand.randomNumberDice());
//        player3Die2.setIcon(rand.randomNumberDice());
//        player3Die3.setIcon(rand.randomNumberDice());
//        player3Die4.setIcon(rand.randomNumberDice());
//        player3Die5.setIcon(rand.randomNumberDice());
//
//        //gets pictures of javaapplication1.dice for player4 javaapplication1.dice
//        player4Die1.setIcon(rand.randomNumberDice());
//        player4Die2.setIcon(rand.randomNumberDice());
//        player4Die3.setIcon(rand.randomNumberDice());
//        player4Die4.setIcon(rand.randomNumberDice());
//        player4Die5.setIcon(rand.randomNumberDice());
//
//        //gets pictures of javaapplication1.dice for player5 javaapplication1.dice
//        player5Die1.setIcon(rand.randomNumberDice());
//        player5Die2.setIcon(rand.randomNumberDice());
//        player5Die3.setIcon(rand.randomNumberDice());
//        player5Die4.setIcon(rand.randomNumberDice());
//        player5Die5.setIcon(rand.randomNumberDice());

    }
    public static void main(String args[]) {

        NewJFrame gui = new NewJFrame();





    }

}
