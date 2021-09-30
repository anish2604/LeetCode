class Solution {
    public String replaceDigits(String s) {
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i]))
                ch[i] = (char)((int)ch[i-1] + (ch[i]-48));
            else 
                continue;
        }
        return new String(ch);
    }
}
