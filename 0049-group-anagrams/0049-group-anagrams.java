class Solution {
    public String sortString(String s) {
        char[] chr = s.toCharArray();
        Arrays.sort(chr);
        return new String(chr);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String str : strs) {
            String stringKey = sortString(str);

            if(!map.containsKey(stringKey)){
                List<String> words = new ArrayList<>();
                words.add(str);
                map.put(stringKey, words);
            }else{
                map.get(stringKey).add(str);
            }
        }
         result.addAll(map.values());
         return result;

}
}