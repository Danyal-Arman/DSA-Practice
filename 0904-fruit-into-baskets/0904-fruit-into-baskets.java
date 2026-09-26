class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxFruit = 0;
        int f = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < f; right++){
            int val = fruits[right];
            map.put(val, map.getOrDefault(val, 0) + 1);
            if(map.size() <= 2){
                maxFruit = Math.max(maxFruit, right - left + 1);
            }
            if(map.size() > 2){
                int vall = fruits[left];
                map.put(vall, map.get(vall) - 1);
                if(map.get(vall) == 0){
                    map.remove(vall);
                }
                left++;
            }
        }
        return maxFruit;
    }
}