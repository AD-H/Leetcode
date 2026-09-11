class Solution {
    public int lowerBound(int [] arr,int x){
        int l = 0;
        int h = arr.length-1;
        int n = arr.length;
        int ans = n;
        while(l<= h){
            int m = l+(h-l)/2;
            if(arr[m] >= x){
                ans =  m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
    public int upperBound(int [] arr,int x){
        int l = 0;
        int h = arr.length-1;
        int n = arr.length;
        int ans = n;


        while(l<= h){
            int m = l+(h-l)/2;
            if(arr[m] > x){
                ans =  m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums,target);
        int ub = upperBound(nums,target);
        if(lb == nums.length || nums[lb] != target) return new int[] {-1,-1};
        return new int[] {lb,ub-1};
    }
}
