class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(backTrack(board,word,i,j,0)) return true;
            }
        }
        
        return false;
    }
    
    public boolean backTrack(char[][] board, String word,int x,int y, int wordIndex){
        if(wordIndex==word.length()) return true;
        
        if(x<0 || x>=board.length || y<0 || y>=board[0].length || board[x][y]!=word.charAt(wordIndex)){
            return false;
        }
        
        char temp=board[x][y];
        board[x][y]='#';
        
        boolean found = backTrack(board, word, x + 1, y, wordIndex + 1) || // Down
                        backTrack(board, word, x - 1, y, wordIndex + 1) || // Up
                        backTrack(board, word, x, y + 1, wordIndex + 1) || // Right
                        backTrack(board, word, x, y - 1, wordIndex + 1);   // Left
        
        board[x][y] = temp;

        return found;
    }
}