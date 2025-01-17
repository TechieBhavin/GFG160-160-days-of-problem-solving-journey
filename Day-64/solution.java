class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
         int n = arr.length;
        int[] res = new int[n];

        // Step 1: Calculate prefix products
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        // Step 2: Calculate suffix products and final result
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = prefix[i] * suffix;
            suffix *= arr[i]; // Update suffix product
        }

        return res;
    }
}
