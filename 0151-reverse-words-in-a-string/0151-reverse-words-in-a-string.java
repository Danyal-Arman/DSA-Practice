
class Solution {
    public String reverseWords(String s) {

        StringBuilder rd = new StringBuilder(s.trim());

        // Step 1: Reverse the entire string
        rd.reverse();

        int left = 0;
        int right = 0;
        int write = 0;

        while (right < rd.length()) {

            // Step 2: Skip extra spaces
            while (right < rd.length() && rd.charAt(right) == ' ') {
                right++;
            }

            if (right >= rd.length()) {
                break;
            }

            // Add one space between words
            if (write > 0) {
                rd.setCharAt(write++, ' ');
            }

            left = right;

            // Step 3: Find the end of the word
            while (right < rd.length() && rd.charAt(right) != ' ') {
                right++;
            }

            // Step 4: Reverse the individual word
            int l = left;
            int r = right - 1;

            while (l < r) {
                char temp = rd.charAt(l);
                rd.setCharAt(l, rd.charAt(r));
                rd.setCharAt(r, temp);

                l++;
                r--;
            }

            // Step 5: Move the word to the write position
            while (left < right) {
                rd.setCharAt(write++, rd.charAt(left++));
            }
        }

        return rd.substring(0, write);
    }
}
