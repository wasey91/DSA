public class BubleSort {
    static void print(int a[])
    {
        int n = a.length;
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void bubbleSort(int a[])
    {
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }


        }
    }

}




