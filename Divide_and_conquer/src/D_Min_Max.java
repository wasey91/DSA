public class D_Min_Max {
        public static class min1max1{
            int min;
            int max;
        }

        public static min1max1 max_min(int[]A,int start,int end) {
            int mid = (start+end)/2;

            min1max1 mm = new min1max1();
            if (start == end) {
                mm.min = A[start];
                mm.max = A[end];
                return mm;
            } else if (start == end - 1) {
                if (A[start] > A[end]) {
                    mm.max = A[start];
                    mm.min = A[end];
                    return mm;
                } else {
                    mm.max = A[end];
                    mm.min = A[start];
                    return mm;
                }
            } else {
                mid = (start+end)/2;
                min1max1 left=max_min(A, start, mid);
                min1max1 right=max_min(A,mid+1, end);
                mm.min=Math.min(left.min, right.min);
                mm.max=Math.max((left.max),right.max);
                return mm;
            }
        }

    }

