class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        a = dict()

        res = 0

        l = 0
        r = 0
        while r < len(s):
            if a.get(s[r],-1) >= l:
                res = max(r-l, res)
                l = a.get(s[r]) + 1
                a[s[r]] = r
                r+=1
            else:
                a[s[r]] = r
                r+=1
        
        res = max(r-l,res)
        return res



        