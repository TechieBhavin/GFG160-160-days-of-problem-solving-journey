class Solution {
    public int kthMissing(int[] arr, int k) {
        int missingCount = 0;  // Count of missing numbers so far
        int prev = 0;         // Previous number, starts at 0
        
        for (int num : arr) {
            // Count missing numbers between prev and current number
            missingCount += num - prev - 1;

            // If kth missing is between prev and num
            if (missingCount >= k) {
                return num - (missingCount - k + 1);
            }
            
            prev = num; // Update previous number
        }
        
        // If kth missing is beyond the last array element
        return arr[arr.length - 1] + k - missingCount;
    }
}
