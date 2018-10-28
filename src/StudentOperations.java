import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<>();
		while(true){
		System.out.println("1. Add ");
		System.out.println("2. Display");
		System.out.println("3. Search");
		System.out.println("0. Exit");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Choice");
		int choice = s.nextInt();
		if(choice == 0){
			break;
		}
		if(choice == 1){
			Student student = new Student(1001,"Ram","C");
			studentList.add(student);
			
		}
		if(choice ==2){
			System.out.println(studentList);
		}
		if(choice ==3){
			boolean isFound = studentList.contains("Ram");
			System.out.println(isFound?"Found ":"Not Found");
		}
		}
		
		

	}

}
