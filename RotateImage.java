/*
Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
*/

class Solution {
    public void rotate(int[][] matrix) {
        for( int i=0; i<matrix.length; i++ )
        {
            for( int j=i; j<matrix[i].length; j++ )
            {
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int left=0,right=matrix.length-1;
		for(int i=0;i<matrix.length/2;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				int temp=matrix[j][left];
				matrix[j][left]=matrix[j][right];
				matrix[j][right]=temp;
			}
			left++;
			right--;
		}
    }
}
