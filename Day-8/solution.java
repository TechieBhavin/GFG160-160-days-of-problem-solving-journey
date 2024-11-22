class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int ans=0,st=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[st]){
                st=i;
            }
            else{
                ans=Math.max(ans, prices[i]-prices[st]);
            }
        }
        return ans;
    }
}
