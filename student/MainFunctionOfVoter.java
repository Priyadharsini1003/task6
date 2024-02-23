package student;
import java.util.Scanner;

public class MainFunctionOfVoter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter voter details");

        try {
            System.out.print("Voter ID: ");
            String voterId = scanner.next();

            System.out.print("Name: ");
            scanner.nextLine(); 
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            Voter voter = new Voter(voterId, name, age);
            System.out.println("Voter created: " + voter.getName());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
