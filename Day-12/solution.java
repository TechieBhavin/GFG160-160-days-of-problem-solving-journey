solution 1:

class Solution {
    public int circularSubarraySum(int arr[]) {
        int s=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int curr=0;
        int currNeg=0;
        for(int i: arr){
            s+=i;
            curr=Math.max(curr+i,i);
            maxSum=Math.max(curr,maxSum);
            
            currNeg=Math.min(i,currNeg+i);
            minSum=Math.min(minSum,currNeg);
        }
        if(s==minSum){
            return maxSum;
        }
        return Math.max(maxSum,s-minSum);
    }
}

solution 2:

class Solution {

    public int circularSubarraySum(int arr[]) {
  
        int normalSum=maxSubarraySum(arr);
        if(normalSum<0)
        {
            return normalSum;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            arr[i]=-arr[i];
        }
        int circularSum=sum+maxSubarraySum(arr);
        int res=Math.max(circularSum,normalSum);
        return res;
    }
    public static int maxSubarraySum(int arr[])
    {
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum<0)
            {
                sum=0;
            }
            if(sum>res)
            {
                res=sum;
            }
        }
        return res;
    
        int s=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int curr=0;
        int currNeg=0;
        for(int i: arr){
            s+=i;
            curr=Math.max(curr+i,i);
            maxSum=Math.max(curr,maxSum);
            
            currNeg=Math.min(i,currNeg+i);
            minSum=Math.min(minSum,currNeg);
        }
        if(s==minSum){
            return maxSum;
        }
        return Math.max(maxSum,s-minSum);
    }
}
