
public class SpiralNumberIn2D {

	public static void main(String args[]) {

		int n = 5;
		printPattarnStar(n);
	}

	
//	00 01 02 03
//	10 11 12 13
//	20 21 22 23
//	30 31 32 33
	static void printPattarnStar(int n) {
		int a[][]=new int[n][n];
		int n1=0, n2=n;
		int k=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i<=j){
					if(n2!=j) {
						a[i][j] = k++;
					}else{
						a[i][j] = k++;
						n2--;
					}
				}else if(i>j) {
					if(n1!=i)
					a[i][j] = k++;

					a[i][j] = k++;
				}
					
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}