class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
          HashSet<Integer> set = new HashSet<>();
      for(int val : arr){
          if(set.contains(target-val)){
              return true;
          }
          set.add(val);
      }
      return false;
    }
}
