class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] a = new int[26];
        if(s1.length() > s2.length()) return false;

        for(int i = 0;i<s1.length();i++){a[s1.charAt(i) - 'a']+=1;}
        
        int l = 0;
        int r = 0;

        int[] c = new int[26];
        for(int i = 0;i<s1.length();i++){c[s2.charAt(i) - 'a']+=1;r+=1;}
        r-=1;
        while (r < s2.length()){
            //System.out.println("l = " + l + ", r = " + r);
            //System.out.println(Arrays.toString(c));
            boolean f = true;
            for(int i = 0;i<26;i++){f = f && (c[i] == a[i]);}
            if(f){return f;}
            else{
                c[s2.charAt(l)-'a']-=1;
                l+=1;
                r+=1;
                if(r == s2.length()){return false;}
                c[s2.charAt(r) - 'a']+=1;
            }
        }
        return false;



    }
}
