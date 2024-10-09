
package inajada_2c;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseManager {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Enrollment> enrollments;

    public CourseManager() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.enrollments = new ArrayList<>();
    }

   
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void updateStudent(int id) {
        Scanner scanner = new Scanner(System.in);
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new email: ");
                student.setEmail(scanner.nextLine());
                System.out.print("Enter new program: ");
                student.setProgram(scanner.nextLine());
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student deleted successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

   
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added successfully.");
    }

    public void updateCourse(int id) {
        Scanner scanner = new Scanner(System.in);
        for (Course course : courses) {
            if (course.getId() == id) {
                System.out.print("Enter new name: ");
                course.setName(scanner.nextLine());
                System.out.print("Enter new credits: ");
                course.setCredits(scanner.nextInt());
                System.out.println("Course updated successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    public void deleteCourse(int id) {
        courses.removeIf(course -> course.getId() == id);
        System.out.println("Course deleted successfully.");
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }

  
    public void enrollStudent(int studentId, int courseId) {
        enrollments.add(new Enrollment(studentId, courseId));
        System.out.println("Student enrolled successfully.");
    }

    public void viewEnrollments() {
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
        } else {
            for (Enrollment enrollment : enrollments) {
                System.out.println(enrollment);
            }
        }
    }
}