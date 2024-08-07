
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


//        int a[] = {40,30,80,90,70,2000,77};
//        int n = a.length;
//        HeapSort h1 = new HeapSort();
//
//        System.out.print("Before sorting array elements are - \n");
//       h1.printArr(a, n);
//        h1.heapSort(a, n);
//        System.out.print("\nAfter sorting array elements are - \n");
//        h1.printArr(a, n);


//        int a[] = { 103,50,78,69,70 };
//        InsertionSort i1 = new InsertionSort();
//        System.out.println("\nBefore sorting array elements are - ");
//        i1.printArr(a);
//        i1.insert(a);
//        System.out.println("\n\nAfter sorting array elements are - ");
//        i1.printArr(a);


//            int a[] = { 45,78,59,7654,65,76,54 };
//            SelectionSort i1 = new SelectionSort();
//            System.out.println("\nBefore sorting array elements are - ");
//            i1.printArr(a);
//            i1.selection(a);
//            System.out.println("\nAfter sorting array elements are - ");
//            i1.printArr(a);

        int a[] = { 12,43,54,6,76,87,9,5 };
        int n = a.length;
        CountingSort c1 = new CountingSort();
        System.out.println("\nBefore sorting array elements are - ");
        c1.printArray(a, n);
        c1.countSort(a,n);
        System.out.println("\nAfter sorting array elements are - ");
        c1.printArray(a, n);
    }
}

