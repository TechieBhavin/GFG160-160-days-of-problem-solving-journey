class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i;
        
        // Step 1: Find the largest index i such that arr[i] < arr[i + 1]
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
        }
        
        // If no such index is found, the array is in descending order, so reverse it
        if (i < 0) {
            reverse(arr, 0, n - 1);
            return;
        }
        
        // Step 2: Find the largest index j such that arr[j] > arr[i]
        int j;
        for (j = n - 1; j > i; j--) {
            if (arr[j] > arr[i]) {
                break;
            }
        }
        
        // Step 3: Swap arr[i] and arr[j]
        swap(arr, i, j);
        
        // Step 4: Reverse the sequence from i + 1 to end
        reverse(arr, i + 1, n - 1);
    }
    
    // Helper function to swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Helper function to reverse a portion of the array
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
