import java.util.ArrayList;
import java.util.Iterator;

public class ProgrammerProgrammer {
        public static void main(String arg[]) {
            String s = "pdonrogrammerkaminiprogrammerhghg";
            char[] ch = "programmerprogrammer\0".toCharArray();
            int j=0;
            ArrayList<Character> arr = new ArrayList<Character>();
            for (int i=0; i<s.length();i++) {
                if(s.charAt(i)==ch[j] && ch[j]!='\0'){//(ch.length-1)!=j){
                    j++;
                    continue;
                }
                arr.add(s.charAt(i));
            }
            System.out.println("Remaining string: ");
            for (Character str : arr) {
                System.out.print(str);
            }
        }
}
