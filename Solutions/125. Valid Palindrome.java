class Solution {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while (i < j) {
            char l = s.charAt(i);
            char r = s.charAt(j);
             if ((l>='a' && l<='z') || ((l>='A' && l<='Z')) || (l>='0' && l<='9')) {
				if ((r>='a' && r<='z') || ((r>='A' && r<='Z')) || (r>='0' && r<='9')) {
					if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                        return false;
                    }
                    i++;
                    j--;
                }
                else j--;
            }
            else i++;
        }
        return true;
    }
}
