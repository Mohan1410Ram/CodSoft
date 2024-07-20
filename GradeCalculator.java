import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] marks = new double[numSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        double averagePercentage = totalMarks / numSubjects;
        char grade = calculateGrade(averagePercentage);

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
