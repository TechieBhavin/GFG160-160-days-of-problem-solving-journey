class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int st=0,end=0,ans=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=prices[end]){
                end=i;
            }
            else{
                ans+=prices[end]-prices[st];
                st=i;
                end=i;
            }
        }
        ans+=prices[end]-prices[st];
        return ans;
    }
}
