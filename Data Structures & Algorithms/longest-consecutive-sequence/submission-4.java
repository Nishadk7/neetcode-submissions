class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> t = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){t.add(nums[i]);}
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            if(!t.contains(nums[i] - 1)){ 
                int j = nums[i];
                while(t.contains(j)){t.remove(j);j++;}
                if(j - nums[i] > res){res = j-nums[i];}
            }
        }
        return res;
    }
}
