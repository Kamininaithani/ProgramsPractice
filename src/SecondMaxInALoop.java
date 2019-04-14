public class SecondMaxInALoop {

	static int secondMax(int[] arr) {
		int secondMaxNumber = 0, max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				if(max==arr[i]){
					continue;
				}
				secondMaxNumber=max;
				max = arr[i];
				
			}
			else if(arr[i]>secondMaxNumber){
				secondMaxNumber = arr[i];
			}
		}
		// System.out.println(secondMaxNumber);
		return secondMaxNumber;
	}

	public static void main(String[] args) {
		int[] arr = { 7,47,47,47,47};
		System.out.println("Second Max:" + secondMax(arr));
	}

}