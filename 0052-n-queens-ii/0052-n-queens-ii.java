class Solution {
     private int count=0;
    public int totalNQueens(int n) {
       
        
        char[][] myBoard=new char[n][n];
        
        solve(myBoard,n,0);
        
        
        
        return count;
    }
    
    public void solve(char[][] myBoard,int n,int col){
        if(col==n){
            count++;
            return;
        }
        
        for(int i=0;i<n;i++){
            if(isSafe(myBoard,i,col)){
                myBoard[i][col]='Q';
                solve(myBoard,n,col+1);
                myBoard[i][col]='.';
            }
        }
    }
    
    public boolean isSafe(char[][] myBoard,int row,int col){
        
        //horizontal
        for(int i=0;i<col;i++){
            if(myBoard[row][i]=='Q') return false;
        }
        
        //upper left
        for(int r=row,c=col;r>=0 && c>=0;r--,c--){
            if(myBoard[r][c]=='Q') return false;
        }
        
        // Check lower-left diagonal
        for (int r = row, c = col; r < myBoard.length && c >= 0; r++, c--) {
            if (myBoard[r][c] == 'Q') return false;
        }
        
        
        
        
        return true;
    }
}