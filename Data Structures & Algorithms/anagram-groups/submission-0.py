class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        def hash(i):
            h = [_ for _ in range(26)]
            for j in i:
                h[ord(j) - ord("a")]+=1
            return tuple(h)
        
        a = dict()
        for i in strs:
            hashed = hash(i)
            if hashed in a:
                a[hashed].append(i)
            else:
                a[hashed] = []
                a[hashed].append(i)
        
        return list(a.values())