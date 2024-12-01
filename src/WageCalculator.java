import java.util.Random;

public class WageCalculator {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;

    public static void calculateDailyWage() {
        Random random = new Random();
        boolean isPresent = random.nextBoolean();

        if (isPresent) {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is PRESENT.");
            System.out.println("Daily Wage: $" + dailyWage);
        } else {
            System.out.println("Employee is ABSENT.");
            System.out.println("Daily Wage: $0");
        }
    }
}
