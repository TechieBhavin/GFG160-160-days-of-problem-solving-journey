class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int rSum=0;
        for(int x: arr){
            rSum+=x;
        }
        
        int lSum=0;
        for(int i=0;i<arr.length;i++){
            rSum-=arr[i];
            if(lSum==rSum){
                return i;
            }else{
                lSum+=arr[i];
            }
        }
        
        return -1;
    }
}
