class Solution {
    public void markRow(int i,int[][] matrix){
        for(int j=0;j<matrix[i].length;j++){
           if(matrix[i][j]!=0){
                matrix[i][j]=987165;
           }
        }
    }
    
    public void markCol(int j,int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=987165;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    markRow(i,matrix);
                    markCol(j,matrix);
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==987165){
                    matrix[i][j]=0;
                }
            }
        }
    }
}