import java.util.Random;
import java.util.Scanner;

public class Dice4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("What is your name?");
        String str = s.nextLine();
        System.out.println("Hello, " + str + "!");

        System.out.println("Rolling the dice...");
        int a = r.nextInt(6) + 1;
        int b = r.nextInt(6) + 1;
        System.out.println("Die 1: " + a);
        System.out.println("Die 2: " + b);
        System.out.println("Total value: " + (a + b));
        s.close();

        if ((a + b) >= 7) {
            System.out.println(str + " won");
        } else {
            System.out.println(str + " lost");
        }

    }
}
