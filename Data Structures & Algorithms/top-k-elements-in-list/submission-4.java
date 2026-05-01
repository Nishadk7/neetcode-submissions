class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<List<Integer>> t = new ArrayList<>(nums.length + 1);
        
        for (int i = 0; i <= nums.length; i++) {
            t.add(new ArrayList<>());
        }
        Arrays.sort(nums);

        int i = 0;
        int c = -9999;
        int p = -9999;
        int curcont = 0;
        while (i < nums.length){
            c = nums[i];
            if(c == p || p == -9999){curcont++;}
            else{t.get(curcont).add(p);curcont = 1;}
            p = c;
            i++;
        }
        t.get(curcont).add(p);
        ArrayList<Integer> tt = new ArrayList<>();

        for(i = nums.length;i>=0;i--){
            List<Integer> o = t.get(i);
            if(o.size() + tt.size() <= k){tt.addAll(o);}
            else{while(o.size() > 0 && tt.size() < k){tt.add(o.remove(o.size() - 1));}}
            if (tt.size() == k){int[] res = new int[tt.size()];
for (int j = 0; j < tt.size(); j++) {
    res[j] = tt.get(j);
}
return res;}
        }
        int[] res = new int[tt.size()];
for (int j = 0; j < tt.size(); j++) {
    res[j] = tt.get(j);
}
return res;

    }
}
