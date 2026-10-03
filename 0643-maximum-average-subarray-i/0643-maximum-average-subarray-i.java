class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        double maxAverageVal = (double) sum / k;
        

            int left = 0;
        for(int right = k; right < nums.length; right++){
              sum += nums[right];
                sum -= nums[left];
                left++;
               double average = (double) sum / k;
               maxAverageVal = Math.max(maxAverageVal, average);
        }
        return maxAverageVal;
    }
}