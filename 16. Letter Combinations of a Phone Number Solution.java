// code by Puneet
// visit explanation file to understand the solution
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        return getletterCombinations(digits, 0); // recusrion call
    }

    String[] codes ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   
    // 34 = dg, dh, di, eg, eh, ei, fg, fh, fi,
    // 2 = abc 
    //234 = 27 results a(result of 34), b(result of 34), c(result of 34)

    public List<String> getletterCombinations(String digits , int index){

        if(digits.length() == index){
            List<String> BaseResult = new ArrayList<>();
            BaseResult.add("");
            return BaseResult;
        } 
        List<String> Result = new ArrayList<>();
        List<String> getResult = getletterCombinations(digits, index+1);
         char ch = digits.charAt(index);
         String code = codes[ch - '0']; //abc

         for(String recString : getResult){     //dg, dh, di, eg, eh, ei, fg, fh, fi,
             for(int i =0; i < code.length(); i++){  //abc
                 char chCode = code.charAt(i);
                 Result.add(chCode + recString);
             }
         }
         return Result;
    }
}
