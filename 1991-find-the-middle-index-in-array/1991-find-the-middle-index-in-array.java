class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefixSum = 0;

        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
        }
            int leftSum = 0; 
        for(int j = 0; j < nums.length; j++){

            if(j > 0){
            leftSum += nums[j - 1];
            }
            int rightSum = prefixSum - leftSum - nums[j];

            if(leftSum == rightSum) {
                return j;
            }
        }
        return -1;
    }
}