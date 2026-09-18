class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> set = new HashSet<>();
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char r = s.charAt(right);
            while(set.contains(r)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(r);
            maxLength = Math.max(maxLength, right - left + 1);
        }  
        return maxLength;
    }
}