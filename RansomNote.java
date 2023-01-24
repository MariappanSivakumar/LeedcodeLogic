class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int dp[] = new int[26];
        for(int i=0;i<magazine.length();i++){
            dp[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(dp[ransomNote.charAt(i)-'a']--  == 0)return false;
        }
        return true;
    }
}
