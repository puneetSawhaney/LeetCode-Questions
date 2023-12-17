// code by Puneet
// PLease visit explanation file to understand my approach.

class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for(int axis =0; axis <s.length(); axis++){
            int orbit=1;
            int len = 1;

            while(axis-orbit >= 0 && axis+orbit <= s.length()-1){
                
                if(s.charAt(axis-orbit) == s.charAt(axis+orbit)){
                    orbit++;
                    len+=2;
                }else{
                    break;
                }
            }
            if(len >result.length()){
                int startindex = axis-len/2;
                result=s.substring(startindex, startindex+len);
            }
        }

        for(int axis =0; axis <s.length()-1; axis++){
            int orbit=1;
            int len=0;

            while(axis-orbit+1 >= 0 && axis+orbit <= s.length()-1){
                
                if(s.charAt(axis-orbit+1) == s.charAt(axis+orbit)){
                    orbit++;
                    len+=2;
                }else{
                    break;
                }
            }
            if(len >result.length()){
                int startindex = axis-len/2 + 1;
                result=s.substring(startindex, startindex+len);
            }
        }
        return result;
    }
}
