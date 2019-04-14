import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInsideMap {

	public static void main(String args[]) {
		getList();
	}
	
	public static void getList() {
		
		Map<String, Integer> m= new HashMap<>();
		m.put("a", 1);
		m.put("b", 2);
		m.put("c", 3);
		m.put("d", 4);
		System.out.println("values of m ====> " + m);
		//List<String> myList = new ArrayList<>();
		//List<String> list = new ArrayList<String>(m.keySet());
		
	    /*List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(m.entrySet());
		System.out.println("values of list ====> " + list);
		
		Map<String, List<Entry<String, Integer>>> nm= new HashMap<>();
		nm.put("a", list);
		System.out.println("values of nm ====> " + nm);*/

		Map<String, Integer> m2= new HashMap<>();
		m2.put("ab", 12);
		m2.put("bc", 23);
		m2.put("cd", 34);
		m2.put("de", 45);
		System.out.println("values of m ====> " + m);
		List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
		list.add(m);
		
		list.add(m);
		list.add(m2);
		System.out.println("values of list ====> " + list);
		
		Map<String, List<Map<String, Integer>>> nm= new HashMap<>();
		nm.put("a", list);
		System.out.println("values of nm ====> " + nm);
		
		retrieveValue(nm);
	}
	
	public static void retrieveValue(Map<String, List<Map<String, Integer>>> nm) {

		System.out.println("1 " + nm.size());
		System.out.println("2 " + nm.entrySet());
		System.out.println("3 " + nm.get("a"));
		
		for(int i=0;i< nm.get("a").size();i++){
			System.out.println("5 " + nm.get("a").get(i));
			System.out.println("6 " + nm.get("a").get(i).get("b"));
		}
		
	}
}
