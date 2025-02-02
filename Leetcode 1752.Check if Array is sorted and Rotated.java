class Solution {
    public boolean check(int[] nums) {
        int count=0;
        if(nums.length<=1){
            return true;
        }
        //Time Complexity:
        //The solution runs in O(n) time, as it iterates through the array once.
        //Space complexity is O(1) since only a few integer variables are used.
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
            //The expression nums[(i + 1) % nums.length] ensures that nums[nums.length - 1] (last element) is compared with nums[0] (first element), completing the rotation check.
        }
       
        return count<=1;
    }
}