class Solution {

    public int maxWater(int arr[]) {
        // Code Here 
        int A=0;

        int left=0,right=arr.length-1;

        while(left<=right){

            int w=right-left;

            int h=Math.min(arr[left],arr[right]);

            A=Math.max(A,w*h);

            if(arr[left]<arr[right]){

                left++;

            }

            else{

                right--;

            }

        }

        return A;
    }
}
