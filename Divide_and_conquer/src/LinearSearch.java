public class LinearSearch {


    public static int Ls(int[] A, int elements) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == elements) {
                return i;
            }
        }
        return -1;


    }


}
