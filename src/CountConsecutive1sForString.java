public class CountConsecutive1sForString {
    public static void main(String args[]) {
        long n = 1110111011;
        forBooleanVariable(n);

        int arr[]={1,0,1,1,1,0,0,0,1,1,1,1,1,0,0,1};
        forArrayVariable(arr);

        String str = "1110111011";
        forStringVariable(str);

     //   countOneInBinaryString(arr);
    }

    public static void forStringVariable(String n){
        int max = 0, count = 0;
        for(int i=0;i<n.length();i++) {
            count=(n.charAt(i)=='1')? (count+1) : 0;
            max=(count >= max)? count:max;
        }
        System.out.println(max);
    }

    public static void forArrayVariable(int[] n){
        int max = 0, count = 0;
        for(int i=0;i<n.length;i++) {
            count=(n[i]==1)? (count+1) : 0;
            max=(count >= max)? count:max;
        }
        System.out.println(max);
    }

    public static void forBooleanVariable(long n){
        long max = 0, count = 0;
        long a = 0;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            count=(a==1)? (count+1) : 0;
            max=(count >= max)? count:max;
        }
        System.out.println(max);
    }

    // WAP to find number of 1's in a binary string
    public static void countOneInBinaryString(String n){
        int max = 0, count = 0;
        for(int i=0;i<n.length();i++) {
            max=(n.charAt(i)=='1')? (count+1) : max;
        }
        System.out.println(max);
    }

}
