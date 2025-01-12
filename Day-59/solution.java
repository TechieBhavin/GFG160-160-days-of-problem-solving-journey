class Solution {
    public int maxWater(int arr[]) {
        // code here
        int size=arr.length;
        int leftToRightGreaterElements[] = new int[size];
        int rightToLeftGreaterElements[] = new int[size];
        leftToRightGreaterElements[0] = arr[0];
        for(int i=1;i<size;i++)
        {
            leftToRightGreaterElements[i] = Math.max(leftToRightGreaterElements[i-1],arr[i]);
        }
        
        rightToLeftGreaterElements[size-1] =  arr[size-1];
        for(int i=size-2; i>= 0; i--)
        {
            rightToLeftGreaterElements[i] = Math.max(rightToLeftGreaterElements[i+1],arr[i]);
        }
        int totalWaterTrapped=0;
        for(int i=0;i<size;i++)
        {
            int waterTrappedAtThisPosition=Math.min(rightToLeftGreaterElements[i], leftToRightGreaterElements[i])
            -arr[i];
            totalWaterTrapped+= waterTrappedAtThisPosition;
        }
        
        return totalWaterTrapped;
    }
}
