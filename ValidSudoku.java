/*
Example 1:


Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
*/
class Solution {
    public boolean plus9X9Check( char board[][], int i, int j , char charnum)
    {
        int count=0;
        for( int x=0; x<9; x++ )
        {
            if( board[i][x] == charnum )count++;
            if( board[x][j] == charnum )count++;
        }        
        if(count==2)return true;
        return false;
    }

    public boolean threeXthreeCheck( char board[][], int i, int j, char charnumber )
    {
        int startWithX = 0, endWithX=0, startWithY=0, endWithY=0;
        
        if( i>=0 && i<=2 && j>=0 && j<=2 ){startWithX=0;endWithX=2;startWithY=0;endWithY=2;}
        else if( i>=0 && i<=2 && j>=3 && j<=5 ){startWithX=0;endWithX=2;startWithY=3;endWithY=5;}
        else if( i>=0 && i<=2 && j>=6 && j<=8 ){startWithX=0;endWithX=2;startWithY=6;endWithY=8;}
        else if( i>=3 && i<=5 && j>=0 && j<=2 ){startWithX=3;endWithX=5;startWithY=0;endWithY=2;}
        else if( i>=3 && i<=5 && j>=3 && j<=5 ){startWithX=3;endWithX=5;startWithY=3;endWithY=5;}
        else if( i>=3 && i<=5 && j>=6 && j<=8 ){startWithX=3;endWithX=5;startWithY=6;endWithY=8;}
        else if( i>=6 && i<=8 && j>=0 && j<=2 ){startWithX=6;endWithX=8;startWithY=0;endWithY=2;}
        else if( i>=6 && i<=8 && j>=3 && j<=5 ){startWithX=6;endWithX=8;startWithY=3;endWithY=5;}
        else if( i>=6 && i<=8 && j>=6 && j<=8 ){startWithX=6;endWithX=8;startWithY=6;endWithY=8;}

        int count=0;

        for( ; startWithX <= endWithX; startWithX++ )
            for(int y=startWithY ; y <= endWithY; y++ )
                if( board[startWithX][y] == charnumber )
                    count++;
        if(count==1)return true;
        return false;
    }

    public boolean isValidSudoku(char[][] board) {

        for( int i=0; i<board.length; i++ )
            for( int j=0; j<board[i].length; j++ )
                if( board[i][j] != '.' )
                    if( threeXthreeCheck( board, i, j, board[i][j] ) )
                    {
                        if ( plus9X9Check( board, i, j , board[i][j]) == false )return false;
                    }else return false;
        return true;
    }
}
