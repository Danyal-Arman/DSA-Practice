class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> maps = new HashMap<>();
        HashMap<Character, Character> mapt = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(maps.containsKey(ch1)){
               if(maps.get(ch1) != ch2) return false;
            }
            if(mapt.containsKey(ch2)){
                if(mapt.get(ch2) != ch1) return false;
            }

            mapt.put(ch2, ch1);
            maps.put(ch1, ch2);
        }
        return true;
    }
}