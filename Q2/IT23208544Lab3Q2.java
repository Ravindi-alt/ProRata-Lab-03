
import java.util.Scanner;

public class IT23208544Lab3Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter overtime hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter overtime hourly rate: ");
        double otHourlyRate = input.nextDouble();

        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.println("Overtime amount: " + otAmount);
        System.out.println("Total monthly salary: " + totalSalary);

        input.close();
    }
}
