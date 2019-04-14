package recursion;

public class Fibonacci {

	public static void main(String args[]) {
		long no = 10;
		fibbonacci(no);

		System.out.println((no>2)?recursionFibbonacci(no):"0 1 "+recursionFibbonacci(no));
	}
	public static void fibbonacci(long no){
		long i=0, j=1,c;
		while(i<no){
			System.out.print(i +" ");
			c=i+j;
			i=j;
			j=c;
		}
	}
	public static int recursionFibbonacci(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return recursionFibbonacci(n - 1) + recursionFibbonacci(n - 2);
		}
	}
}
