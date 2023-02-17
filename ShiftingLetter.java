class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        char ch[] = s.toCharArray();
        for( int i=shifts.length-1; i>=0; i-- ) {
            if(i!=0) {
                shifts[i] %= 26;
                shifts[i-1] %= 26;
                shifts[i-1] += shifts[i];
            } else {
                shifts[i] %= 26;
            }
            if((char)(ch[i] + shifts[i]) > 'z' ) {
                int distance = 'z' - ch[i] ;
                shifts[i] -= distance;
                ch[i] = 'a'-1; 
            }
            ch[i] += shifts[i];
        }
        return new String(ch);
    }
}
