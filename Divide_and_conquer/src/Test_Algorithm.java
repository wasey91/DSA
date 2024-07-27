import java.util.Map;

public class Test_Algorithm {

    public static void main(String args[]) {
//        int arr[] = {10, 20, 30, 40, 50};
//        int key = 30;
//        int last = arr.length - 1;
//        BinarySearch.binarySearch(arr, 0, last, key);
//    }

//        int num = 10;
//        int x = 3;
//        int k1 = Power.pow(num, x);
//        System.out.println(k1);
//        int [] A = {10,30,4,10,40};
//
//        int index = LinearSearch.Ls(A,30);
//
//        System.out.println(index);
    int A[] = {10, 20, 30, 40, 50};
        Straight_Max_Min.Min_Max result = Straight_Max_Min.min_max ( A );

      System.out.println (result.max);
      System.out.println (result.min);

    }

}