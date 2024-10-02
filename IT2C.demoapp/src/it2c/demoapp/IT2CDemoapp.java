package it2c.demoapp;

import java.util.Scanner;

public class IT2CDemoapp {

    public void addCourse() {
        Scanner sc = new Scanner(System.in);
        Config conf = new Config();

        System.out.print("Course Name: ");
        String coursename = sc.next();

        System.out.print("Course Code: ");
        String coursecode = sc.next();

        System.out.print("Instructor: ");
        String instructor = sc.next();

        System.out.print("Credits: ");
        int credits = sc.nextInt();

        String sql = "INSERT INTO tbl_courses (course_name, course_code, instructor, credits) VALUES (?, ?, ?, ?)";

        
        conf.addRecord(sql, coursename, coursecode, instructor, credits);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;

        do {
            System.out.println("1. ADD COURSE");
            System.out.println("2. VIEW COURSES");
            System.out.println("3. UPDATE COURSE");
            System.out.println("4. DELETE COURSE");
            System.out.println("5. EXIT");

            System.out.print("Enter Action: ");
            int action = sc.nextInt();

            IT2CDemoapp app = new IT2CDemoapp();

            switch (action) {
                case 1:
                    app.addCourse();
                    break;
               
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid action. Please try again.");
            }

            System.out.print("Continue? (yes/no): ");
            response = sc.next();

        } while (response.equalsIgnoreCase("yes"));

        System.out.println("Thank You, See you again!");
    }
}
