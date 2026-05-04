class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        Arrays.fill(a, 1);
        int c = 1;
        for(int i = 0;i<nums.length;i++){a[i] *= c; c *=nums[i]; }
        c = 1;
        for(int i = nums.length - 1;i>-1;i--){a[i] *= c; c *=nums[i]; }
        return a;
    }

}  
