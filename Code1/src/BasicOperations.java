import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class BasicOperations {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(100);
		// add
		list.add("amit");  // add in last
		list.add("ram");
		System.out.println(list.get(0));
		System.out.println(list);
		list.add(0,"shyam");
		System.out.println("After Add "+list);
		ArrayList<String> names = new ArrayList<>();
		names.add("mike");
		names.add("tom");
		names.add("amit");
		list.addAll(names);
		System.out.println(list);
		// Traverse
		// 1st way
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		// 2nd way
//		System.out.println("***************************");
//		Iterator<String> i = list.iterator(); //1.4
//		while(i.hasNext()){
//			String value = i.next();
//			//i.remove();
//			System.out.println("Value is "+value);
//		}
		// 3rd way
		/*ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()){
			String value = listIterator.next();
			System.out.println("Value is "+value);
		}
		System.out.println("###############################");
		while(listIterator.hasPrevious()){
			String value = listIterator.previous();
			System.out.println("Value is "+value);
		}*/
		// 4th Way 1.5 Enhance For Loop
		/*for(String value:list){
			System.out.println(value);
		}*/
		// 5th Way 1.8
		list.forEach((str)->System.out.println("Value is "+str));
		// Update
		list.set(0, "TIM");
		System.out.println(list);
		
		// remove
		list.remove(0);  //index wise
		list.remove("ram");  // value wise
		System.out.println(list);
		
		// Search
		boolean result = list.contains("amit");
		System.out.println(result?"Found":"Not found");
		int index = list.indexOf("amit");
		System.out.println(index>=0?"Found Index":"Not Found INdex");
		int lastIndex = list.lastIndexOf("amit");
		System.out.println(index +" "+lastIndex);
		
		// Sort
		Collections.sort(list);
		System.out.println("After Sort "+list);
		
	}

}
