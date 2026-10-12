class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int n = nums.length;
        int[] answer = new int[n];

        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }

        for(int j = 0; j < nums.length; j++){
           int rightSum = 0;
           if(j > 0){
            leftSum += nums[j - 1];
           }
           rightSum = totalSum - leftSum - nums[j];

           answer[j] = Math.abs(rightSum - leftSum);
        }
        return answer;
    }
}