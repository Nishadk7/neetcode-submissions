class Solution {

    public int[] coord(int mid, int[][] matrix){
        int n = matrix[0].length;
        return new int[]{mid/n,mid%n};
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        

        int l = 0;
        int r = matrix.length * matrix[0].length - 1;

        int m = 0;
        
        while(l <= r){
            m = (l+r)/2;
            int[] ll = new int[2]; 
            ll = coord(m,matrix);
            int c = matrix[ll[0]][ll[1]]; 
            //System.out.println(c);
            if(c == target){return true;}
            else if(c < target){l = m+1;}
            else{r = m-1;}
        }
        return false;

    }
}
