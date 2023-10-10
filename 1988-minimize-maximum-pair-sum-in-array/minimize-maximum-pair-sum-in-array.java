class Solution {
    public int minPairSum(int[] nums) {
        int temp[] = nums.clone();

        Arrays.sort(temp);

        int left = 0;
        int right = temp.length - 1;

        int ans = 0;
        for(; left < right; left++, right--) {
            int sum = temp[left] + temp[right];

            if(sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}