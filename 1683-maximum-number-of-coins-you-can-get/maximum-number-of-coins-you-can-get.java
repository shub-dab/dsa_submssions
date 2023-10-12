class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int n = piles.length/3;
        int end = piles.length - 2;

        int ans = 0;

        while(n > 0) {
            ans += piles[end];
            end -= 2;
            n--;
        }

        return ans;
    }
}