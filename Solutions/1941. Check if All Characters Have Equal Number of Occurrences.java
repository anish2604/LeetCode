class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        int temp = 0;
        for (int i : count) {
            if (i != 0 && i != temp & temp != 0)
                return false;
            if (i > temp) 
                temp = i;
        }
        return true;
    }
}
