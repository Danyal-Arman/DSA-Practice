class Solution {
    public boolean canConstruct(String r, String m) {
         HashMap<Character, Integer> map = new HashMap<>();

         for(int i = 0; i < r.length(); i++){
            char ch = r.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
         }
         for(int j = 0; j < m.length(); j++){
            char chm = m.charAt(j);
            if(map.containsKey(chm)){
                map.put(chm, map.get(chm) - 1);
                if(map.get(chm) == 0){
                    map.remove(chm);
                }
            }
         }
         return map.isEmpty();
    }
}