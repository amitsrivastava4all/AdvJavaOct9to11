import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add("Hello");
		l.add(true);
		int x= (Integer)l.get(0);
		
		
		ArrayList<String> l2 = new ArrayList<>();
		//l2.add(10);
		l2.add("Hello");
		String e = l2.get(0);
		//l2.add(true);
		
		
		Map<String,Integer> map =new HashMap<>();
		//map = new TreeMap<>();
		map.put("delhi",22);
		map.put("delhi",21);
		map.put("mumbai",22);
		System.out.println(map.get("delhi"));
		/*Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String currentKey = itr.next();
			System.out.println("Key "+currentKey+" Value "+map.get(currentKey));
		}*/
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		System.out.println(map.size());
		//map.remove("delhi")
		

	}

}
