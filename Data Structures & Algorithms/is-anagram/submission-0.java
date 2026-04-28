class Solution {
    public boolean isAnagram(String s, String t) {
        

        if(s.length()!=t.length()){return false;}
        HashMap<Character, Integer> a = new HashMap<Character, Integer>();
        HashMap<Character, Integer> b = new HashMap<Character, Integer>();

        for(int i = 0;i<s.length();i++){
            int x = 0;
            char c = s.charAt(i);
            if(a.containsKey(c)){x = a.get(c);}
            a.put(c,x+1);
        }
        for(int i = 0;i<s.length();i++){
            int x = 0;
            char c = t.charAt(i);
            if(b.containsKey(c)){x = b.get(c);}
            b.put(c,x+1);
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}
