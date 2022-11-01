/*
Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
*/

class Solution {
    List<String> perumatation = new ArrayList();

    public void findPerumutation(String[] array, int currentIndex) 
    {
        if (currentIndex == array.length - 1 )
        {
            int open=0,close=0;
            boolean isfalse = true;
            for(int i=0;i<array.length;i++)
            {
                if(array[i].equals("("))open++;
                else close++;
                if(open<close)
                {
                    isfalse = false;
                }
            }
            if(isfalse)
            { 
                String temp = "";
                for(int i=0;i<array.length;i++)
                {
                    temp+=array[i];
                }
                perumatation.add(temp);
            }
          return;  
        }

        for (int i = currentIndex; i < array.length; i++) 
        {
            if(i!=currentIndex && array[i]==array[i-1]) continue;
            swapArray(array, i, currentIndex);
            findPerumutation(array, currentIndex + 1);
            swapArray(array, i, currentIndex);
        }
    }
    private void swapArray(String[] array, int i, int currentIndex) 
    {
        String temp = array[i];
        array[i] = array[currentIndex];
        array[currentIndex] = temp;
    }
    public List<String> generateParenthesis(int n) {
        String value[] = new String[n*2];
        for(int i=0;i<value.length;i++)
        {
            if(i<n)
            value[i] = "(";
            else value[i] = ")"; 
        }
        java.util.Arrays.sort(value);
        findPerumutation(value,0);
        return perumatation;
    }
}
