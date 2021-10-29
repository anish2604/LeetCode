class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n%2 == 0) 
            sb.append("a".repeat(n-1)).append("b");                  
        else 
            sb.append("a".repeat(n));
        return sb.toString();
    }
}
