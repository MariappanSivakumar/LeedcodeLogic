/*

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
*/



class Solution {
    public void makeWater(char grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j] == '0')return;

        grid[i][j] = '0';

        makeWater(grid, i+1, j);
        makeWater(grid, i-1, j);
        makeWater(grid, i, j+1);
        makeWater(grid, i, j-1);
    }
    public boolean isIsland(char grid[][], int i, int j){
        try {
            if(grid[i+1][j] != '0')return false;
        }catch(ArrayIndexOutOfBoundsException e){}
        try {
            if(grid[i-1][j] != '0')return false;
        }catch(ArrayIndexOutOfBoundsException e){}
        try {
            if(grid[i][j+1] != '0')return false;
        }catch(ArrayIndexOutOfBoundsException e){}
        try {
            if(grid[i][j-1] != '0')return false;
        }catch(ArrayIndexOutOfBoundsException e){}
        return false;
    }
    public int numIslands(char[][] grid) {
        int island = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    makeWater(grid, i, j);
                    island++;
                }
            }
        }
        return island;
    }
}
