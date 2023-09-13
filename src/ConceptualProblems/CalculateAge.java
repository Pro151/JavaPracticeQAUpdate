import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the date of birth in the format yyyy-MM-dd
        System.out.print("Enter your date of birth (yyyy-MM-dd): ");
        String dobStr = scanner.next();

        // Parse the user input into a LocalDate object
        LocalDate dob = LocalDate.parse(dobStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age using the Period class
        Period age = Period.between(dob, currentDate);

        // Display the calculated age
        System.out.println("Your age is: " + age.getYears() + " years");

        // Close the scanner
        scanner.close();
    }
}
