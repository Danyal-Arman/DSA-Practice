class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFrequency = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

                  maxFrequency = Math.max(maxFrequency, map.get(ch));
                  int replacement = (right - left + 1) - maxFrequency;

            if(replacement > k){
            char chl = s.charAt(left);
            map.put(chl, map.get(chl) - 1);
            if(map.get(chl) == 0){
                map.remove(chl);
            }
                left++;
            }else{
                result = Math.max(result, right - left + 1);
            }
        }
        return result;
    }
}