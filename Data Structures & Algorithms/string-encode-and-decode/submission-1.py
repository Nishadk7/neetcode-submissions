class Solution:

    def encode(self, strs: List[str]) -> str:
        s = chr(129)
        for i in strs:
            s = s + i
            s = s+chr(129)
        print(s)
        return s
        

    def decode(self, s: str) -> List[str]:
        res = []
        i = 0
        print(s)
        while i < len(s):
            if ord(s[i]) == 129:
                n = ""
                i+=1
                if i == len(s):
                    return res
                while  ord(s[i])!=129:
                    n = n + s[i]
                    i+=1
                res.append(n)
            else:
                i+=1
        return res

