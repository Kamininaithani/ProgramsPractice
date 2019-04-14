import java.util.HashMap;
import java.util.Map;

public class CountlettersInString {
    public static void main(String[] args) {

        int s[] = {1,1,1,2,2,3,3,3,4,4,4,5,3,21,1,3,56,};
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.print(map);
        for (int i = 0; i < s.length; i++) {
            try {
                map.put(s[i], ((int) map.get(s[i]) + 1));
            } catch (Exception e) {
                map.put(s[i], 1);
            }
        }
        System.out.println("shoes sizes " + s + "  and count \t" + map);
        int count=0;
        for(HashMap.Entry<Integer,Integer> i:map.entrySet()){
            System.out.println("Key = " + i.getKey() + ", Value = " + i.getValue()+", Pairs = "+(i.getValue()/2));
            count=count+(i.getValue()/2);
        }
        System.out.println("Total shoes pair " + count);

       /* Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
*/
    }

    public static void characterCount() {
        String s = "qqqeeerrrdddssshfjf";
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.print(map);
        for (int i = 0; i < s.length(); i++) {
            try {
                map.put(s.charAt(i), ((int) map.get(s.charAt(i))) + 1);
            } catch (Exception e) {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println("character count in " + s + "  string \n" + map);

    }


/*	{	int[] charachterfrequency = new int[26];

		String name = "kamini is very intelligent girl";
		String[] word = name.split(" ");
		String namewithoutspace = name.replace(" ", "");

		// here 97 minus is you want to get the value in range of 0 to 25 (a to z)(97 to 123)
		for (int i = 0; i < namewithoutspace.length(); i++) {
			int res = (int) namewithoutspace.charAt(i) - 97;
			charachterfrequency[res]++;
		}
		// print array element
		for (int j = 0; j < charachterfrequency.length; j++) {
			if (charachterfrequency[j] != 0) {
				System.out.println(((char) (j + 97)) + " occours " + charachterfrequency[j] + " times");
			}

		}
	}
	*/
}
