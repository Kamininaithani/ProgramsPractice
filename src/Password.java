import java.util.Scanner;

public class Password {

    public static void main(String args[]) {
      //  Scanner sc = new Scanner(System.in);
      //  String s = sc.nextLine();
        String s="Password@";
        System.out.print((checkIfpasswordIsValid(s)) ? "Password is Valid":"Password in Invalid");
    }
    public static boolean checkIfpasswordIsValid(String s){
        int uppercase=0,lowercase=0,number=0,specialChar=0;
        if(s.length()>=8 && s.length()<=12){
            for(int i=0;i<s.length();i++) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    uppercase++;
                } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    lowercase++;
                } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    number++;
                } else {
                    specialChar++;
                }
            }
            if(uppercase>0 &&lowercase>0 && number>0 && specialChar>0) {
                return true;
            }
        }
        return false;
    }
}
//minimum one uppercase and lowercase character, min one special character.