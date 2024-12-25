class Solution {
    public void setMatrixZeroes(int[][] mat) {
         int n = mat.length, m = mat[0].length;
        boolean[] rows = new boolean[n];    //to  store rows n colmns with zeroes
        boolean[] cols = new boolean[m];

//                  Matrix to fill rows[] and cols[]

        for (int i = 0,j=0; j < m; j++) {       //adjusted i and j in a single loop
                if (mat[i][j] == 0) {                
                    rows[i] = true;
                    cols[j] = true;
                }
               
                if(j==m-1){          // if statements to update i and j 
                    i++;
                    j=-1;
                }
                if(i>n-1){         // if statement for value of i
                 j=m+1;
                }
        }
        
        for (int i = 0,j=0; j < m; j++){   //set matrix elements to "0"  
                if (rows[i] || cols[j]) {        //if they belong to the "0" containing row or colmn
                    mat[i][j] = 0;
                }
            
                if(j==m-1){         // if statements to update i and j 
                    i++;
                    j=-1;
                }
                if(i>n-1)      //if statement for value of i
                j=m+1;
            
        }
    }
}
