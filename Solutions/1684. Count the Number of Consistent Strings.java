class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) 
            set.add(allowed.charAt(i));
        for (int i = 0; i < words.length; i++) {
            boolean consistent = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    consistent = false;
                    break;
                }
            }
            if (consistent == true) 
                result++;
        }
        return result;
    }
}
