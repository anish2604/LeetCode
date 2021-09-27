class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            str.append(c >= 65 && c <= 90 ? (char)(c + 32) : c);
        }
        return new String(str);
    }
}
