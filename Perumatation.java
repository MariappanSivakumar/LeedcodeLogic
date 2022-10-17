class Solution {
    public List<List<Integer>> listObj = new ArrayList();

    private void swapArray(int[] array, int i, int currentIndex) 
    {
        int temp = array[i];
        array[i] = array[currentIndex];
        array[currentIndex] = temp;
    }
    public void findPerumutation(int[] array, int currentIndex) 
    {
        if (currentIndex == array.length - 1)
        {
            List<Integer> list = new ArrayList();
            for(int i=0;i<array.length;i++)
                list.add(array[i]);
            listObj.add(list);
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
    public List<List<Integer>> permute(int[] nums) {
        findPerumutation( nums, 0); 
        return listObj;
    }
}
