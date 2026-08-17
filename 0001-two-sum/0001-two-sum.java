class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length; i++){
            int remaining = target - nums[i];
            System.out.println("remaining" + remaining);
            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
      public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(
            Arrays.toString(
                solution.twoSum(new int[]{2, 7, 11, 15}, 9)
            )
        );
    }
}