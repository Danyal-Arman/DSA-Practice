class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int count = 0;
       int prefix = 0;
       Map<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);
       
       for(int i = 0; i < nums.length; i++){
          prefix += nums[i];
          int remainder = Math.floorMod(prefix, k);
          int isThere = map.getOrDefault(remainder, 0);
          if(isThere >= 1){
            count += isThere;
          }
          map.put(remainder, map.getOrDefault(remainder, 0) + 1);
       }
       return count;
    }
}