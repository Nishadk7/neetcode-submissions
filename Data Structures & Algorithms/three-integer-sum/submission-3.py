class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        res = set()
        nums.sort()
        for i in range(n):
            for j in range(i+1,n):
                l = j+1
                r = n-1
                t = 0 - nums[i] - nums[j]
                while l <= r:
                    m = (l+r)//2
                    if nums[m] > t:
                        r = m-1
                    elif nums[m] < t:
                        l = m+1
                    else:
                        while m < n and nums[m] == t:
                            tt = tuple([nums[i],nums[j],nums[m]])
                            res.add(tt)
                            m+=1
                        break
                
        return list(res)
            