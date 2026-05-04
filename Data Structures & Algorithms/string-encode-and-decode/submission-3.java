class Solution {
public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();

    for (String cur : strs) {
        int l = cur.length();
        sb.append(String.format("%03d", l));  // 3‑digit length
        sb.append(cur);                       // actual string
    }

    return sb.toString();
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
