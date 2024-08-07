public class SelectionSort {
    public static void selection(int a[]) {
        int i, j, small;
        int n = a.length;
        for (i = 0; i < n - 1; i++) {
            small = i;
            for (j = i + 1; j < n; j++)
                if (a[j] < a[small])
                    small = j;
            int temp = a[small];
            a[small] = a[i];
            a[i] = temp;
        }
    }
    void printArr(int a[]) /* function to print the array */
    {
        int i;
        int n = a.length;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

}
