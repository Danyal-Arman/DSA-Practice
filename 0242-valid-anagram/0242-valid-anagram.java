class Solution { 
    public boolean isAnagram(String s, String t) { 
      Map<Character, Integer> map = new HashMap<>();

      if(s.length() != t.length()) return false;

      for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
      }
      for(int j = 0; j < t.length(); j++){
        char cht = t.charAt(j);
        if(!map.containsKey(cht)) return false;
        map.put(cht, map.get(cht) - 1);
        if(map.get(cht) == 0){
            map.remove(cht);
        }
      } 
       return map.isEmpty();
    } 
}