class Solution {
    public int maxProduct(int[] nums) {
        int prevMaxProduct = nums[0];
        int prevMinProduct = nums[0];
        int result = nums[0];

        for(int i = 1; i <nums.length; i++){
            int currentMax = prevMaxProduct * nums[i];
            int currentMin = prevMinProduct * nums[i];
 
            int newMax = Math.max(nums[i], Math.max(currentMax, currentMin));
            int newMin = Math.min(nums[i], Math.min(currentMin, currentMax));

            prevMaxProduct = newMax;
            prevMinProduct = newMin;

            result = Math.max(result, newMax);
        }
        return result;


    }
}