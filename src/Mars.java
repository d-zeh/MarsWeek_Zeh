public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Danny";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        for (int i = 0; i <2; i++) {
            meals = meals - (shipPopulation * 0.75);
        }
        System.out.println(meals);

        meals = meals * 1.5;

        shipPopulation += 5;

    String landingLocation = "The Ocean";
    if (landingLocation.equalsIgnoreCase("The Plain")) {
        System.out.println("Bbzzz Landing on the Plain");
    } else {
        System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
    }
    landing = landingCheck(8);
    GuessingGame guessing = new GuessingGame();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {

        for (int minute= 0; minute < minutesLeft; minute++) {

            if ((minute%2) == 0 && (minute%3) ==0) {
                System.out.println("Keep Center");
            } else if ((minute%3) ==0) {
                System.out.println("Left");
            } else if ((minute%2) == 0) {
                System.out.println("Right");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;


    }


}
