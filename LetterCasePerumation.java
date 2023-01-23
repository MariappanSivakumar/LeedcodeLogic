class Solution {
    List<String> result = new ArrayList();
    public boolean isLetter(char c){
        return c>='A' && c<='Z' || c>='a' && c<='z';
    }
    public boolean isWhat(char c){
        return c>='A' && c<='Z';
    }
    public void letterCompination(char word[], int index){
        
        result.add(new String(word));
        if(index == word.length)return;
        for(int i=index;i<word.length;i++){
            if(isLetter(word[i])){
                boolean flag = isWhat(word[i]);
                if(flag) word[i] += 32;
                else word[i] -= 32;
                letterCompination(word, i+1);
                if(flag) word[i] -= 32;
                else word[i] += 32;
            }
        }
    }
    public List<String> letterCasePermutation(String s) {
        char word[] = s.toCharArray();
        letterCompination(word, 0); 
        return result;
    }
}
