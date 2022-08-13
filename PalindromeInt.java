class Solution {
    public boolean isPalindrome(int x) {
        boolean f=false;
        StringBuilder s=new StringBuilder(""+x);
        StringBuilder s1=new StringBuilder(""+x);
        s1.reverse();
        try
        {
            if(Integer.parseInt(s.toString())==Integer.parseInt(s1.toString()))
                f=true;
        }
        catch(NumberFormatException e){f=false;}
        return f;
    }
}
