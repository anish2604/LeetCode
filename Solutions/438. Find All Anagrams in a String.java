class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList();
        if(s.length() == 0 || s == null) 
            return result;
        int [] occur = new int[26];
        for(char ch : p.toCharArray()) 
            occur[ch-'a']++;
        int left = 0, right = 0, count = p.length();
        while(right<s.length()) {
            if(occur[s.charAt(right++)-'a']-- >= 1) 
                count--;
            if(count == 0) 
                result.add(left);
            if(right-left == p.length() && occur[s.charAt(left++)-'a']++ >= 0) 
                count++;
        }
        return result;
    }
}
