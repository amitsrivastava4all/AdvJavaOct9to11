import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SortByCourse implements Comparator<Student>{
	@Override
	public int compare(Student first, Student second) {
		return first.getCourse().compareToIgnoreCase(second.getCourse());
	}
}

public class StudentOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		while(true){
		System.out.println("1. Add ");
		System.out.println("2. Display");
		System.out.println("3. Search");
		System.out.println("4. Delete");
		System.out.println("5. Update");
		System.out.println("6. Sort ");
		System.out.println("7. Count");
		System.out.println("8. Sum");
		System.out.println("0. Exit");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Choice");
		int choice = s.nextInt();
		if(choice == 0){
			break;
		}
		if(choice == 1){
			System.out.println("Enter the Id ");
			int id = scanner.nextInt();
			System.out.println("Enter the Name ");
			String name = scanner.next();
			System.out.println("Enter the course");
			String course = scanner.next();
			System.out.println("Enter the fees");
			double fees = scanner.nextDouble();
			
			
			Student student = new Student(id,name,course);
			student.setFees(fees);
			studentList.add(student);
			
		}
		if(choice ==2){
			System.out.println(studentList);
		}
		if(choice ==3){
			System.out.println("Enter the Id ");
			int id = scanner.nextInt();
			System.out.println("Enter the Name to Search");
			String name = scanner.next();
			System.out.println("Enter the Course");
			String course = scanner.next();
			Student search = new Student(id, name, course);
			boolean isFound = studentList.contains(search);
			System.out.println(isFound?"Found ":"Not Found");
		}
		if(choice ==4){
			System.out.println("Enter the Id ");
			int id = scanner.nextInt();
			System.out.println("Enter the Name to Search");
			String name = scanner.next();
			System.out.println("Enter the Course");
			String course = scanner.next();
			Student search = new Student(id, name, course);
			int index = studentList.indexOf(search);
			if(index>=0){
				studentList.remove(index);
				System.out.println("After Delete "+studentList);
			}
			else{
				System.out.println("No Record Found");
			}
		}
		if(choice ==5){
			System.out.println("Enter the Id ");
			int id = scanner.nextInt();
			System.out.println("Enter the Name to Search");
			String name = scanner.next();
			System.out.println("Enter the Course");
			String course = scanner.next();
			Student search = new Student(id, name, course);
			int index = studentList.indexOf(search);
			if(index>=0){
				System.out.println("Put New Record to Update");
				System.out.println("Enter the Id ");
				 id = scanner.nextInt();
				System.out.println("Enter the Name to Search");
				 name = scanner.next();
				System.out.println("Enter the Course");
				 course = scanner.next();
				 search = new Student(id, name, course);
				studentList.set(index,search);
				System.out.println("After Update "+studentList);
			}
			else{
				System.out.println("No Record Found");
			}
		}
		if(choice ==6){
			//Collections.sort(studentList);  // Comparable
			//Collections.sort(studentList, new SortByCourse()); // Comparator with Seperate Class
//			Collections.sort(studentList, new Comparator<Student>() { // Comparator with Anobymous Class
//				public int compare(Student first, Student second) {
//					return first.getCourse().compareToIgnoreCase(second.getCourse());
//				}
//			});
			// Comparator with Lambda
			Collections.sort(studentList,
					(first,second)->
			first.getCourse().compareToIgnoreCase(second.getCourse()));
			
			// Sort By Id
			Collections.sort(studentList, 
					(first,second)->((Integer)first.getId()).compareTo(second.getId()));
			System.out.println("After Sort "+studentList);
		}
		if(choice ==7) {
			long count  = studentList.stream().
			filter(studentObject->studentObject.getCourse().equalsIgnoreCase("java"))
			.mapToInt(studentObj->studentObj.getId()).count();
			System.out.println("Count is "+count);
			/*int counter = 0;
			for(Student student : studentList) {
				if(student.getCourse().equalsIgnoreCase("java")) {
					counter++;
				}
			}
			System.out.println("Total Student in Java Course "+counter);
		*/
			// select count(*) from student where course='java'
		}
		if(choice ==8) {
			double sum = studentList.parallelStream().
			filter(studentObject->studentObject.getFees()>1000)
			.mapToDouble(studentObject->studentObject.getFees()).sum();
			System.out.println("Sum is "+sum);
		}
		}
		
		

	}

}
