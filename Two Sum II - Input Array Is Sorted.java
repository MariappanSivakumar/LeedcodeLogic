class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, h = numbers.length - 1;
        int total = numbers[l] + numbers[h];
        while(total != target){
            if(total < target) l++;
            else h--;
            total = numbers[l] + numbers[h];
        }
        int n[]=new int[2];
        n[0]=l+1;
        n[1]=h+1;
        return n;
    }
}
