class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;
        map.put(0,1);

        for(int i = 0; i < nums.length; i++){
           prefixSum += nums[i];

           int previousPrefixSum = prefixSum - k;

           if(map.containsKey(previousPrefixSum)){
            count += map.get(previousPrefixSum);
           }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
      return count;
    }
}