class Solution{
    public int maxSubarrayLength(int[] nums, int k) {
        int l = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
       
        int r = 0;
        int ans = 0;
        while (r < nums.length) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
            //             l and r define a window that expands as r iterates through nums.
            // A HashMap (freq) keeps track of the frequency of each number in the window.
            // If nums[r] appears more than k times, shrink the window by moving l forward.
            // The maximum valid subarray length is updated in ans
            while (freq.get(nums[r]) > k) {
                freq.put(nums[l], freq.get(nums[l]) - 1);

                if (freq.get(nums[l]) == 0) {
                    freq.remove(nums[l]);
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}