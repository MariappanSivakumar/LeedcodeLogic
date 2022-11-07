/*
Example 1:

Input: password = "IloveLe3tcode!"
Output: true
Explanation: The password meets all the requirements. Therefore, we return true.
Example 2:

Input: password = "Me+You--IsMyDream"
Output: false
Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.
Example 3:

Input: password = "1aB!"
Output: false
Explanation: The password does not meet the length requirement. Therefore, we return false.
*/

class Solution {
    public boolean strongPasswordCheckerII(String password) {
       int length = password.length();
       if(length<8)return false;
       boolean oneUpper = false, oneLower = false, onedigit = false, onespacial = false, samechar = false;
       for(int i=0;i<length;i++)
       {
           char c = password.charAt(i);
           if(oneLower == false && c>='a'&& c<='z') oneLower = true;
            if(oneUpper == false && c>='A'&& c<='Z') oneUpper = true;
            if(onedigit == false && c>='0'&& c<='9') onedigit = true;
            if(onespacial == false && c=='!' || c=='@' || c=='#' || c=='$' || c=='%' 
            || c=='^' || c=='&'|| c=='*' || c=='(' || c==')' || c=='-' || c=='+') onespacial = true;
            if(i!=length-1 && c == password.charAt(i+1)) return false;
       }
       return oneLower && oneUpper && onedigit && onespacial;
    }
}
