class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int max = 0;
        Arrays.sort(citations);
        for(int i=n-1; i>=0; i--){
            if(n-i<=citations[i])
            max=Math.max(max, n-i);
        }
        return max;
    }
}
