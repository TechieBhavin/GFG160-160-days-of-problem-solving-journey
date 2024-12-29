
class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Set<Integer>set = new HashSet<>();
        for(int num:a){
            set.add(num);
        }
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0 ; i<b.length ; i++){
          if(set.contains(b[i])){
              list.add(b[i]);
              set.remove(b[i]);
          }
      }
      return list ; 
    }
}
