class Solution {
    public String toLowerCase(String s) {
        String ans = "";

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c >= 65 && c <= 90) {
                c += 32;
            }

            ans += c;
        }

        return ans;
    }
}