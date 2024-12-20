class Solution {

    public int peakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
    
            // If the middle element is less than its next element,
            // then the peak lies on the right half.
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                // Otherwise, the peak lies on the left half (including mid).
                right = mid;
            }
    }
    
    // At the end of the loop, left == right, which is the peak index.
    return left;
}

}
