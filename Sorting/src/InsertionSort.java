public class InsertionSort {
    public static void insert(int a[])
    {
        int i, j, temp;
        int n = a.length;
        for (i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;

            while(j>=0 && temp <= a[j])
            {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = temp;
        }
    }
   public static  void printArr(int a[])
    {
        int i;
        int n = a.length;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

}
