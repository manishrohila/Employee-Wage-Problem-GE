import java.util.Random;

public class PartTimeWageCalculator {
    private static final int WAGE_PER_HOUR = 20;
    private static final int PART_TIME_HOURS = 4;

    public static void calculatePartTimeWage() {
        Random random = new Random();
        boolean isPartTime = random.nextBoolean();

        if (isPartTime) {
            int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOURS;
            System.out.println("Employee is PART-TIME.");
            System.out.println("Part-Time Wage: $" + partTimeWage);
        } else {
            System.out.println("Employee is FULL-TIME.");
            System.out.println("Daily Wage: $" + (WAGE_PER_HOUR * 8));
        }
    }
}
