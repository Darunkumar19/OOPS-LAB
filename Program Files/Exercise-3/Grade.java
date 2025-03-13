import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter student's marks (0-100): ");
        int marks=input.nextInt();

        char grade;
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        }
        else if (marks >= 80) {
            grade = 'B';
        }
        else if (marks >= 70) {
            grade = 'C';
        }
        else if (marks >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("Student's grade is " + grade);
    }
}