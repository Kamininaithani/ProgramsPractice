import java.util.ArrayList;

public class MagicNumber {

	public static void main(String args[]) {
		int no=1, no2=10;
		ArrayList<Integer> result=primeNumberSeries(no,no2);
		System.out.print("\n\nArray list of prime no:"+result);		

		int start=10, end=20;
		
		
		
		
		
		
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

}
