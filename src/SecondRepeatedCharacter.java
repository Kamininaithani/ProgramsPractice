import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecondRepeatedCharacter {

	public static void main(String[] arg) {
		String s = "highschopopppllllol";
		HashMap<String, Integer> map = new HashMap<>();
		map = SecondRepeatMethod(s,map);
		System.out.print(map);
	}
	public static HashMap<String, Integer> SecondRepeatMethod(String s,HashMap map){
		System.out.print(map);
		for (int i = 0; i < s.length(); i++) {
			try {
				map.put(s.charAt(i) + "", ((int) map.get(s.charAt(i) + "")) + 1);
				System.out.println("second repeated charactaer in the string \t" + s + "\t is \t" + s.charAt(i));
				break;
			} catch (Exception e) {
				map.put(s.charAt(i) + "", 1);
			}
		}
		return map;
	}
		/*
		for (int i = 0; i<s.length(); i++) {
			
           // if(1<(map.containsValue(map.)))) {
           // }
		}
		System.out.println("Size of map is:- " + map.size());
		System.out.print(map);
		if (map.containsValue(2)) {
			System.out.println("value for key is:- " + map);
		}

	*/
}
