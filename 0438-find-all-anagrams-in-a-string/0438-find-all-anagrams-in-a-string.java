class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left  = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        

        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for(int right = 0; right < s.length(); right++){
            char chs = s.charAt(right);
            window.put(chs, window.getOrDefault(chs, 0) + 1);

            if(right - left + 1 > p.length()){
                char chl = s.charAt(left);
                window.put(chl, window.get(chl) - 1);
                
                if(window.get(chl) == 0){
                    window.remove(chl);
                }
                left++;
            }
                if(map.equals(window)){
                    result.add(left);
                }
            } 
        return result;
    }
}