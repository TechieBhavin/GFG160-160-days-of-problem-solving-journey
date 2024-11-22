class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
       ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            nums.add(arr[i]);
        }
        d = d % nums.size();
        Collections.reverse(nums.subList(0, d));
        Collections.reverse(nums.subList(d, nums.size()));
        Collections.reverse(nums);
        for(int i = 0; i < nums.size(); i++){
            arr[i] = nums.get(i);
        }
    }
}
