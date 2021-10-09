class Solution {
    public boolean checkIfPangram(String sentence) {
        for(Character i = 'a'; i <= 'z'; i++){
            if(!sentence.contains(Character.toString(i)))
                return false;
        }
        return true;
    }
}
