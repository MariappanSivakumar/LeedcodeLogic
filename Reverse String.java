class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length;i++)
            for(int j=i+1;j<s.length;j++)
            {
                char c=s[i];
                s[i]=s[j];
                s[j]=c;
            }
    }
}
