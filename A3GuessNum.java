/*
*Name: Keira Innes
*Date: Nov 23, 2021
*Desription: Number guessing game
A3GuessNum**************
*/
import java.util.*;

public class Main
{
    //Global variables
    static int dieRoll;
    static int guess;
    static boolean win = false;
    static int chancesLeft = 5;
    
    
    //Method 1
    public static void mainGame(){
        
        
        System.out.println(dieRoll);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number");
        guess = input.nextInt();
        
        
    }
    
    //Method 2 (contains most of the game)
    public static void fullGame(){
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
                    
                    //Hint system #1
                    if ((Math.abs(dieRoll - guess)) > 50){
                            System.out.println("Hint: Freezing");
                    }
                    
                    else if ((Math.abs(dieRoll - guess)) > 25){
                        System.out.println("Hint: Cold");
                    }
                    
                    else if ((Math.abs(dieRoll - guess)) > 10){
                        System.out.println("Hint: Warm");
                    }
                    
                    else if ((Math.abs(dieRoll - guess)) > 5){
                        System.out.println("Hint: Hot");
                    }
                    
                    else{
                        System.out.println("Hint: You're burning! Everything's on fire!");
                    }

                    //Hint system #2
                    if (guess > dieRoll){
                      System.out.println("Too high");
                    }
                    if (guess < dieRoll){
                      System.out.println("Too low");
                    }
                }
                
                //If you ran out of guesses
                else{
                    System.out.println("Sorry you didn't win. Beter luck next time");
                    chancesLeft--;
                }
                
            }
        }
    }//End method 2
    
    //Main method
	public static void main(String[] args) {
        
        //Objects
        Random randomNumGenerator = new Random();
        dieRoll = randomNumGenerator.nextInt(100)+1;
        
        //Game and repetition
        while (4 == 4){
            Scanner input1 = new Scanner(System.in);
            System.out.println("Do you want to play the Guessing Game?\ntype \"Yes\" or \"No\"");
            String replay = input1.nextLine();
            
            //If you want to play game
            if (replay.equalsIgnoreCase("yes")){
                
                Scanner input2 = new Scanner(System.in);
                System.out.println("Do you want to hear the instructions? Type \"Yes\" or \"No\"");
                String instructions = input2.nextLine(); //record the user input
                
                while (!instructions.equalsIgnoreCase("yes") && !instructions.equalsIgnoreCase("no")){
                    System.out.println("You did not enter a valid input, try again.");
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Do you want to hear the instructions? Type \"Yes\" or \"No\"");
                    instructions = input3.nextLine(); //record the user input
                }
                //If you WANT instructions
                if (instructions.equalsIgnoreCase("yes")){
                System.out.println("\nThe computer will pick a secret number between 1 and 100. Your goal is to correctly guess the secret number. ");
                System.out.println("You will get 5 guesses and once you've run out, you lose.");
                System.out.println("Don't worry! The computer will also give you hints to help you figure out how far or close you are from the secret number.");
                System.out.println("Lets begin!\n");
                }
                
                fullGame();
                chancesLeft = 5; //resetting chances
            }
            
            //If you DONT want to play game
            else if (replay.equalsIgnoreCase("no")){
                System.out.println("Alright, see you next time");
                break;
            }
            
            //You misstyped
            else{
                System.out.println("You typed in something incorrectly, pay closer attention to the instructions and try again\n");
            }
        }
        
        
        
        
       
        
    }// close main
}