class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int j ;
        int k ;
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i < n-2){
            j = i+1;
            k = n-1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] < 0){j+=1;}
                else if(nums[i] + nums[j] + nums[k] > 0){k-=1;}
                else{
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j+=1;
                    k-=1;
                    int a = nums[j-1];
                    int b = nums[k+1];
                    while(j < k && a == nums[j]){j++;}
                    while(k > j && b == nums[k]){k--;}
                }
            }
            i++;
            while(i<n-2 && nums[i] == nums[i-1]){i++;}
        }
        return res;
    }
}
