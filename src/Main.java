import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*Övning: skapa ett program som väljer ett tal mellan 1 och 100
     där användaren (anv) gissar vilket tal det är genom uteslutning.*/
        System.out.println("...:::Welcome to GUESS MY NUMBER!:::...");


        System.out.println("Wanna play? Press 1 for yes and 2 for no. ");
        int wannaPlay = input.nextInt();
        input.nextLine();

        if (wannaPlay == 2) {
            System.out.println("Thanks though!");
        }
        while (wannaPlay == 1) {
            //Generate random number
            int secret = (int) (Math.random() * 100 + 1);
//            System.out.println(secret);

//Spelet börjar

            System.out.println("Lets play! What number between 1 - 100 am I thinking of?");
            System.out.println("Guess my number? ");
            int number = input.nextInt();
            input.nextLine();


            while (number != secret) {
                if (number < secret) {
                    System.out.println("Sorry, too low. Try again! ");
                } else {
                    System.out.println("Sorry, too high. Try again! ");
                }
                System.out.println("Guess my number? ");
                number = input.nextInt();
                input.nextLine();
            }

            System.out.println("Correct! Would you like to play again? Press 1 for yes and 2 for no. ");
            int playAgain = input.nextInt();
            input.nextLine();
            if (playAgain != 2) {
            } else {
                System.out.println("Thanks for playing though!");
                wannaPlay = 0;

            }
        }
    }
}