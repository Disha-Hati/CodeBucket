class Solution {
    public boolean solve(char[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                if(board[row][col]=='.'){
                    for(char val='1';val<='9';val++){
                        if(isValid(board,row,col,val)){
                            board[row][col]=val;
                            
                            if(solve(board)) return true;
                            else  board[row][col] = '.';
                        }
                    }
                     return false;
                }
            }
            
        }
        return true;
    }
    
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    public boolean isValid(char[][] board,int row,int col,char val){
        
        for(int i=0;i<board.length;i++){
            //vertical
            if(board[i][col]==val)  return false;
            
            //horizontal
            if(board[row][i]==val) return false;            
            
            //grid
            if(board[row/3*3 + i/3][col/3*3 + i%3] == val) return false;
        }
        
        return true;
    }
}