class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int lar = arr[0];
        int tlar=-1;
        int i;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
                lar=arr[i];
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(lar!=arr[i])
            {
                if(arr[i]>tlar)
                {
                    tlar=arr[i];
                }
            }
        }
        return tlar;
    }
}
