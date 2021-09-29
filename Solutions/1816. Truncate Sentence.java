class Solution {
    public String truncateSentence(String s, int k) {
        int i = 0, count = 0;
        for(i = 0; i < s.length() && count < k; i++) {
            if(s.charAt(i) == ' ')
                count++;     
        }
        if(i == s.length())
            return s.substring(0, i);
        return s.substring(0, i-1);
    }
}
