class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int flipCount = 0;
        int maxOnes = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
              flipCount++;
            }
              while(flipCount > k){
              if(nums[left] == 0){
                flipCount--;
              } 
               left++;
              }
              if(flipCount <= k){
                maxOnes = Math.max(maxOnes, right - left + 1);
              }
        }
        return maxOnes;
    }
}