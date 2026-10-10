class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxFruits = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < fruits.length; right++){ 
            int val = fruits[right]; 
            map.put(val, map.getOrDefault(val, 0) + 1);
            
            while(map.size() > 2){
                int val2 = fruits[left];
                map.put(val2, map.get(val2) - 1);
                if(map.get(val2) == 0) {
                    map.remove(val2);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left  + 1);
        }
      return maxFruits;
    }
}