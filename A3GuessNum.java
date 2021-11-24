/*
*Name: Keira Innes
*Date: Nov 23, 2021
*Desription: Number guessing game
*/
import java.util.*;

public class A3GuessNum
{
    
    //method
    public static void mainGame(){
        
        Random randomNumGenerator = new Random();
        int dieRoll = randomNumGenerator.nextInt(100)+1;
        System.out.println(dieRoll);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number");
        int guess = input.nextInt();
        
    }
    
    //main method
	public static void main(String[] args) {
        
        boolean win = false;
        
        if (!win){
            mainGame();
        }
        
    }// close main
}