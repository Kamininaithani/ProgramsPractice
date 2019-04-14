public class Combinations {
    public static void recurse(int[] a, int index) {
        if (index == a.length) {
            for (int x : a) {
                System.out.print(x + "\t");
            }
            System.out.println();
            return;
        }
        int temp = a[index];
        a[index] = 0;
        recurse(a, index + 1);
        a[index] = temp;
        recurse(a, index + 1);
    }

    public static void main(String[] args) {
        int a[] = {19, 21, 3, 14, 5};
        recurse(a, 0);
    }
}
