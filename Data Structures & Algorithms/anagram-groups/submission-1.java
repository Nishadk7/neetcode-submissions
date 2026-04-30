class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> m = new HashMap<String, ArrayList<String>>();
        
        for(String s : strs){
            int[] a = new int[26];
            
            for(int i = 0; i<s.length(); i++){
                a[s.charAt(i) - 'a']+=1;
            }
            String x = Arrays.toString(a);
            if(m.get(x)!=null){
                m.get(x).add(s);
            }
            else{
                ArrayList<String> t = new ArrayList<String>();
                t.add(s);
                m.put(x,t);
            }

        }
        List<List<String>> result = new ArrayList<>(m.values());
        return result;
    }
}
