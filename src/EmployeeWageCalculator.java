import java.util.Random;

public class EmployeeWageCalculator {
    // Instance Variables
    private final int wagePerHour;
    private final int fullDayHour;
    private final int partTimeHour;
    private final int workingDaysPerMonth;
    private final int maxWorkingHours;

    // Constructor to initialize variables
    public EmployeeWageCalculator(int wagePerHour, int fullDayHour, int partTimeHour, int workingDaysPerMonth, int maxWorkingHours) {
        this.wagePerHour = wagePerHour;
        this.fullDayHour = fullDayHour;
        this.partTimeHour = partTimeHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void calculateTotalWages() {
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;

        while (totalWorkingDays < workingDaysPerMonth && totalWorkingHours < maxWorkingHours) {
            totalWorkingDays++;
            int workHours = getWorkHours();

            totalWorkingHours += workHours;
            if (totalWorkingHours > maxWorkingHours) {
                totalWorkingHours -= workHours; // Rollback excess hours
                break;
            }

            int dailyWage = workHours * wagePerHour;
            totalWage += dailyWage;

            System.out.println("Day " + totalWorkingDays + ": Work Hours = " + workHours + ", Daily Wage = " + dailyWage);
        }

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: " + totalWage);
    }

    private int getWorkHours() {
        Random random = new Random();
        int attendance = random.nextInt(3); // 0, 1, 2
        switch (attendance) {
            case 0:
                System.out.println("Employee is Absent");
                return 0;
            case 1:
                System.out.println("Employee is Present (Full Time)");
                return fullDayHour;
            case 2:
                System.out.println("Employee is Present (Part Time)");
                return partTimeHour;
            default:
                return 0;
        }
    }
}
