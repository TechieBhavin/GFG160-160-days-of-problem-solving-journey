class Solution {
    public void reverseArray(int arr[]) {
        // code here
         int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }
}
