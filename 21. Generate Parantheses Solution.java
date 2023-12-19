// code by Puneet 
// please visit to explanation file of this code to understand the approach

class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String>[] dp = new List[n+1];

        dp[0] = Arrays.asList("");
        dp[1] = Arrays.asList("()");

        for(int i =2; i <=n; i++){
            dp[i] = new ArrayList<>();

            int inner =0;
            int outer = i-1;

            while(inner <= i-1 && outer >= 0){
                for (String in: dp[inner]){
                    for(String out: dp[outer]){
                        StringBuilder sb = new StringBuilder();
                        sb.append("(");
                        sb.append(in);
                        sb.append(")");
                        sb.append(out);
                        
                        dp[i].add(sb.toString());
                    }
                }
                inner++;
                outer--;
            }
        }
        return dp[n];
    }
}
