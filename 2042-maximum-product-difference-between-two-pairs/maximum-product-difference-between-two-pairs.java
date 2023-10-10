class Solution {
    public int maxProductDifference(int[] nums) {
        int temp[] = nums.clone();

        Arrays.sort(temp);
        int size = temp.length;

        int productMax = temp[size - 1] * temp[size - 2];
        int productMin = temp[0] * temp[1];

        int ans = productMax - productMin;

        return ans;
    }
}