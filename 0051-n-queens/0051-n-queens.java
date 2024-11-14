class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        
        char[][] myBoard=new char[n][n];
        
        solve(myBoard,n,ans,0);
        
        return ans;
    }
    
    public void solve(char[][] myBoard,int n,List<List<String>> ans,int col){
        if(col==n){
            saveBoard(ans,myBoard);
            return;
        }
        
        for(int row=0;row<n;row++){
            if(isSafe(myBoard,col,row)){
                myBoard[row][col]='Q';
                solve(myBoard,n,ans,col+1);
                myBoard[row][col]='.';
            }
        }
    }
    
    public boolean isSafe(char[][] myBoard,int col,int row){
        //vertcal
        for(int i=0;i<myBoard.length;i++){
            if(myBoard[i][col]=='Q') return false;
        }
        
        //horizontal
        for(int i=0;i<myBoard.length;i++){
            if(myBoard[row][i]=='Q') return false;
        }
        
        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (myBoard[i][j] == 'Q') return false;
        }
        
        // Check lower-left diagonal
        for (int i = row, j = col; i < myBoard.length && j >= 0; i++, j--) {
            if (myBoard[i][j] == 'Q') return false;
        }
                
        return true;
    }
    
    public void saveBoard(List<List<String>> ans,char[][] myBoard){
        List<String> newBoard=new ArrayList<>();
        String row="";
        
        for(int i=0;i<myBoard.length;i++){
            row="";
            for(int j=0;j<myBoard[0].length;j++){
                if(myBoard[i][j]=='Q') row+="Q";
                else row+=".";
            }
            newBoard.add(row);
        }
        ans.add(newBoard);
    }
}