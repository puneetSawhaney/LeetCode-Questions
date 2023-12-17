// code by Puneet
// PLease visit explaination file to know what kind of approach I have followed

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLen=0;
        int curLen=0;

        boolean[] set = new boolean[256];

        int i =0;
        int j =-1;

//duplicacy found then release all the occurences from start before duplicate char
        while(i < s.length()){
            char c_acquire = s.charAt(i);

            while(set[c_acquire] == true){
                j++;
                char c_release= s.charAt(j);
                set[c_release] = false;
            }
            // acquire char
            set[c_acquire] = true;
            //update length
            curLen = i-j;
            if(curLen> maxLen){
                maxLen = curLen;
            }
            i++;
        }
        return maxLen;
    }
}
