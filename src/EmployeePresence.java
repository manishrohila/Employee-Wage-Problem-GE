import java.util.Random;

public class EmployeePresence {
    public static void checkPresence() {
        Random random = new Random();
        boolean isPresent = random.nextBoolean();

        if (isPresent) {
            System.out.println("Employee is PRESENT.");
        } else {
            System.out.println("Employee is ABSENT.");
        }
    }
}
