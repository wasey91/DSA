public class Test_Algorithm {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int last = arr.length - 1;
        BinarySearch.binarySearch(arr, 0, last, key);
    }
}
