import java.util.Scanner;

public class IT26102744Lab10Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // check the mark is between 0 and 100
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println();
        System.out.println("Mark is Validated");

        // find the grade
        char grade;

        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // check the grade matches the mark
        assert (grade == 'A' && mark >= 75)
            || (grade == 'B' && mark >= 60 && mark <= 74)
            || (grade == 'C' && mark >= 50 && mark <= 59)
            || (grade == 'D' && mark >= 40 && mark <= 49)
            || (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        input.close();
    }
}
