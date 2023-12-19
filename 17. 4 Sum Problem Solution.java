// code by Puneet
// visit explanation file to understand the solution

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int res = 0;
        HashSet<String> Unique = new HashSet<>();
        for(int i =0; i < nums.length-3; i++){
            for(int j =i+1; j < nums.length-2; j++){
                int li = j+1;
                int ri = nums.length-1;

                while(li<ri){
                    long sum = nums[i];
                    sum += nums[j] ;
                    sum += nums[li]; 
                    sum +=nums[ri];

                    if(sum < target){
                        li++;
                    }else if(sum > target){
                        ri--;
                    }else{
                        StringBuilder sb = new StringBuilder();
                        sb.append(nums[i]);
                        sb.append(nums[j]);
                        sb.append(nums[li]);
                        sb.append(nums[ri]);
                        String code = sb.toString();
                        if(Unique.contains(code)== false){
                            Unique.add(code);
                            result.add(Arrays.asList(nums[i], nums[j], nums[li], nums[ri]));
                        }
                        
                        li++;
                        ri--;
                    }

                }
            }
        }
    return result;
    }
}
