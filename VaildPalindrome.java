/*
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/


class Solution {
public static String wordSeparator(String s)
{
    String returnvalue=new String();
    for(int i=0;i<s.length();i++)
    {
        if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))
            returnvalue+=s.charAt(i);
    }
    return returnvalue;
}
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=wordSeparator(s);
        System.out.println(s);
        int left=0,right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
