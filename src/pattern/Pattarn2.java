package pattern;

/**
 * 
 *   123454321
 * 
 * @author kamininaithani
 *
 */
public class Pattarn2 {

	public static void main(String args[]) {
		int i,l=1, n = 5;
		for(i=0;i<(n*2)-1;i++){
			if(i<=(n/2+1)){
			  System.out.print(l++);
			}
			else
				System.out.print(l--);
		  
		}
		
	}
}

