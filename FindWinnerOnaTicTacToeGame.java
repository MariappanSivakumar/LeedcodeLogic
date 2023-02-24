/*
Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of Tic-Tac-Toe are:

Players take turns placing characters into empty squares ' '.
The first player A always places 'X' characters, while the second player B always places 'O' characters.
'X' and 'O' characters are always placed into empty squares, never on filled ones.
The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
The game also ends if all squares are non-empty.
No more moves can be played if the game is over.
Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that the ith move will be played on grid[rowi][coli]. return the winner of the game if it exists (A or B). In case the game ends in a draw return "Draw". If there are still movements to play return "Pending".

You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe), the grid is initially empty, and A will play first.

 

Example 1:


Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
Output: "A"
Explanation: A wins, they always play first.
Example 2:


Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
Output: "B"
Explanation: B wins.
Example 3:


Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
Output: "Draw"
Explanation: The game ends in a draw since there are no moves to make.
*/

class Solution {
    String result = "Draw";
    public String tictactoe(int[][] moves) {

        if(moves.length < 5) return "Pending";
        char board[][] = new char[3][3];
        boolean flag = true;

        for(int i=0;i<moves.length;i++) {
            board[moves[i][0]][moves[i][1]] = flag ? 'X' : 'O';
            flag = !flag;
        }

        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2]=='X') {
            return "A";
        } else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2]=='O') {
            return "B";
        } 

        if(board[0][2] =='X' && board[1][1] =='X' && board[2][0] =='X') {
            return "A";
        } else if(board[2][0] == 'O' && board[1][1] =='O' && board[0][2] == 'O'){
            return "B";
        }


        for(int i=0;i<3;i++) {

            int lMoveX = 0, lMoveO = 0;
            int rMoveX = 0, rMoveO = 0;

            for(int j=0;j<3;j++) {
                if(board[i][j] == 'X') {
                    lMoveX++;   
                } else if(board[i][j] == 'O') {
                    lMoveO++;
                }
                if(board[j][i] == 'X') {
                    rMoveX++;
                } else if(board[j][i] == 'O') {
                    rMoveO++;
                }
            }
            if(lMoveX == 3 || rMoveX == 3) {
                return "A";
            } 
            if(lMoveO == 3 || rMoveO==3) {
                return "B";
            }
        }
        
        return moves.length==9 ? result : "Pending";
    }
}
