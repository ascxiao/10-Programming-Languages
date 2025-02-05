
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            //Declare variables
            String name;
            float score1, score2, score3;

            System.out.println("Greetings, this is an average calculator in Java for three test scores.");
            System.out.println("Please enter your name and three test scores.");
            System.out.println("-------------------------------------------");

            // Declare variables and input
            System.out.print("Name: ");
            name = scanner.nextLine();

            System.out.println("\nHello, " + name + ", enter your test scores");
            System.out.print("Score 1: ");
            score1 = scanner.nextFloat();
            System.out.print("Score 2: ");
            score2 = scanner.nextFloat();
            System.out.print("Score 3: ");
            score3 = scanner.nextFloat();
            System.out.println("-------------------------------------------");

            // Process
            float average = (score1 + score2 + score3) / 3;

            // Output
            System.out.printf("%s, your average score is: %.2f%n", name, average);
            System.out.println("-------------------------------------------");

        }
    }
}
