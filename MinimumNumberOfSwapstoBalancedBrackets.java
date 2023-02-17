class Solution {
    public int minSwaps(String s) {
        int start = 0;
        int result = 0;
        for( int i=0; i < s.length(); i++ ) {
            if(s.charAt(i) ==']') {
                if(start > 0) start --;
                else {
                    result ++;
                    start++;
                }
            } else start++;
        }
        return result;
    }
}
