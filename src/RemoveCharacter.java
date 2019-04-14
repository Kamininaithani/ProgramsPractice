import java.util.ArrayList;
import java.util.Iterator;

public class RemoveCharacter {
    public static void main(String arg[]) {
        String s = "India is great";//"This is problem and I am solving this";
        removeChar(s);
        removeVowels(s);
        removeSpace(s);
    }

    public static void removeChar(String s) {
        char[] ch2 = "in".toCharArray();
        for (char i : ch2) {
            s=s.replaceAll(""+i,"");
        }
        System.out.println(s);
        /*for (char i : ch) {
            //int i=0;i<ch.length;i++){
            if (i == 'i' || i == 's' || i == 'n' || i == 'N') {
                continue;
            }
            arr.add(i);
        }*/

        char[] ch = s.toCharArray();
        int j = 0;
        ArrayList<Character> arr = new ArrayList<Character>();

        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i));
        System.out.println();

        for (Character str : arr) {
            System.out.print(str);
        }
        System.out.println();

        //
        Iterator<Character> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }


    public static void reverseStringFromLine(String s) {
        String[] strArr = s.split("\\s");
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i] + " ");
        }
    }

    //remove vowels
    public static void removeVowels(String s){

        char []ch=s.toCharArray();
        for(char i:s.toCharArray()) {
            if (i == 'a' || i == 'A' || i == 'e' || i == 'E' || i== 'i' || i == 'I' || i == 'u' || i == 'U') {
                continue;
            }
            System.out.print(i);
        }
    }

    //remove space
    public static void removeSpace(String s){
     char []ch=s.toCharArray();
        for(char i:ch) {
            if (i == ' ') {
                continue;
            }
            System.out.print(i);
        }
    }
/*
    //    WAP to find smallest character in a string.
    public static void removeSpace(String s){
        char []ch=s.toCharArray();
        for(char i:ch) {
            if (i == ' ') {
                count =0;
                continue;
            }else{
                if(count<=min){
                    min=count;
                    str=
                }
                count++;
            }
            System.out.print(i);
        }
    }

    WAP to reverse character case.
    WAP to check wheather given string is paliandrom or not
    WAP to count the sum of digits of a given number
*/
}
