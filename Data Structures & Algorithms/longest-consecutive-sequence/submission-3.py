class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        sset = set()
        s = set(nums)
        if len(s) ==1 :
            return 1
        for i in nums:
            if i+1 in s and i-1 not in s:
                sset.add(i)

        cur = 0
        res = 0
        
        for i in sset:
            print(i)
            cur = 0
            while i in s:
                s.remove(i)
                i+=1
                cur+=1
            res = max(cur,res)
        return res

        