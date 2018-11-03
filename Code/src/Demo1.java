import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5 Songs Store Unique + Sorted
		TreeSet<String> songs = new TreeSet<>();
		songs.add("Bang Bang");
		songs.add("It's my Life");
		songs.add("It's my Life");
		songs.add("Boom Boom");
		songs.add("Bang Bang");
		//songs.add(10);
		String name = "Amit";
		Object g = 10;  // Object g = new Integer(10); 
		g="Hello"; // g = new String("Hello");
		g = 90.20;
		g = true;
		System.out.println(songs);
		ArrayList t1 = new ArrayList();
		t1.add(10);
		t1.add("10");
		t1.add(true);
		int m = (int)t1.get(0);
		
		/*ArrayList<Integer> temp = new ArrayList<>();
		temp.add(30);   // temp[0]
		temp.add(40);
		temp.add(32);
		temp.add(28);
		temp.add(30);
		temp.add(27);
		temp.add(22);*/
		Map<String, Integer> tempMap;
		//tempMap.put("Delhi",30);
		//int t = tempMap.get("Delhi");
		
		
		

	}

}
