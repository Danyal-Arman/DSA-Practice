
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Remainder 0 exists before the array starts
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int remainder = prefixSum % k;

            // Check if the same remainder appeared before
            if (map.containsKey(remainder)) {

                int previousIndex = map.get(remainder);

                // Subarray length must be at least 2
                if (i - previousIndex >= 2) {
                    return true;
                }

            } else {

                // Store the first index of this remainder
                map.put(remainder, i);
            }
        }

        return false;
    }
}
