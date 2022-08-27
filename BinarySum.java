/*
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/

class Solution {
    static String first=new String();
    static String second=new String();
    public static void equals(String a,String b)
    {
        first=a;
        second=b;
        if(a.length()<b.length())
            for(int i=a.length();i<b.length();i++)
                first="0"+first;
        else 
            for(int i=b.length();i<a.length();i++)
                second="0"+second;
    }
    public String addBinary(String a, String b) {
        equals(a,b);
        int carry=0;
        String ans=new String();
        for(int i=first.length()-1;i>=0;i--)
        {
            int sum=Integer.parseInt(""+first.charAt(i))+Integer.parseInt(""+second.charAt(i))+carry;
            if(sum==0)
            {
                carry=0;
                ans="0"+ans;
            }else if(sum==1)
            {
                carry=0;
                ans="1"+ans;
            }else if(sum==2)
            {
                carry=1;
                ans="0"+ans;
            }else
            {
                carry=1;
                ans="1"+ans;
            }
        }
        if(carry==1)
            ans="1"+ans;
        return ans;
    }
}
