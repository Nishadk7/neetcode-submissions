class Solution:
    def isPalindrome(self, s: str) -> bool:
        def proc(s):
            procdi = ""
            for i in s:
                if i.isalnum():
                    procdi += i.lower()
                    
            
            return procdi
        
        procdi = proc(s)
        
        for i in range(len(procdi)):
            if procdi[i] != procdi[-1*i-1]:
                return False
            
        return True