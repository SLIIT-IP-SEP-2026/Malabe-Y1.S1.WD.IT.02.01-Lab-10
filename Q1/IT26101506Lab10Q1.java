import java.utilo.Scanner;
public class IT26101506Lab10Q1 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter the mark (0-100): ");
		int mark = input.nextInt();
		
		assert (mark >= 0 && mark <= 100) : "Invalid mark";
		
		char grade;
		
		if(mark >= 75){
			grade = 'A';
		}
		else if (mark >= 60) {
			grade = 'B';
		}
		else if (mark >= 50){
			grade = 'C';
		}
		else if (mark >= 40){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		
		assert (mark >= 75 && grade == 'A')||
		       (mark >= 60 && mark < 75 && grade == 'B') ||
			   (mark >= 50 && mark < 60 && grade == 'B') ||
			   (mark >= 40 && mark < 50 && grade == 'B') ||
			   (mark < 40 && grade == 'F') : "Incorrect Grade Assigned";
			   
			   System.out.println();
			   System.out.println("Mark is Validated");
			   System.out.println("The grade for the Entered Mark is:  " + grade);
	}
}
			   