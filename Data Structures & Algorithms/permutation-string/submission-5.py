class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        a = [0]*26
        for i in s1:
            a[ord(i) - ord("a")]+=1
        
        l = 0
        r = 0
        
        while r < len(s2):
            if a[ord(s2[l]) - ord("a")] > 0:
                t = [x for x in a]
                while r - l + 1 <= len(s1):
                    if r == len(s2) or t[ord(s2[r])-ord("a")] == 0:
                        break
                    t[ord(s2[r])-ord("a")] -= 1
                    r+=1
                print(l,r)
                if r - l == len(s1):
                    return True
                else:
                    if l + 1 == r:
                        l = r
                    else:
                        l = r-1
                    r = l
            else:
                l+=1
                r+=1
        
        return False
