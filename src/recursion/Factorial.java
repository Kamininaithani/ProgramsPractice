package recursion;

public class Factorial {

	public static void main(String args[]) {
		int no=5;
		System.out.println(factRecursion(no));
		System.out.println(fact(no));
	}
	public static int factRecursion(int n) {
		if(n==0||n==1) 
			return 1;
		else
			return n*factRecursion(n-1);
	}
	public static int fact(int n) {
		int val=1;
		for(int i=1;i<=n;i++) {
			val= val*i;
		}
		return val;
	}
}
