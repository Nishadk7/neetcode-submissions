class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> t = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i<temperatures.length;i++){
            if(i==0){
                t.push(i);
            }
            else{
                if(temperatures[t.peek()] < temperatures[i]){
                    while(!t.empty() && temperatures[t.peek()] < temperatures[i]){res[t.peek()] = i - t.peek();t.pop();}
                    t.push(i);
                }
                else{
                    t.push(i);
                }
            }

        }
        //while(!t.empty()){res[t.peek()] = 0;t.pop();}
        return res;
    }
}
