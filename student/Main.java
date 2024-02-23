package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**Enter student details**");
        
        try {
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Course: ");
            String course = scanner.nextLine();

            Student student = new Student(rollNo, name, age, course);
            System.out.println("Student created: " + student.getName());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Could not create student: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Could not create student: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }
}

