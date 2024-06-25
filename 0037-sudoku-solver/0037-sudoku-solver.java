class Solution {
    
    public boolean helper(char[][] board){
        
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                if(board[row][col]=='.'){  //empty
                    for(char val = '1'; val <= '9'; val++){
                        if(isSafe(board,row,col,val)){
                            board[row][col] = val;
                            
                            if(helper(board)){
                                return true;
                            }else{  //backtrack
                               board[row][col] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isSafe(char[][] board,int row,int col,char val){
        for(int i=0;i<board.length;i++){
            //row
            if(board[row][i]==val) return false;
            
            //col
            if(board[i][col]==val)  return false;
            
            //grid
            if(board[row/3*3 + i/3][col/3*3 + i%3] == val) return false;
        }
        
        return true;
    }
    
    
    public void solveSudoku(char[][] board) {
        helper(board);
    }
}