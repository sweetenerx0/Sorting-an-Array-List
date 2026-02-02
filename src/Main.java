import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println("Let's create and sort your student names.");
		Scanner scnr = new Scanner(System.in);
		ArrayList<Student> list  = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			System.out.println(">Enter your student's name: ");
			String student_name = scnr.nextLine();
			System.out.println(">Enter " + student_name +"'s address: ");
			String student_address = scnr.nextLine();
			System.out.println(">Enter " + student_name +"'s roll number: ");
			int student_rollno = scnr.nextInt();
			Student new_student = new Student(student_rollno, student_name, student_address);
			System.out.println(">Successfully added " + student_rollno + " " + student_name + " " + student_address+ ".");
		}
		
	}
	
	
}
