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
public class Pattern3 {

	public static void main(String args[]) {
		int l, n = 5;
		for (int i = 0; i < n; i++) {
			l = i + 1;

			for (int k = n - i; k > 0; k--)
				System.out.print("  ");
			for (int j = 1; j <= ((i * 2) + 1); j++) {
				if (j <= ((i * 2) + 1) / 2) {
					System.out.print(" " + l++);
				} else
					System.out.print(" " + l--);
			}
			System.out.println();
		}
	}
}
