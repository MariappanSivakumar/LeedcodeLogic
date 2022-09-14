class Solution {
    public String removeDuplicates(String word) {
        String ans=new String();
        for(int i=0;i<word.length();i++)
		{
			if(ans.isEmpty()||ans.charAt(ans.length()-1)!=word.charAt(i))
				ans+=word.charAt(i);
			else if(ans.charAt(ans.length()-1)==word.charAt(i))
				ans=ans.substring(0,ans.length()-1);
		}
        return ans;
    }
}
