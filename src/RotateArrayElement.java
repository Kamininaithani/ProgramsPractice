import java.lang.reflect.Array;
import java.util.ArrayList;

public class RotateArrayElement {

    public static void main(String arg[]){
        int a[]={1,2,3,4,5,6};
        int nth=4;
        anticlock(a,nth);
    }
    public static void anticlock(int[] a,int nth){
        int temp[] = new int[a.length];
    /*    for(int i=0;i<nth;i++){
          temp[i]=a[i];
            for(int j=0;j<a.length;j++){
                a[j]=a[j+1];
                //a[i]=temp;
            }
            a[a.length-1]=temp;
        }
    */
        for(int i=0;i<nth;i++){
            temp[i]=a[0];
            for(int j=0;j<a.length-1;j++){
                    a[j]=a[j+1];
            }
            a[a.length-1]=temp[i];
        }

        for(int j=0;j<a.length;j++){
            System.out.println(" "+a[j]);
        }
    }
}