/*
*Name: Keira Innes
*Date: Nov 23, 2021
*Desription: Number guessing game
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
        
        //objects
        boolean win = false;
        
        while (!win){
            
            mainGame();
            
            if (guess == dieRoll){
                //stuff
            }
        }
       
        
    }// close main
}