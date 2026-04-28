class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a = dict()

        for i in range(len(nums)):
            a[nums[i]] = i
        
        for i in range(len(nums)):
            if target - nums[i] in a and a[target-nums[i]] != i:
                return [i, a[target - nums[i]]]
        
        return [-1,-1]