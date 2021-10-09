class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c=coordinates.charAt(0);
        int d=coordinates.charAt(1);
        if(c=='a' || c=='c' || c=='e'|| c=='g') {
            if(d%2!=0)
                return false;
            else
                return true;
        }
       
        if(c=='b' || c=='d' || c=='f'|| c=='h') {
            if(d%2!=0)
                return true;
            else
                return false;
        }
        return false;
    }
}
