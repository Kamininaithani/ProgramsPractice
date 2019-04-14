package pattern;

public class PiramidPattern {
    public static void main(String args[]){

        int n=5;
        //printPattarnStar(n);
        //printPattarnNumber(n);
        //printPattarnCharacter(n);
        printPattarnNum(n);
    }
    static void printPattarnNum1(int n){
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            k=0;
            for(int j=0;j<(2*i)+1;j++){
                if(j<i) {
                    System.out.format((char) (k++ + 65) + "");
                }else
                    System.out.format((char) (k-- + 65) + "");
            }
            /*for(int j=0;j<=i;j++){
                System.out.format((char)(j+65) +"");
            }*/
            k=0;
            System.out.println();
        }
    }


    static void printPattarnNum(int n){
        int k=0;
        for(int i=n;i>=0;i--){
            k=0;
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++){
                if(j<i) {
                    System.out.format((char) (k++ + 65) + "");
                }else
                    System.out.format((char) (k-- + 65) + "");
            }

            System.out.println();
        }
    }
}
