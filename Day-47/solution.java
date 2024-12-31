class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
               int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        
         int longest=1;
         for(int it:set){
             if(!set.contains(it-1)){
                 int x=it;
                 int count=1;
                 while(set.contains(x+1)){
                     count++;
                     x=x+1;
                 }
                 longest=Math.max(count,longest);
             }
         }
         
        return longest;
    }
}
