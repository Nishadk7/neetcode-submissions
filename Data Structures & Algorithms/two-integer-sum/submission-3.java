class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();

        for(int i = 0;i < nums.length;i++){
            a.put(nums[i],i);
        }

        for(int i =0; i<nums.length;i++){
            if (a.get(target-nums[i]) != null && a.get(target-nums[i]) != i){return new int[]{i, a.get(target- nums[i])};}
        }
        return new int[]{-1,-1};
    }
}