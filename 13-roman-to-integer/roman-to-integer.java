class Solution {
    public int romanToInt(String str) {
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;
        int i = 0;
        for (; i < str.length() - 1; i++) {
            if (m.get(str.charAt(i)) >= m.get(str.charAt(i + 1))) {
                ans += m.get(str.charAt(i));
            } else {
                ans += m.get(str.charAt(i + 1)) - m.get(str.charAt(i));
                i++;
            }
        }

        if (i == str.length() - 1) ans += m.get(str.charAt(i));
        return ans; 
    }
}