public class Product_Array {

        public static   int[] productExceptSelf(int[] nums) {
            int[] left = new int [nums.length];
            int[] right = new int [nums.length];
            int [] ans  = new int [nums.length];

            left [0]  = 1;
            for(int i = 1; i < nums.length; i++){
                left[i] = left[i-1] * nums[i-1];
            }
            right [nums.length - 1] = 1;
            for(int i = nums.length - 2; i> -1; i--){
                right[i] = right[i+1] *nums[i+1];
            }

            for(int i = 0; i< nums.length; i++){
                ans[i] = left[i] * right[i];
            }
            return ans;
        }

    public static void main(String[] args)
    {

        int arr[] = { 10, 3, 5, 6, 2 };
        int nums = arr.length;
         int[] ans = productExceptSelf(arr);
        System.out.println("The product array is : " + ans );
    }
}



