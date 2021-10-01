class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int result = 0;
        for(int i = 0; i < rectangles.length; i++) {
            int key = Math.min(rectangles[i][0], rectangles[i][1]);
            if(key > maxLen) {
                result = 1;
                maxLen = key;
            }
            else if (key == maxLen) {
                result++;
            }
        }
        return result;
    }
}
