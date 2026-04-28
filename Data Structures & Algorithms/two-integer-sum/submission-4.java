class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();

        for(int i = 0;i < nums.length;i++){
            a.put(nums[i],i);
        }

        for(int i =0; i<nums.length;i++){
            Integer x = a.get(target-nums[i]);
            if (x != null && x != i){return new int[]{i,x};}
        }
        return new int[]{-1,-1};
    }
}