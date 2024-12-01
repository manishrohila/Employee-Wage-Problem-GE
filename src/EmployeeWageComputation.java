import java.util.Scanner;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        // Display Welcome Message
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Employee Presence");
            System.out.println("2. Calculate Daily Wage");
            System.out.println("3. Calculate Part-Time Wage");
            System.out.println("4. Calculate Wage using Switch Case");
            System.out.println("5. Calculate Monthly Wage");
            System.out.println("6. Calculate Wages with Conditions");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    EmployeePresence.checkPresence();
                    break;
                case 2:
                    WageCalculator.calculateDailyWage();
                    break;
                case 3:
                    PartTimeWageCalculator.calculatePartTimeWage();
                    break;
                case 4:
                    SwitchCaseWage.calculateWage();
                    break;
                case 5:
                    MonthlyWageCalculator.calculateMonthlyWage();
                    break;
                case 6:
                    ConditionWageCalculator.calculateConditionWage();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        scanner.close();
    }
}
