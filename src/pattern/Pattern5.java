package pattern;

/**
 **
 ***
 **** 
 ***** 
 ***** 
 **** 
 ***
 * *
 * @author kamininaithani
 *
 */
public class Pattern5 {

	public static void main(String args[]) {
		int n = 4;
		int temp=4;
		for(int i=0;i<n*2;i++) {
			int no=i>n?--temp:i;
			for(int j=0;j<no;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
//		int l,k ,flag = 1,m=n;
//		for (int i = 0; i < n * 2; i++) {
//
//			for ( k = 0; k<i && k<n && flag==1;k++) {
//				System.out.print("*");
//				if (k == n) {
//					flag = 0;
//				}
//			}
//			if(flag==0) {
//				for (l = 0; l<n; l++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
	}
}
