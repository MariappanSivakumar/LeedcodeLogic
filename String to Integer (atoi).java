/*
    Your input
          "42"
          "   -42"
          "4193 with words"
    Output
          42
          -42
          4193
*/
class Solution {
    public int myAtoi(String s) {
        int sum=0,minus=0;
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)>=48&&s.charAt(i)<=57)
                sum=(sum*10)+Integer.parseInt(""+s.charAt(i));
           if(s.charAt(i)=='-')
                minus=1;
       }
        if(minus==1)
            sum*=-1;
        return sum;
    }
}
