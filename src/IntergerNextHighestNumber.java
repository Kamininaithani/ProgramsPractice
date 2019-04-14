import java.util.*;
public class IntergerNextHighestNumber {

    static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    static void findNext(int ar[], int n)
    {
        int i;
        for (i = n - 1; i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }

        if (i == 0)
        {
            System.out.println("Not possible");
        }
        else
        {
            int x = ar[i - 1], min = i;

            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }

         //   swap(ar, i - 1, min);

            Arrays.sort(ar, i, n);
            for (i = 0; i < n; i++)
                System.out.print(ar[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count = 0;
        int n = number;

        while (n != 0)
        {
            n /= 10;
            count++;
        }

        if(count!=0){
            Integer numberArray[]=new Integer[count];

            count = 0;
            n = number;

            while (n != 0){
                numberArray[count] = n % 10;
                n /= 10;
                count++;
            }
        }
        //findNext(numberArray, n);
    }
}

