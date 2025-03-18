import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int candyBar = 10;
        int gumBall = 3;
        int numCandyBars = 0;
        int numOfGumBalls = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter amount of coupons won: ");
        int coupons = keyboard.nextInt();

        numCandyBars = coupons/candyBar;
        numOfGumBalls = (coupons%candyBar) / gumBall;

        System.out.println(coupons + " can get you " + numCandyBars + " candy bars and " + numOfGumBalls + " gumballs.");
    }
}