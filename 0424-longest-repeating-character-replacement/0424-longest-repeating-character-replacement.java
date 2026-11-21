class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int replacement = 0;
        int maxFrequency = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right =0; right < s.length(); right++){
            char chr = s.charAt(right);
            char chl = s.charAt(left);
            map.put(chr, map.getOrDefault(chr, 0) + 1);

            maxFrequency = Math.max(maxFrequency, map.get(chr));
            replacement = (right - left + 1) - maxFrequency;

            if(replacement > k){
                map.put(chl, map.get(chl) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);            
        }
        return maxLength;
    }
}