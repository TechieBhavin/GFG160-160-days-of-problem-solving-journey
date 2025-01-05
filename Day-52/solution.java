class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum<target){
                count+=(j-i);
                i++;
            }
            else if(sum>=target){
                j--;
            }
        }
        return count;
    }
}
