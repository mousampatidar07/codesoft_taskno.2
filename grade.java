import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects. Exiting...");
            return;
        }

        int totalMarks = 0;
        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " out of 100: ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100. Exiting...");
                return;
            }

            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        System.out.println();
        System.out.println("Subject-wise Marks:");

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + " marks: " + marks[i]);
        }

        System.out.println();
        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println();

        System.out.print("Your Grade: ");

        if (averagePercentage >= 80) {
            System.out.println("A+");
        } else if (averagePercentage >= 70) {
            System.out.println("A");
        } else if (averagePercentage >= 60) {
            System.out.println("B");
        } else if (averagePercentage >= 50) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        sc.close();
    }
}