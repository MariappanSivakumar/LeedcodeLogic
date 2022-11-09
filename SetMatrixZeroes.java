/*
Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
*/
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> setIPosition = new LinkedHashSet();
        Set<Integer> setJPosition = new LinkedHashSet();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    setIPosition.add(i);
                    setJPosition.add(j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(setIPosition.contains(i) || setJPosition.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
