class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        aj = []
        for i in range(n):
            aj.append([])
        for i in edges:
            aj[i[1]].append(i[0])
            aj[i[0]].append(i[1])
        

        def dfs(cur,par):
            nonlocal s,aj
            if cur in s:
                return True
            else:
                s.add(cur)
                for i in aj[cur]:
                    if i == par:
                        continue
                    if dfs(i, cur):
                        return True
                #s.remove(cur)
                return False
        s = set()

        return not dfs(0,-1) and len(s) == n

        