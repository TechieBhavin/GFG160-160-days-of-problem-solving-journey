class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

    int freq[] = new int[26];
    for(char ch: s1.toCharArray()){
        freq[ch -'a']++;
    }
     for(char ch: s2.toCharArray()){
        freq[ch -'a']--;
    }
    for(int i: freq){
        if(i!=0){
            return false;
        }
    }
    return true;
}
}
