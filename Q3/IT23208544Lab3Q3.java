
import java.util.Scanner;

public class IT23208544Lab3Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = input.nextInt();

        int notes5000 = amount / 5000;
        amount %= 5000;

        int notes1000 = amount / 1000;
        amount %= 1000;

        int notes500 = amount / 500;
        amount %= 500;

        int notes100 = amount / 100;
        amount %= 100;

        int notes50 = amount / 50;
        amount %= 50;

        int notes20 = amount / 20;
        amount %= 20;

        int coins10 = amount / 10;
        amount %= 10;

        int coins5 = amount / 5;
        amount %= 5;

        int coins2 = amount / 2;
        amount %= 2;

        int coins1 = amount;

        System.out.println("5000 notes: " + notes5000);
        System.out.println("1000 notes: " + notes1000);
        System.out.println("500 notes: " + notes500);
        System.out.println("100 notes: " + notes100);
        System.out.println("50 notes: " + notes50);
        System.out.println("20 notes: " + notes20);
        System.out.println("10 coins: " + coins10);
        System.out.println("5 coins: " + coins5);
        System.out.println("2 coins: " + coins2);
        System.out.println("1 coins: " + coins1);

        input.close();
    }
}
