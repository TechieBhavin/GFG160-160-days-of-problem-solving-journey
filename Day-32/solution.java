class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:a)
        list.add(i);
        for(int i:b)
        list.add(i);
        Collections.sort(list);
        int ele=list.get(k-1);
        return ele;
    }
}
