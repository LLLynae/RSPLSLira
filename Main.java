import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;


public class Main {
    boolean winCheck;

    int playerOne;
    int randomAI;
    String win;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


     
    public static void main(String[] args) {
        
        String userChoice = JOptionPane.showInputDialog("Welcome! Please make your choice :)");
        int randomAI = random.nextInt(5 - 1) +1;
   
        random.nextInt();

    }

    //1 is paper
    //2 is scissors
    //3 is rock
    //4 is spock
    //5 is lizard

    public boolean winCheck (String userChoice) {
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
         }

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
         }

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
         }

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
         }

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
         }
        
        return false;

        }
   
}