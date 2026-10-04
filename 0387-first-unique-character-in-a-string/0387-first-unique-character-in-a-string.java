class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
             map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int right = 0; right < s.length(); right++){
             char chr = s.charAt(right);
            if(map.get(chr) == 1){
                return right;
            }
        }
        return -1;
}
}