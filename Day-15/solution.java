class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder ans = new StringBuilder();
        int carry = 0;

        int i = s1.length() - 1, j = s2.length() - 1;

        while (i >= 0 || j >= 0) {

            int n1 = i >= 0 ? s1.charAt(i--) - '0' : 0;
            int n2 = j >= 0 ? s2.charAt(j--) - '0' : 0;
            int sum = n1 + n2 + carry;

            ans.append(sum % 2);
            carry = sum / 2;
        }
        ans.append(carry);
        ans.reverse();
        int x = 0;
        while (ans.charAt(x) == '0'){
            x++;
        }
        
        return ans.substring(x);
    }
}
