public class StringCountWithoutInBuildFun {

    public static void main(String[] arg) {
        String a=new String ("Tjktguirfv erhvbcuebc crhcbreesting");
        int count=0;
        char[] ch= a.toCharArray();
       for(int i:ch){
           count++;
       }
/*  error arrayindexoutofbound
        for (int i=0;a.charAt(i)!='\0';i++){
            count++;
        }
*/
        System.out.print("count= "+count);
    }
}
