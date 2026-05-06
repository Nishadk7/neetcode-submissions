class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int[] res = new int[2];
        while(l < r){
            if(nums[l] + nums[r] < target){l+=1;}
            else if(nums[l] + nums[r] > target){r-=1;}
            else{res[0] = l+1;res[1]=r+1;return res;}
        }
        return res;
    }
    
}
