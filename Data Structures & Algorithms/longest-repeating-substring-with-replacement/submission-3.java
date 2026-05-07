class Solution {
    public int characterReplacement(String s, int k) {
        String p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int res = 0;
        for(char c : p.toCharArray()){
            int l = 0;
            int r = 0;
            int cur = 0;
            int last = -1;
            
            while(r < s.length()){
                if(s.charAt(r) == c){}
                else{
                    if(cur < k){cur+=1;}
                    else{
                        //res = Math.max(res,r-l);
                        boolean f = false;
                        while(!f){if(s.charAt(l) != c){f = true;};l+=1;}
                        //cur-=1;
                        
                    }
                }
                res = Math.max(res,r-l+1);
                r+=1;
                
            }
            
        }
        return res;
    }
}
