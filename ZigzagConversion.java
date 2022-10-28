/*
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
*/
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        int count =0; boolean flag = true;
        String[] word = new String[numRows];
        for(int i=0;i<word.length;i++)
            word[i]="";
		for(int i=0;i<s.length();i++)
		{
            word[count]+=String.valueOf( s.charAt(i) );
			System.out.println(count);
            if(flag)count++;
			else count--;
			if(count == numRows-1)flag = false;
			if(count == 0) flag = true;
        }
        String result = "";
        for(String iter : word)
            result +=iter;
        return result;
    }
}
