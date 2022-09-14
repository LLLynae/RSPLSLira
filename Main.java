import java.util.Scanner;
import java.util.Random;

public class Main {
    boolean winCheck;

    int player;
    int randomAI;
    int userChoice;
    String win;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


     public void main(String[] args) {
        
        System.out.println("Hello! Please choose rock, paper, scissors, lizard, or Spock.");
        userChoice = scanner.nextInt();
        System.out.println("Player Two turn!");
        random.nextInt();

    }


    public boolean winCheck (int rock, int paper, int spock) {
        if (userChoice == rock){
            if(randomAI == paper) {

                return winCheck = true;
                
            }
            else if (randomAI == spock) {

                return winCheck = true;
            }
            else {

                return winCheck = false;

            }

         }
        
        return winCheck;

        }
   
}