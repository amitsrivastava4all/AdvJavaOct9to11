import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list = new ArrayList<>();
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		synchronized(list) {
			list.add(30);
			list.add(40);
		}
		//System.out.println(list);
		for(Integer w : list) {
			System.out.println(w);
			list.add(w*10);
		}
		System.out.println("After Add "+list);
		//List<Integer> e = Collections.synchronizedList(list);
		//e.add(10);
		
		
		

	}

}
