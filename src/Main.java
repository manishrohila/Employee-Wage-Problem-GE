import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");

        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the Wage per Hour: ");
        int wagePerHour = scanner.nextInt();

        System.out.println("Enter Full Day Working Hours: ");
        int fullDayHour = scanner.nextInt();

        System.out.println("Enter Part-Time Working Hours: ");
        int partTimeHour = scanner.nextInt();

        System.out.println("Enter Total Working Days in a Month: ");
        int workingDaysPerMonth = scanner.nextInt();

        System.out.println("Enter Maximum Working Hours in a Month: ");
        int maxWorkingHours = scanner.nextInt();

        // Passing inputs to the calculator


        scanner.close();
    }
}