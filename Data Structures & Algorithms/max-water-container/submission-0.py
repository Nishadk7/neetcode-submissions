class Solution:
    def maxArea(self, nums: List[int]) -> int:
        l = 0
        r = len(nums) - 1
        res = 0

        while l<r:
            res = max(res, (r-l)*min(nums[l], nums[r]))
            if nums[l] < nums[r]:
                l = l+1
            elif nums[r] < nums[l]:
                r = r-1
            else:
                l+=1
                r-=1
        
        return res