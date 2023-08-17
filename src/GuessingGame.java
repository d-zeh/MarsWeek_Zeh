import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

    Checker checker = new Checker();
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    int number = rand.nextInt(100);

    System.out.println("Greetings, player.... or are you a playa'?");
    System.out.println("Your name is?");

    String playerName = scanner.nextLine();
    System.out.println(playerName+"!!! I was just about to say that!");
    System.out.println("Your arrival has been predestined, ..." + playerName);
    System.out.println("The stars have responded to my plea, they return to me a number restricted from the moon and sun (between 1-100)");
    System.out.println("Guess the number in which the universe commands, I shall see if you're worthy");
    System.out.println(number);
    int firstGuess = scanner.nextInt();
    String response;


    if ( checker.goodNumber(firstGuess) == number) {
        System.out.println("On the first try???? My my, you ARE worthy to hone the truths and falsehoods of the universe, " + playerName);
    } else {

        if (checker.goodNumber(firstGuess) > number) {
            response = "your guess is too close to the stars.";
        } else {
            response = "your guess is too close to the bedrock beneath you.";
        }
        System.out.println("WRONG, " + response + " Guess again");


        int secondGuess = 0;
        int counter = 1;
        while (!(secondGuess == number)) {
            secondGuess = checker.goodNumber(scanner.nextInt());
            if (secondGuess > number) {
                response = "your guess is too close to the stars.";
            } else if(secondGuess < number){
                response = "your guess is too close to the bedrock beneath you.";
            } else {
                System.out.println("This is correct, the number was " + number+". It only took you " + (counter+1)+" tries. You are not worthy") ;
                break;
            }
            counter ++;
            System.out.println("WRONG, " + response + " Guess again");


        }

    }

    }
}

