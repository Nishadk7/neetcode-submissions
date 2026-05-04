class Solution {
    public String encode(List<String> strs) {
        String res = "";
        for (int i = 0; i < strs.size(); i++) {
            String cur = strs.get(i);
            int l = cur.length();
            String pre = String.format("%03d", l);
            res = res + pre;
            res = res + cur;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<String>();
        for(int i = 0;i < str.length(); i+=0){
            String num = str.substring(i,i+3);
            int n = Integer.parseInt(num);
            String cur = str.substring(i+3,i+3+n);
            res.add(cur);
            i = i + 3 + n;
        }
        return res;
    }
}
