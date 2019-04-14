public class StrRevWOUsingInBuildMethod {
    private static int count=0;

    public static void main(String arg[]){
        String s="My name is kamini naithani";
        char ch[]=s.toCharArray();
        int count=countString(ch);
        reverseWordsFormString(s);
        lineRev(ch,count);
        System.out.println();
       // stringRevUsingRecursion(ch,0,count-1);
        System.out.print("string= "+ch);
    }


    public static void reverseWordsFormString(String s) {
        String[] strArr = s.split("\\s");
        System.out.print("Reverse word from a string : ");
        for (int i = 0;i<strArr.length; i++) {
            for(int j=strArr[i].length()-1;j>=0;j--) {
                System.out.print(strArr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    public static void lineRev(char[] ch,int count){
        char revArr[]=new char[count];
        System.out.print("\nReverse whole line : ");
        for(int i=count-1,j=0;i>=0;j++,i--){
            revArr[j]=ch[i];
        }
        for(int i=0;i<count;i++){
            System.out.print(revArr[i]);
        }
    }

    public static int countString(char[] ch){
        for(int i:ch){
            count++;
        }
        return count;
    }
    public static void stringRevUsingRecursion(char[] s,int start ,int count){
       if(start>=count)
            return ;
       else {
           char c = s[start];
           s[start] = s[count];
           s[count] = c;
           stringRevUsingRecursion(s, start++, count--);
       }
    }

}
