import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int low = i + 1;
                int high = nums.length - 1;

                while (low < high) {
                    int total = nums[i] + nums[low] + nums[high];

                    if (total > 0) {
                        high--;
                    } else if (total < 0) {
                        low++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        low++;

                        while (low < high && nums[low] == nums[low - 1]) {
                            low++;
                        }
                    }
                }
            }
            return res;
        }
    }

