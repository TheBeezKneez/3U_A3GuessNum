/*
*Name: Keira Innes
*Date: Nov 23, 2021
*Desription: Number guessing game
A3GuessNum**************
*/
import java.util.*;

public class A3GuessNum
{
    //Global variables
    static int dieRoll;
    static int guess;
    
    
    //method
    public static void mainGame(){
        
        Random randomNumGenerator = new Random();
        dieRoll = randomNumGenerator.nextInt(100)+1;
        System.out.println(dieRoll);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number");
        guess = input.nextInt();
        
        
    }
    
    //main method
	public static void main(String[] args) {
        
        //Objects
        boolean win = false;
        int chancesLeft = 5;
        
        
        //Game
        while (!win && chancesLeft != -1){
            
            mainGame();
            
            //If you won
            if (guess == dieRoll){
                System.out.println("You won!!");
                win = true;
            }
            
            //If you guessed wrong
            else{
                
                //Normal code
                if (chancesLeft != 0){
                    System.out.println("Sorry thats the wrong number, you have "+chancesLeft+" chance(s) left. Try again!");
                    chancesLeft--;
                }
                
                //If you ran out of guesses
                else{
                    System.out.println("Sorry you didn't win. Beter luck next time");
                    chancesLeft--;
                }
            }
        }
       
        
    }// close main
}