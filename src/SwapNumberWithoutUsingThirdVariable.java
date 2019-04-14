public class SwapNumberWithoutUsingThirdVariable {
    public static void main(String args[]) {

        int n = -5, n2=10;
        swap(n,n2);
    }

    static void swap(int n1,int n2){
        System.out.println("n1="+n1+" n2="+n2);
        n2=n1+n2;
        n1=n2-n1;
        n2=n2-n1;
        System.out.println("n1="+n1+" n2="+n2);
    }

}
