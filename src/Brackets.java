import java.util.Stack;

public class Brackets {


    public static void main(String args[]) {
        String str = "(((()";
        System.out.println(function(str));
        System.out.println(evenodd(10));
    }

    public static String evenodd(int no){
        return (no%2==0)?"even": "odd";
    }
    public static boolean function(String s){
        Stack<String> stk=new Stack<String>();
        int i=0;
        for( i=0;i<s.length();i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stk.push(s.charAt(i) + "");
            } else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                String temp = (s.charAt(i) == '}') ? "{" : (s.charAt(i) == ']') ? "[" : "(";
                boolean res = stk.pop().equals(temp);
                if (res == false) {
                    break;
                }
            }
        }
        if(stk.isEmpty() && i==s.length())
            return true;
        else
            return false;
    }
}
