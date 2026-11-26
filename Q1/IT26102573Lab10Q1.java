import java.util.Scanner;
public class IT26102573Lab10Q1{
	
	public static char grade(int marks){
		if(marks >=75){
			return 'A';
		}
		else if(marks>= 60 && marks<75){
			return 'B';
		}
		else if(marks>= 50 && marks<60){
			return 'C';
		}
		else if(marks>= 40 && marks<50){
			return 'D';
		}
		else{
			return 'F';
		}
	}
	
	
	
	
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the mark(0-100) : ");
		int marks = input.nextInt();
		
		assert (marks>= 0 && marks <=100) : "Invalid marks";
		
		System.out.println("Marks is Validated");
		
		char grade1 = grade(marks);
		System.out.println("The grade of the entered mark is : " + grade1);
		
		assert grade(100)=='A' : "Invalid Grade Assigned" ;
		assert grade(75) == 'A' : "Invalid Grade Assigned" ; 
		assert grade(60)== 'B' : "Invalid Grade Assigned" ;
		assert grade(50)== 'C' : "Invalid Grade Assigned" ;
		assert grade(40)== 'D' : "Invalid Grade Assigned";
		assert grade(0)== 'F' : "Invalid Grade Assigned";
	}
}