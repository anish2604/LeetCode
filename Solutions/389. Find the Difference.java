class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            result += t.charAt(i) - s.charAt(i);
        }
        return (char) (result + t.charAt(t.length() - 1));
    }
}
