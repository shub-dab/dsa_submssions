class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int ans[] = new int[size];

        int freq[] = new int[101];
        int count[] = new int[101];

        for(int i=0; i<size; i++) {
            freq[nums[i]]++;
        }

        for(int i=1; i<count.length; i++) {
            count[i] = count[i-1] + freq[i-1];
        }

        for(int i=0; i<size; i++) {
            ans[i] = count[nums[i]];
        }

        return ans;
    }
}