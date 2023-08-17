import java.util.InputMismatchException;
import java.util.Scanner;

public class Checker {
    public int goodNumber(int i) {
        Scanner scanner = new Scanner(System.in);
        boolean goodToGo = false;

        while (!goodToGo) {
            try {
                if (i > 0 && i < 101) {
                    goodToGo = true;

                } else {
                    System.out.println("ENTER A NUMBER BETWEEN AND BETWIX 1 AND 100, IMBECILE! TRY AGAIN");
                    i = scanner.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("WRONG. THAT'S NOT EVEN A NUMBER, TRY AGAIN");
                scanner.nextLine();
                i = scanner.nextInt();
            }
        }
        return i;
    }
}
