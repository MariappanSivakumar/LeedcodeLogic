class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;

        String arr1[] = new String[grid.length];
        String arr2[] = new String[grid[0].length];

        for(int i=0;i<grid.length;i++){

            String temp1 = "";
            String temp2 = "";
            for(int j=0;j<grid[i].length;j++){
                temp1+="("+grid[i][j]+")";
                temp2+="("+grid[j][i]+")";
            }
            arr1[i] += temp1;
            arr2[i] += temp2;
        } 
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i].equals(arr2[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
