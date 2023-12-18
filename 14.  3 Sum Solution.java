// code by puneet
// please visit explanation file to understand the approach I followed

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums); // time : nlogn
        HashSet<Long> set = new HashSet<Long>();
        int Target =0;
        for(int i =0; i < nums.length; i++){
            int newTarget = Target - nums[i];

            int li = i +1;
            int ri =nums.length-1;
            while(li < ri){
                if(nums[li] + nums[ri] < newTarget ){
                    li++;
                }else if(nums[li] + nums[ri] > newTarget){
                    ri--;
                }else{
                    long hash = gethash(nums[i], nums[li], nums[ri]);
                    if(set.contains(hash) == false){
                        result.add(Arrays.asList(nums[i], nums[li], nums[ri]));
                        set.add(hash);
                    }
                    
                    li++;
                    ri--;
                }
            }
        }

    return result;
    }

    public long gethash(int x, int y, int z){
        long hash = x;
        hash *= 100000;
        hash += y;
        hash *= 100000;
        hash += z;

        return hash;
    }
}
