package pattern;

public class Pattern7 {
    public static void main(String args[]){

        int n=5;
        //printPattarnStar(n);
        //printPattarnNumber(n);
        //printPattarnCharacter(n);
        printPattarnNum(n);
        printPattarnChar(n);
    }
    static void printPattarnNum(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j>0;j--){
                System.out.print("_ ");
            }

            for(int j=n;j>i;j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

    static void printPattarnChar(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("_ ");
            }
            for(int j=0;j<=i;j++){
                System.out.format((char)(j+65) +" ");
            }
            System.out.println();
        }
    }
    static void printPattarnStar(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }}

       /*
       5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
        */
    static void printPattarnNumber(int n){
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
       /* for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }*/
    }
    /*
    A
A B
A B C
A B C D
A B C D E
     */
    static void printPattarnCharacter(int n){
        /*for(int i=5;i>0;i--){
            for(int j=5;j>0;j--){
                System.out.print((char)(i+64)+ " ");
            }
            System.out.println();
        }*/
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.format((char)(j+65) +" ");
            }
            System.out.println();
        }
    }
}
