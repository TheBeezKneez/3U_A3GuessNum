/*
*Name: Keira Innes
*Date: Nov 30, 2021
*Desription: Number guessing game
*/
import java.util.*;

public class A3GuessNum
{
    //Global variables
    static int dieRoll;
    static String guessString;
    static int guess;
    static boolean win = false;
    static int chancesLeft = 5;
    
    
    //Method 1
    public static void mainGame(){

        //If there is invalid input
        while (true){
            
            boolean numberExeption = false;
            
            //record the users input
            Scanner input = new Scanner(System.in);
            System.out.println("Guess a number.\n");
            guessString = input.nextLine();
            
            try{
                guess = Integer.parseInt(guessString);
            }
            catch (NumberFormatException ex){   //if it catches an error
                numberExeption = true;
                System.out.println("You've entered an invalid input type, try again.\n");
            }
            
            //If program doesn't catch a number exeption
            if (!numberExeption){
                guess = Integer.parseInt(guessString);
                
                if (guess > 100 || guess < 1){  //if out of bounds
                    System.out.println("You've entered an out of bounds number. Remember, the secret number is only between 1-100. Try again.\n");
                }
                else{   //if input works
                    break;
                }
            }
            
            
        }//close while loop
    }//close method 
        
    
    //Method 2
    public static void fullGame(){
        while (!win && chancesLeft != -1){
            
            mainGame();
            
            //If you won
            if (guess == dieRoll){
                System.out.println("\nYou won!!");
                win = true;
            }
            
            //If you guessed wrong
            else{
                
                //Normal code
                if (chancesLeft != 0){
                    
                    System.out.println("\nSorry thats the wrong number, you have "+chancesLeft+" chance(s) left. Try again!");
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
                      System.out.println("Hint: Too high");
                    }
                    if (guess < dieRoll){
                      System.out.println("Hint: Too low");
                    }
                }
                
                //If you ran out of guesses
                else{
                    System.out.println("\nSorry you didn't win. Beter luck next time.\n");
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
                
                //Instructions question
                Scanner input2 = new Scanner(System.in);
                System.out.println("\nDo you want to hear the instructions? Type \"Yes\" or \"No\"");
                String instructions = input2.nextLine(); //record the user input
                
                //If input is invalid
                while (!instructions.equalsIgnoreCase("yes") && !instructions.equalsIgnoreCase("no")){
                    System.out.println("You did not enter a valid input, try again.");
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("\nDo you want to hear the instructions? Type \"Yes\" or \"No\"");
                    instructions = input3.nextLine(); //record the user input
                }
                //If you WANT instructions
                if (instructions.equalsIgnoreCase("yes")){
                System.out.println("\nThe computer will pick a secret number between 1 and 100. Your goal is to correctly guess the secret number. ");
                System.out.println("You will get 5 guesses and once you run out, you lose.");
                System.out.println("Don't worry though! The computer will also give you hints to help you figure out how far or close you are from the secret number.");
                System.out.println("Lets begin!\n");
                }
                
                fullGame();
                chancesLeft = 5; //resetting chances
                win = false; //resetting win score
            }
            
            //If you DONT want to play game
            else if (replay.equalsIgnoreCase("no")){
                System.out.println("Alright, see you next time.");
                break;
            }
            
            //You misstyped
            else{
                System.out.println("You typed in something incorrectly, pay closer attention to the instructions and try again.\n");
            }
        }
        
        
    }// close main
}