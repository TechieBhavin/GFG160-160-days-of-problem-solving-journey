class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
             Set<Integer> set = new HashSet<>();
        for(int ele:a) set.add(ele);
        for(int ele:b) set.add(ele);
        
        return set.size();
    }
}
