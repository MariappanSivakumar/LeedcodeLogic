/*
Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
*/

class Solution {
    List<List <Integer> > list = new ArrayList();
    public void findPerumutation(int[] array, int currentIndex) 
    {
        if (currentIndex == array.length - 1)
        {
            List<Integer> temp = new ArrayList();
            for(int i=0;i<array.length;i++)
                temp.add(array[i]);
            if(list.contains(temp) == false)
                list.add(temp);
          return;  
        }

        for (int i = currentIndex; i < array.length; i++) 
        {
            if(i!=currentIndex && array[i]==array[i-1])continue;
            swapArray(array, i, currentIndex);
            findPerumutation(array, currentIndex + 1);
            swapArray(array, i, currentIndex);
        }
    }
    private void swapArray(int[] array, int i, int currentIndex) 
    {
        int temp = array[i];
        array[i] = array[currentIndex];
        array[currentIndex] = temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        findPerumutation( nums, 0); 
        return list;
    }
}
