import java.util.HashMap;
import java.util.Map;

    public class MajorityElement {
        public static int majorityElement(int[] nums) {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int num : nums) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            int majority = nums[0];
            int majorityCount = countMap.get(majority);

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int currentCount = entry.getValue();
                if (currentCount > majorityCount) {
                    majority = entry.getKey();
                    majorityCount = currentCount;
                }
            }

            return majority;
        }

        public static void main(String[] args) {
            int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
            int result = majorityElement(nums);
            System.out.println("Majority Element: " + result);
        }
    }
