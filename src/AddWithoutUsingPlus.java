/**
 * add to numbers without using "+"
 * 
 * @author kamininaithani
 *
 */
public class AddWithoutUsingPlus {

		static int a = 5000000;
		static int b = 60;

		public static void main(String[] args) {
			System.out.println(recsum(b));
		}

		public static int recsum(int y) {
			if ((y > 0)) {
				a++;
				recsum(y - 1);
			}

			else if (y < 0) {
				a--;
				recsum(y + 1);
			}
			return a;
		}


	/*
	public static void main(String args[]) {
		int temp, n = -65, n2 = -75;
		if (n <= n2) {
			temp = n;
			n = n2;
			n2 = temp;
		}
		System.out.println(fun(n, n2));
	}

	public static int fun(int n, int n2) {

		if (n < 0) {
			return fun(++n, --n2);
		} else if (n != 0) {
			return fun(--n, ++n2);
		} else if(n==0)
			return n2;
		else 
			return n2;
	}*/
}
