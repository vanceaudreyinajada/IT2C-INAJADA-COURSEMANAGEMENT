
package inajada_2c;

import java.util.Scanner;

public class Inajada_2C {

 
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
           
            System.out.println("\nMain Menu");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Enrollment Management");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int sectionChoice = scanner.nextInt();
            scanner.nextLine();  

            switch (sectionChoice) {
                case 1:
                    
                    while (true) {
                        System.out.println("\nStudent Management");
                        System.out.println("1. Add Student");
                        System.out.println("2. Update Student");
                        System.out.println("3. Delete Student");
                        System.out.println("4. View All Students");
                        System.out.println("5. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        int choice = scanner.nextInt();
                        scanner.nextLine();  

                        switch (choice) {
                            case 1:
                                System.out.print("Enter student ID: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();  
                                System.out.print("Enter student name: ");
                                String name = scanner.nextLine();
                                System.out.print("Enter email: ");
                                String email = scanner.nextLine();
                                System.out.print("Enter program: ");
                                String program = scanner.nextLine();

                                Student newStudent = new Student(id, name, email, program);
                                courseManager.addStudent(newStudent);
                                break;

                            case 2:
                                System.out.print("Enter the ID of the student to update: ");
                                int updateId = scanner.nextInt();
                                courseManager.updateStudent(updateId);
                                break;

                            case 3:
                                System.out.print("Enter the ID of the student to delete: ");
                                int deleteId = scanner.nextInt();
                                courseManager.deleteStudent(deleteId);
                                break;

                            case 4:
                                courseManager.viewStudents();
                                break;

                            case 5:
                                System.out.println("Returning to Main Menu...");
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }

                        if (choice == 5) {
                            break;  
                        }
                    }
                    break;

                case 2:
                    
                    while (true) {
                        System.out.println("\nCourse Management");
                        System.out.println("1. Add Course");
                        System.out.println("2. Update Course");
                        System.out.println("3. Delete Course");
                        System.out.println("4. View All Courses");
                        System.out.println("5. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        int choice = scanner.nextInt();
                        scanner.nextLine();  

                        switch (choice) {
                            case 1
