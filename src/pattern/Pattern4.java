package pattern;

/**
 * 
 *   1 
 *  232 
 * 34543
 * 
 * @author kamininaithani
 *
 */





public class Pattern4 {

	public static void main(String args[]) {
		int c=1,n = 4;
		int e=n*(n+1);
		for (int lineNum = 0; lineNum <= n; lineNum++) {
			for (int m = 1; m<=lineNum; m++) {
				System.out.print("  "); //space
			}
			for (int m = n - lineNum; m > 0; m--) {
				System.out.print(" "+ c++); //left triangle
			}
			for (int m = n - lineNum; m > 0; m--) {
				System.out.print(" "+ (e-m+1));  //right triangle
			}
			e=e-n+lineNum;
			System.out.println();
		}
	}
}