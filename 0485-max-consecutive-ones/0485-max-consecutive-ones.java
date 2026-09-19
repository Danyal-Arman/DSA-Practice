class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] != 1){
                left = right + 1;
            }else{
            maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength; 
    }
}