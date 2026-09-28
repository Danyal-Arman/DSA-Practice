class Solution {
        private boolean isVowel(char c) {
   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
       c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
       return true;
   }
   return false;
}
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;


        while(left < right){
            char chl = chars[left];
            char chr = chars[right];

            if(isVowel(chl) == true && isVowel(chr) == true){
                char temp = chl;
                chars[left] = chars[right];
                chars[right] = chl;
                left++;
                right--;
            }else if(isVowel(chl) == true && isVowel(chr) == false){
                right--;
            }else if(isVowel(chl) == false && isVowel(chr) == true){
                left++;
            }else{
                left++;
                right--;
            }    
        }
        return new String(chars);
    }
}