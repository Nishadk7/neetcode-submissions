class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = {}

        for i in nums:
            counts[i] = counts.get(i, 0) + 1
        
        freq = [[] for _ in range(len(nums)+1)]
        print(freq)
        for i,j in counts.items():
            freq[j].append(i)
        res = []
        for i in range(len(nums), 0, -1):
            for j in freq[i]:
                res.append(j)
                if len(res) == k:
                    return res
