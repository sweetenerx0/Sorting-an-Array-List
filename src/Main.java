import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println(">> SORTING STUDENT ARRAY LIST <<");
		System.out.println();
		Scanner scnr = new Scanner(System.in);
		ArrayList<Student> list  = new ArrayList<Student>();
		
		//if professor wants to quickly test or if he wants to try input codes
		while (true) {
		    System.out.println("PREFILLED LIST - TYPE \"1\" OR FILL YOURSELF - TYPE \"2\"");
		    try {
		        int fill_response = scnr.nextInt();
		        scnr.nextLine(); 

		        if (fill_response == 1) {
		            list.add(new Student(8, "Bowser", "Bowser Castle Lane"));
		            list.add(new Student(3, "Peach", "Mushroom Kingdom Ct"));
		            list.add(new Student(5, "Waluigi", "Peach Gardens Cir"));
		            list.add(new Student(1, "Goomba", "Goomba Village Dr"));
		            list.add(new Student(7, "Wario", "Diamond City Ave"));
		            list.add(new Student(10, "Luigi", "Haunted Mansion Rd"));
		            list.add(new Student(2, "Daisy", "Sarasaland Cir"));
		            list.add(new Student(9, "Mario", "Mushroom Kingdom Ct"));
		            list.add(new Student(6, "Yoshi", "Yoshi's Island Dr"));
		            list.add(new Student(4, "King Boo", "Boo Castle Ct"));	
		            break;
		        } 
		        else if (fill_response == 2){
		        	System.out.println("**for the sake of testing, input loop set to 3 names**");
		            for (int i = 0; i < 3; i++) {
		                System.out.println(">> ENTER YOUR STUDENT'S NAME: ");
		                String student_name = scnr.nextLine();
		                System.out.println(">> ENTER " + student_name +"'S ADDRESS: ");
		                String student_address = scnr.nextLine();
		                System.out.println(">> ENTER " + student_name +"'S ROLL NUMBER: ");
		                int student_rollno = scnr.nextInt();
		                scnr.nextLine();  
		                list.add(new Student(student_rollno, student_name, student_address));
		            }
		            break;
		        }
		    } catch (Exception e) {
		        System.out.println(">> TRY AGAIN.");
		        scnr.nextLine();  // clear input
		    }
		}
		
		while (true){
			System.out.println(">> SORT BY ROLL NUMBER - TYPE \"ROLL\" OR SORT BY NAME - TYPE \"NAME\"");
			try {
				 String order_response = scnr.nextLine().toLowerCase();
				
				if (order_response.equals("roll")) {
					Sorting.sort(list,  new SortRollNo());
					System.out.println(">> SORTED BY ROLL NUMBER: ");
					System.out.println();
					break;
				}
				else if (order_response.equals("name")) {
					Sorting.sort(list,  new SortName());
					System.out.println(">> SORTED BY ROLL NAME: ");
					System.out.println();
					break;
				}
				else {
					throw new Exception();
				}
			}
			catch(Exception e) {
				System.out.println(">> TRY AGAIN.");
			}
			}
		for (Student s : list) {
		    System.out.println(s.getrollno() + " " +s.getname().toUpperCase() + " " + s.getaddress());
		}
		}
	}
	
