package student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    private static Map<String, Integer> studentGrades = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
        int choice;
        do {
            System.out.println("1. Add new student");
            System.out.println("2. Remove a student");
            System.out.println("3. Display student's grade by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    displayGrade();
                    break;
                case 4:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

 
    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); 
        studentGrades.put(name, grade);
        System.out.println("Student added successfully.");
    }

    private static void removeStudent() {
        System.out.print("Enter student name to remove: ");
        String name = scanner.nextLine();
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void displayGrade() {
        System.out.print("Enter student name to display grade: ");
        String name = scanner.nextLine();
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s grade is: " + studentGrades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }
}

