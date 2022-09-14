/*
Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2:

Input: command = "G()()()()(al)"
Output: "Gooooal"
Example 3:

Input: command = "(al)G(al)()()G"
Output: "alGalooG"
*/


class Solution {
    public String interpret(String command) {
        String originalValue=new String();
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G'||command.charAt(i)=='a'||command.charAt(i)=='l')
                originalValue+=command.charAt(i);
            if(i<command.length()-1&&command.charAt(i)=='('&&command.charAt(i+1)==')')
                originalValue+="o";
        }
        return originalValue;
    }
}
