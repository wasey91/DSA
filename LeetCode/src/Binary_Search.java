public class Binary_Search {
        public static int search(int[] nums, int target) {
            int mid = 0;
            int i = 0;
            int j = nums.length - 1;
            while(i<=j)
            {
                mid = (i+j)/2;
                if(target==nums[mid])
                    return mid;

                else
                if(nums[mid]>target)
                    j = j-1;
                else
                    i = mid+1;
            }
            return -1;
        }


    public static void main(String args[])
    {

        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = search(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}

