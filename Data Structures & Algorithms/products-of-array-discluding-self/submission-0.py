class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre = [1]*len(nums)
        post = [1]*len(nums)
        a = 1
        if len(nums) <= 1:
            return nums
        for i in range(len(nums)):
            a = a*nums[i]
            pre[i] = a
        a = 1
        for i in range(len(nums)-1, -1, -1):
            a = a*nums[i]
            post[i] = a
        
        res = [1]*len(nums)

        for i in range(1, len(nums)-1):
            res[i] = pre[i-1]*post[i+1]
        
        res[0] = post[1]
        res[-1] = pre[-2]

        return res

        