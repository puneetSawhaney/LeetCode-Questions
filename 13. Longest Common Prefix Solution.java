// code by puneet
// please visit explanation file to understand the approach I followed

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0){
            return "";
        }

        int prefix = 0;

        while(true){
            if(prefix < strs[0].length()){
                boolean CharMatched = true;
                char ch = strs[0].charAt(prefix);
                for(int i = 0; i <strs.length; i++){
                    if(prefix < strs[i].length()  && strs[i].charAt(prefix) == ch){
                        // nothing to do here
                        // it just checked whether the character matched with other string's'char  or not
                    }else{
                        CharMatched = false;
                        break;
                    }
                }
                if(CharMatched){
                    prefix++;
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return strs[0].substring(0, prefix);
    }
}
