class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int left = 0;
        int maxLength = 0;

    for(int right = 0; right < nums.length; right++){
        if(right > 0 && nums[right] <= nums[right - 1]){
            left = right;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
    }
}