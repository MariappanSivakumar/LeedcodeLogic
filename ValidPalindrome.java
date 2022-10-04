class Solution {
    public static String reverse(String temp)
    {
        String value="";
        for(int i=temp.length()-1;i>=0;i--)
            value+=String.valueOf(temp.charAt(i));
        return value;
    }
    public boolean isPalindrome(String s) {
        String temp="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((c>='a' && c<='z') || (c>='0' && c<='9'))
                temp+=String.valueOf(s.charAt(i));
        }
        if(temp.equals(reverse(temp)))
        return true;
        else return false;
    }
}
