class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        r = prices[0]
        res = 0
        for i in prices:
            r = min(r,i)
            res = max(res, i-r)
        
        return res