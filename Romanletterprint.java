class Solution {
    public int romanToInt(String s){
         int sum=0;
        for(int i=0;i<s.length();i++)
            sum+=s.charAt(i)=='I'?1:(s.charAt(i)=='V'?5:(s.charAt(i)=='X'?10:(s.charAt(i)=='L'?50:(s.charAt(i)=='C'?100:(s.charAt(i)=='D'?500:(s.charAt(i)=='M'?1000:0))))));
        return sum;
    }
}
