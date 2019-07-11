import java.util.Random;
import java.util.Scanner;

public class Dice5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("What is your name?");
        String str = s.nextLine();
        System.out.println("Hello, " + str + "!");

        System.out.println("Let's fight to your friends!");
        int a = r.nextInt(6) + 1;
        int b = r.nextInt(6) + 1;
        System.out.println("Your friend value is " + (a + b));

        System.out.println("Rolling the dice...");
        int c = r.nextInt(6) + 1;
        int d = r.nextInt(6) + 1;
        System.out.println("Die 1: " + c);
        System.out.println("Die 2: " + d);
        System.out.println("Total value: " + (c + d));
        s.close();

        if ((c + d) > (a + b)) {
            System.out.println(str + " won!");
        } else if ((c + d) < (a + b)) {
            System.out.println(str + " lost!");
        } else {
            System.out.println("even...");
        }

    }
}
