class Solution:

    def encode(self, strs: List[str]) -> str:
        s = ""
        for i in strs:
            s += i
            s += "\n"
        return s

    def decode(self, s: str) -> List[str]:
        res = []
        cur = ""
        for i in s:
            if i == "\n":
                res.append(cur)
                cur = "" 
            else:
                cur += i
        return res
