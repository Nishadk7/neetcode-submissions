class Solution {


    public boolean searchMatrix(int[][] matrix, int target) {
        

        int l = 0;
        int r = matrix.length * matrix[0].length - 1;
        int n = matrix[0].length;
        int m = 0;
        
        while(l <= r){
            m = (l+r)/2;
            if(matrix[m/n][m%n] == target){return true;}
            else if(matrix[m/n][m%n] < target){l = m+1;}
            else{r = m-1;}
        }
        return false;

    }
}
