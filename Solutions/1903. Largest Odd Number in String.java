class Solution {
    public String largestOddNumber(String num) {
        int res = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            int curr = num.charAt(i) - '0';
            if (curr % 2 == 1 && i > 0) 
                return num.substring(0, i + 1);
            if (curr % 2 == 1 && curr > res) 
                res = curr;
        }
        return res >= 0 ? Integer.toString(res) : "";
    }
}
