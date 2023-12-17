// Code by Puneet 
//PLease visit explaination section to understand the approach I followed to solev this problem statement.
class Solution {
    class Pair implements Comparable<Pair>{

        int val;
        int idx;

        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        public int compareTo(Pair o){
            return this.val- o.val;
        }
    }


    public int[] twoSum(int[] nums, int target) {

        Pair[] pairArray = new Pair[nums.length];

        for(int i =0; i <nums.length; i++){
            pairArray[i] = new Pair(nums[i], i);
        }

        Arrays.sort(pairArray);
        int li =0;
        int ri = nums.length-1;
        int[] res = new int[2];
        while(li<ri){
            int left = pairArray[li].val;
            int right = pairArray[ri].val;
            if(left+right < target){
                li++;
            }else if(left+right > target){
                ri--;
            }else{
                res[0]= pairArray[li].idx;
                res[1]= pairArray[ri].idx;
                break;
            }
        }
        return res;
    }
}
