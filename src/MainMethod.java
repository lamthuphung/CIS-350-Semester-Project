import javaapplication1.NewJFrame;

public class MainMethod {


    /**
     *Honestly im not sure where to start so im just going
     * to brainstorm in the comments and see what sticks
     * @ author Camryn
     */
/**
We are going to need to create a class bets and a class for players
 we probably don't need a class for games because the program will
 only ever be running one game at a time.
*/

/**
The bet class we will need to be able to keep track of the number of
 javaapplication1.dice and the face value.  we should probably  create an array or
 list of some sort to keep track of all the bets that have been made
 so they can be displayed.
*/

/**
For the player class each player will need 5 Dice with six sides We
 should also give each player and ID number (one through five) to
 help keep track of which players turn it is We should also keep track
 of whether or not the player has won using a flag of some kind
*/


/**
 we will need a message that checks if the players bet is valid based
 on the previous bet.  if the number of javaapplication1.dice  in the current that is
 greater than the number of javaapplication1.dice in the previous bet then the face value
 can be any number.   if the number of javaapplication1.dice is equal to the previous bet
 then the face value must be higher  Then the previous bet. If the
 number of javaapplication1.dice is less than the previous bet then the bet is invalid.
*/


/**
We need a message it to be called when a player is accused of lying.
 this method will compare the bet to the total javaapplication1.dice on the table
 either by cycling through players and collecting the javaapplication1.dice values to
 be compared or by pulling from a pre-existing array or list. If the
 bet is accurate that is to say if there are at least the designated
 number of javaapplication1.dice with a designated face on the table then the player
 is not lying it has won the game.  if the player who is Accused is
 lying then the accuser wins the game.  this will be shown by changing
 the win flag  in the player object to a 1.
*/

/**
We will need a method that constantly checks if any players win flag is
 a 1 this method will show all javaapplication1.dice and end the game. this
 method should check if players want to play again with the same players
 though that may need to be handled with the GUI or with an additional method
*/



/**
There should be two  GUI screens  1 is the one that we have already created
 which is the play game screen.  another should be the home screen that Is
 displayed between games
 later we might add various options to this home screen such as
 AI difficulty or javaapplication1.dice size
*/

}
