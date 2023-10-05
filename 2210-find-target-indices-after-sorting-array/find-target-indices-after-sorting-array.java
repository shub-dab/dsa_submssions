class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<Integer>();

        int start = 0;
        int end = nums.length - 1;

        int potStart = -1;

        while(start<=end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                // return mid;
                potStart = mid;
                end = mid -1;
            }

            else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if(potStart == -1) {
            return ans;
        }

        start = 0;
        end = nums.length - 1;
        int potEnd = -1;

        while(start<=end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                // return mid;
                potEnd = mid;
                start = mid + 1;
            }

            else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        while(potStart <= potEnd) {
            ans.add(potStart++);
        }
       
        return ans;
    }
}