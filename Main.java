/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Sept 18,2022
 *Windows 11
 */

import java.util.Scanner;
import java.util.Random;


public class Main {

    boolean winCheck;
    int playerOne;
    String win;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


     
    public static void main(String[] args) {
       
        System.out.println("Hi! Make your choice please!");
        String userChoice = scanner.next();//user input
        userChoice = userChoice.toLowerCase();//puts input into lowercase
        System.out.println("Now it's the Computer's turn!");
        int randomAI = random.nextInt(5 -1) +1; 
            if (randomAI == 1){
            System.out.println("paper");
            }
            else if (randomAI == 2){
            System.out.println("scissors");
            }
            else if (randomAI == 3){
            System.out.println("rock");
            }
            else if (randomAI == 4){
            System.out.println("spock");
            }
            else if (randomAI == 5){
            System.out.println("lizard");
            }
            else {
            System.out.println("something went wrong :(");
            }//Error message
            //if statement translates random integer values back into rock, paper, scissors, lizard, or spock

        if(userChoice.equals("rock") && randomAI == 3) {
            System.out.println("cannot tie!");
            System.exit(0);
        }else if(userChoice.equals("paper") && randomAI == 1) {
            System.out.println("cannot tie!");
            System.exit(0);
        }else if(userChoice.equals("scissors") && randomAI == 2) {
            System.out.println("cannot tie!");
            System.exit(0);
        }else if(userChoice.equals("spock") && randomAI == 4) {
            System.out.println("cannot tie!");
            System.exit(0);
        }else if(userChoice.equals("lizard") && randomAI == 5) {
            System.out.println("cannot tie!");
            System.exit(0);
        }//end of check for ties
        
        if (!winCheck(userChoice, randomAI)) {
            System.out.println("You Win!");
        } else if (winCheck(userChoice, randomAI)) {
                System.out.println("Computer Wins!");
        } //End of wincheck printout
    

        }

    

    public static boolean winCheck (String userChoice, int randomAI) {
        if (userChoice.equals("rock")){
            if(randomAI == 1) {
                return true;
            }
            else if (randomAI == 4) {
                 return true;
            }
            else {
                return false;
            }
         }//end of if statement for rock

         else if(userChoice.equals("paper")) {
            if(randomAI == 2){
                return true;
            }
            else if(randomAI == 5) {
                return true;
            }
            else {
                return false;
            }
         }//end of if statement for paper

         else if(userChoice.equals("scissors")) {
            if(randomAI == 3){
                return true;
            }
            else if(randomAI == 4){
                return true;
            }
            else{
                return false;
            }
         }//end of if statement for scissors

         else if(userChoice.equals("lizard")){
            if(randomAI == 2){
                return true;
            }
            else if(randomAI == 3) {
                return true;
            }
            else{
                return false;
            }
         }//end of if statement for lizard

         else if(userChoice.equals("spock")){
            if(randomAI == 1){
                return true;
            }
            else if(randomAI == 5) {
                return true;
            }
            else{
                return false;
            }
         }//end of if statement for spock
        
        return false;

        }//End of boolean winCheck
   
}//End of Main