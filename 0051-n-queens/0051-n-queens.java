class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> boardAns=new ArrayList<>();
        
        char[][] board=new char[n][n];
        
        helper(boardAns,board,0);
        
        return boardAns;
    }
    
    public void helper(List<List<String>> boardAns,char[][] board,int col){
        if(col==board.length){
            saveBoard(board,boardAns);
            return;
        }
        
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(boardAns,board,col+1);
                board[row][col]='.';
            }
        }
    }
    
    public boolean isSafe(int row,int col,char[][] board ){
        //horizontal
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q') return false;
        }
        
        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q') return false;
        }
        
        //upper-left
        for(int r=row,c=col; r>=0 && c>=0 ; r--,c--){
            if(board[r][c]=='Q') return false;
        }
        
        //botton-left
        for(int r=row,c=col; r<board.length && c>=0 ; r++,c--){
            if(board[r][c]=='Q') return false;
        }
        
        return true;
    }
    
    public void saveBoard(char[][] board,List<List<String>> boardAns){
        String row="";
        List<String> newBoard=new ArrayList<>();
        
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
                
            }
            
            newBoard.add(row);
        }
        
        boardAns.add(newBoard);
    }
}