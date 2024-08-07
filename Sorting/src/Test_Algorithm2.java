
public class Test_Algorithm2 {
    public static void main(String[] args) {
//        int a[] = {40,30,8,79,6,};
//        BubleSort b1 = new BubleSort();
//        System.out.println("Before sorting array elements are - ");
//        b1.print(a);
//        b1.bubbleSort(a);
//        System.out.println();
//        System.out.println("After sorting array elements are - ");
//        b1.print(a);


        int a[] = {40,30,80,90,70,2000,77};
        int n = a.length;
        HeapSort h1 = new HeapSort();

        System.out.print("Before sorting array elements are - \n");
       h1.printArr(a, n);
        h1.heapSort(a, n);
        System.out.print("\nAfter sorting array elements are - \n");
        h1.printArr(a, n);

    }
}

