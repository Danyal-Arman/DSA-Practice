class Solution {
    public int[] sortedSquares(int[] nums) {
      int left = 0;
      int right = nums.length - 1;
      int[] result = new int[nums.length];

      for(int k = nums.length - 1; k>=0; k--){
        if(Math.abs(nums[left])<Math.abs(nums[right])){
            result[k] = nums[right] * nums[right];
            right--;
        }else{
            result[k] = nums[left] * nums[left];
            left++;
        }
      }
      return result;
    }
}