/*
Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        java.util.List<String> list=new java.util.LinkedList<>();
            for(int i=1;i<=n;i++)
            {
                    if(i%3==0&&i%5==0)
                            list.add("FizzBuzz");
                    else if(i%3==0)
                            list.add("Fizz");
                    else if(i%5==0)
                            list.add("Buzz");
                    else list.add(""+i);
            }
        return list;
    }
}
