import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== STUDENT REPORT CARD =====");

        // Student details
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Semester: ");
        String semester = input.nextLine();

        // Enter subject scores
        System.out.print("Enter number of subjects: ");
        int subjectCount = input.nextInt();

        String[] subjects = new String[subjectCount];
        int[] scores = new int[subjectCount];
        input.nextLine(); // clear buffer

        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = input.nextLine();

            System.out.print("Enter score for " + subjects[i] + ": ");
            scores[i] = input.nextInt();
            input.nextLine(); // clear buffer
        }

        // Display Report Card
        System.out.println("\n===== REPORT CARD =====");
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("------------------------------");

        int total = 0;
        for (int i = 0; i < subjectCount; i++) {
            System.out.println(subjects[i] + " : " + scores[i]);
            total += scores[i];
        }

        double average = (double) total / subjectCount;

        System.out.println("------------------------------");
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        // Grade
        String grade;
        if (average >= 70) grade = "A";
        else if (average >= 60) grade = "B";
        else if (average >= 50) grade = "C";
        else if (average >= 45) grade = "D";
        else grade = "F";

        System.out.println("Overall Grade: " + grade);
        System.out.println("==============================");

        input.close();
    }
}

