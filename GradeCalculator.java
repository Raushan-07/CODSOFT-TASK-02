import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {
        
        System.out.print("               -Instruction-\n ~ Each Subject Contain maximum 100 marks ~ \n");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total number of subjects: ");
            int NumOfSubjects = sc.nextInt();
            
            double totalMarks = 0;
            
            for (int i = 0; i < NumOfSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ":  ");
                double marks = sc.nextDouble();
                totalMarks += marks;
            }
           
            double averagePercentage = (totalMarks / (NumOfSubjects * 100)) * 100;
            
            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else if (averagePercentage >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            System.out.println("\n        ----- YOUR RESULT -----");
            System.out.printf("~ Total Marks Obtained: %.1f out of %d%n", totalMarks, NumOfSubjects * 100);
            System.out.printf("~ Average Percentage: %.2f", averagePercentage);
            System.out.println("~ Grade: " +grade+"");
            System.out.println("\n---< I hope you're doing well in Next EXAM >---\n");
        }
    }
}
