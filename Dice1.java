import java.util.Random;

public class Dice1 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(6) + 1;
        int b = r.nextInt(6) + 1;
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + a);
        System.out.println("Die 2: " + b);
        System.out.println("Total value: " + (a + b));
    }
}
