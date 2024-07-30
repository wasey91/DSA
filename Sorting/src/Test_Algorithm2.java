
public class Test_Algorithm2 {
    public static void main(String[] args) {
        int a[] = {40,30,8,79,6,};
        BubleSort b1 = new BubleSort();
        System.out.println("Before sorting array elements are - ");
        b1.print(a);
        b1.bubbleSort(a);
        System.out.println();
        System.out.println("After sorting array elements are - ");
        b1.print(a);
    }
}

