class Solution {
    void swap(int i,int j, int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sort012(int[] arr) {
      int n=arr.length;
      int left=0;
      int mid=0;
      int right=n-1;
      while(mid<=right){
          if(arr[mid]==0){
             swap(left,mid,arr);
             left++; 
             mid++;
          }else if(arr[mid]==1){
              mid++;
          }else {
              swap(mid,right,arr);
              right--;            
          }
      }
    }
}
