package pattern;

public class Pattern6 {

    public static void main(String args[]){

       int n=5;
        printPattarnStar(n);
        printPattarnNumber(n);
        printPattarnCharacter(n);
    }

    static void printPattarnStar(int n){
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
    }}
    static void printPattarnNumber(int n){
        for(int i=5;i>0;i--){
            for(int j=5;j>0;j--){
                System.out.print(i+ " ");
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
    static void printPattarnCharacter(int n){
        /*for(int i=5;i>0;i--){
            for(int j=5;j>0;j--){
                System.out.print((char)(i+64)+ " ");
            }
            System.out.println();
        }*/
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.format(j+65 +" ");
            }
            System.out.println();
        }
    }
}
