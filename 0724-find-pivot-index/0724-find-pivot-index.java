class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
       

        for(int i = 0; i < nums.length; i++){
           totalSum += nums[i];
        }
             int leftSum = 0;
        for(int j = 0; j < nums.length; j++){
             int rightSum = totalSum - leftSum - nums[j];
      
             if(leftSum == rightSum){
                return j;
             }
             leftSum += nums[j];
        }
        return -1;
    }
}