class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] d = new int[128];
        Arrays.fill(d,-1);
        int l = 0;
        int r = 0;
        int res = 0;

        while(r<s.length()){
            if(d[s.charAt(r)] >= l){
                res = Math.max(res,r-l);
                l = d[s.charAt(r)] + 1;
                
            }
            d[s.charAt(r)] = r;
            r+=1;
        }
        res = Math.max(res,r-l);
        return res;
    }
}
