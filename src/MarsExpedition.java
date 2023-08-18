import java.sql.SQLOutput;
import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opening Program");
        Thread.sleep(1000);
        System.out.println("Booting");
        Thread.sleep(1000);
        System.out.println("Booting");
        Thread.sleep(1000);
        System.out.println("Booting");
        Thread.sleep(1000);
        System.out.println("Booting");
        Thread.sleep(1000);
        System.out.println("Welcome");

        System.out.println("What's your name, honey-buns?");
        String name = scanner.nextLine();
        System.out.println(name+"? What a stupid name. Welcome to the Expedition prep Program! Are you prepared to be amazed??(Type Y or N)");
        String YoN = scanner.nextLine();
        if (YoN.equals("Y")) {
            System.out.println("Fine, whatever. Let's go");
        } else if (YoN.equals("N")) {
            System.out.println("Well too bad, you're coming.");
        } else {
            System.out.println("DO YOU NOT KNOW HOW TO LISTEN TO FUCKING DIRECTIONS?????? YOU'RE TEAM LEADER NOW");

        }
        System.out.println("How many people are you bringing");
        int people = scanner.nextInt();
        if (people == 2) {
            System.out.println("Good, let's go");
        } else {
            System.out.println("WRONG, you're bringing two");
        }
        System.out.println("What kind of snack do you want?");
        scanner.nextLine();
        String snack = scanner.nextLine();
        Thread.sleep(3000);
        System.out.println(snack+"?");
        Thread.sleep(3000);
        System.out.println("........");
        Thread.sleep(3000);
        System.out.println("...."+snack+"? .... That's weird");
        Thread.sleep(1000);
        System.out.println("Whatever, get "+name+ " a " +snack);
        Thread.sleep(2000);

        String[] rides = {"Unicorn Flufficans of Death","The Great Dragon, Bahamut","On the back of 5,000,000 capybaras","A Target Cart with a squeeky wheel","A black 2001 Impala"};

        System.out.println("Let's get you some wheels");
        System.out.println("Here are the options, respond with the corresponding number");
        System.out.println("1: Unicorn Flufficans of Death");
        System.out.println("2: The Great Dragon, Bahamut");
        System.out.println("3: On the back of 5,000,000 capybaras");
        System.out.println("4: A Target Cart with a squeeky wheel");
        System.out.println("5: A black 2001 Impala");

        int rideNumber = (scanner.nextInt())-1;
        String ride = rides[rideNumber];
        Thread.sleep(1000);

        System.out.println("Here we are, moments the expedition");
        Thread.sleep(1000);
        System.out.println(name+" you are taking a crew of 3 people on " + ride+ " through the galaxy, eating some awful "+snack+" on the way. Good luck");

        Thread.sleep(1000);
        System.out.println("Preparing to Launch");
        Thread.sleep(3000);
        System.out.println("All systems green");
        Thread.sleep(3000);
        System.out.println("Brace for liftoff");
        Thread.sleep(3000);
        System.out.println("100");
        Thread.sleep(3000);
        System.out.println("99");
        Thread.sleep(3000);
        System.out.println("98");
        Thread.sleep(3000);
        for(int i = 97; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Lift Off!");


}}
