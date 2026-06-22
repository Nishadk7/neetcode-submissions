class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0;i<position.length;i++){
            m.put(position[i],speed[i]);
        }

        Arrays.sort(position);
        for (int i = 0; i < position.length / 2; i++) {
            int temp = position[i];
            position[i] = position[position.length - 1 - i];
            position[position.length - 1 - i] = temp;
        }
        int res = 1;
        double curtime = (double)(target-position[0])/m.get(position[0]);

        for(int i = 1;i<position.length;i++){
                double newcur = (double)(target-position[i])/m.get(position[i]);
                if(newcur > curtime){
                    res+=1;
                    curtime = newcur;
                }
        }
        return res;
    }
}
