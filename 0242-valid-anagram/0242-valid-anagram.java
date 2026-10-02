class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> anagram = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!anagram.containsKey(ch)) {
                anagram.put(ch, 1);
            } else {
                anagram.put(ch, anagram.get(ch) + 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {

            char ch = t.charAt(j);

            if (!anagram.containsKey(ch)) {
                return false;
            }

            anagram.put(ch, anagram.get(ch) - 1);

            if (anagram.get(ch) == 0) {
                anagram.remove(ch);
            }
        }

        return anagram.isEmpty();
    }
}