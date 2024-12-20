class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
    
        
        int m = a.length;
        int n = b.length;
        
        int left = m-1; 
        int right = 0;
        
        while(left >=0 && right < n && a[left] > b[right]){
           
                
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;
            
                left --;
                right ++;
        }
            
            
            Arrays.sort(a);
            Arrays.sort(b);
    }
}
