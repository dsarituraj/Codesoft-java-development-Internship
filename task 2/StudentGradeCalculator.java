import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects: ");

        int numSubjects = sc.nextInt();
        int totalMarks = 0;

        System.out.println("Enter the marks obtained in " + numSubjects + " subjects respectively: ");
        for (int i = 0; i < numSubjects; i++) {
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else if (averagePercentage >= 40) {
            grade = "E";
        } else {
            grade = "Fail (F)";
        }

        System.out.println("Total Marks = " + totalMarks);
        System.out.printf("Average Percentage = %.2f%%\n", averagePercentage);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
