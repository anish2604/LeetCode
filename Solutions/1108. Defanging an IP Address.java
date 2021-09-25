class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
    
        for(char a : address.toCharArray()){
            if(a == '.') sb.append("[.]");
            else sb.append(a);
        }

        return sb.toString();
    }
}
