class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        // for (int row[]: mat) if (Arrays.binarySearch(row, x) >= 0) 
        //     return true;
        // return false;
        int n = mat.length, m = mat[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j]==x)
                    return true;
            }
        }
        return false;
    }
}
