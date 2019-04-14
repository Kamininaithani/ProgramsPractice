
public class ArrayExample {
	
	public static void main(String arg[]) {
		fun(1, 12, 33, 54, 75, 6, 7, 8, 9);
	}
	
	static void fun(int... x) {
		int total = 0;

		for (int i : x) {
			total = total + i;
		}
		System.out.println(total);
	}
}
