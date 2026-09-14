class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int n = nums.length;
        int h = n-1;
        while(l<=h){
            int m = (h+l)/2;
            if(nums[m] == target) return m;
            if(nums[l] <= nums[m]){
                if(nums[l] <= target && target <= nums[m]){
                    h = m-1;
                }
                else{
                    l = m+1;
                }
            }
            else{
                if(nums[m] <= target && target <= nums[h]){
                    l = m+1;
                }
                else{
                    h = m-1;
                }
            }
        }
        return -1;
    }
}
