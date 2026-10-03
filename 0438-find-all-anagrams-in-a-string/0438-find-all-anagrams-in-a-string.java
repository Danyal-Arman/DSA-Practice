class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        String substring  = "";
        char[] pChar = p.toCharArray();
        Arrays.sort(pChar);

        for(int i = 0; i <= s.length() - p.length(); i++){
            substring = s.substring(i, i + p.length());

            char[] sChars = substring.toCharArray();
            Arrays.sort(sChars);

            if(Arrays.equals(pChar, sChars)){
                result.add(i);
            }
        }
        return result;
    }
}