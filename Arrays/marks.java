package Arrays;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

      
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            physics[i] = inputMarks(sc, "Physics");
            chemistry[i] = inputMarks(sc, "Chemistry");
            maths[i] = inputMarks(sc, "Maths");

          
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

    
        System.out.println("\nStudent Report:");
        System.out.println("----------------------------------------------------");
        System.out.println("No\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%c\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }

        sc.close();
    }

   
    private static int inputMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter marks in " + subject + ": ");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid marks. Please enter a positive number between 0 and 100.");
            }
        }
        return marks;
    }
}
