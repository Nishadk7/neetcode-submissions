class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        l = 0
        r = n - 1

        for i in range(len(nums)-1):
            l = i+1
            r = len(nums)-1
            t = target - nums[i]
            while l <= r:
                m = (l+r)//2

                if nums[m] > t:
                    r = m-1
                elif nums[m] < t:
                    l = m+1
                else:
                    return [i+1,m+1]
        return [-1,-1]


        
        