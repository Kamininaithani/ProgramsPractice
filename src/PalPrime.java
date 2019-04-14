import java.util.ArrayList;

public class PalPrime {

	public static void main(String args[]) {
		int no=5;
		//System.out.format("",checkIfNumberIsPrime(no));
		ArrayList<Integer> result=primeNumberSeries(1,1000);
//		int len=result.size();
//		int arr[]=new int[len];
//		for(int i=0;i<result.size();i++) {
//			arr[i]=result.get(i);
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+ " ");
//		}
		System.out.print("\n\nArray list of prime no:"+result);
		
		
		// palindrome
		ArrayList<Integer> result2=palindromeNumberSeries(1,1000);
		System.out.print("\n\nArray list of palindrome no:"+result2);

		//PalPrime

		ArrayList<Integer> result3=palPrimeNumberSeries(1,1000);
		System.out.print("\n\nArray list of palprime no:"+result3);


	}
	public static ArrayList<Integer> primeNumberSeries(int n, int n2) {
		ArrayList<Integer> p= new ArrayList<>();
		for(int j=n;j<=n2;j++) {
			if(checkIfNumberIsPrime(j)) {
				p.add(j);
			}
		}
		return p;
		
	}
	public static boolean checkIfNumberIsPrime(int n) {
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(n==1) {
			return false;
		}else {
			if(flag==0) {
				return true;
			}else {
				return false;
			}
		}	
	}

	public static ArrayList<Integer> palindromeNumberSeries(int n, int n2) {
		ArrayList<Integer> p= new ArrayList<>();
		for(int j=n;j<=n2;j++) {
			if(checkIfNumberIsPalendrome(j)) {
				p.add(j);
			}
		}
		return p;
	}
	public static boolean checkIfNumberIsPalendrome(int n){
		int no=n, a,rev=0;
		while(no!=0){
			a= no%10;
			rev=rev*10+a;
			no=no/10;
		}
		if(n==rev){
			return true;
		}else
			return false;
	}
	public static ArrayList<Integer> palPrimeNumberSeries(int n, int n2) {
		ArrayList<Integer> p= new ArrayList<>();
		for(int j=n;j<=n2;j++) {
			if(checkIfNumberIsPalendrome(j) && checkIfNumberIsPrime(j)) {
				p.add(j);
			}
		}
		return p;
	}
}
