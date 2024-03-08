import java.util.Scanner;
import java.util.Random;


public class test {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play RockPaperScissors.");
        
        int randomNum = random.nextInt(3);
        String botChoice = "";
        if (randomNum == 0) {
            botChoice = "rock";
        }
        if (randomNum == 1) {
            botChoice = "paper";
        }
        if (randomNum == 2) {
            botChoice = "scissors";
        }
        
        System.out.println("Pick rock, paper, or scissors.");

        String userChoice = scanner.nextLine();
        userChoice = userChoice.toLowerCase();    

        System.out.println();
        System.out.println("I chose " + botChoice + ".");
        System.out.println();

        

        if (userChoice.equals(botChoice)) {
            System.out.println("It's a tie!");
        }
        if (userChoice.equals("rock") && botChoice.equals("paper")) {
            System.out.println("I won!");
        }
        if (userChoice.equals("rock") && botChoice.equals("scissors")) {
            System.out.println("You won!");
        }
        if (userChoice.equals("paper") && botChoice.equals("rock")) {
            System.out.println("You won!");
        }
        if (userChoice.equals("paper") && botChoice.equals("scissors")) {
            System.out.println("I won!");
        }    
        if (userChoice.equals("scissors") && botChoice.equals("rock")) {
            System.out.println("I won!");
        }
        if (userChoice.equals("scissors") && botChoice.equals("paper")) {
            System.out.println("You won!");
        }

        
        scanner.close();
    } 
}

