class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        adj = []
        s = set()

        for i in range(n):
            adj.append([])
            for j in range(n):
                adj[i].append(-1)
        

        for i in edges:
            adj[i[0]][i[1]] = 1
            adj[i[1]][i[0]] = 1

        
        def dfs(i):
            key = i

            if key not in s:
                s.add(key)
                for j in range(n):
                    if adj[i][j] == 1:
                        dfs(j)
        
        res = 0
        for i in range(n):
            if i not in s:
                dfs(i)
                res+=1
        return res