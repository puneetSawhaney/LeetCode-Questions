// code by Puneet
// visit explanation file to understand the solution
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch =='('){
                st.push(ch);
            }else if(ch =='['){
                st.push(ch);
            }else if(ch =='{'){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size() == 0){
                    return false;
                }else if(st.peek() != '('){
                    return false;
                }else{
                    st.pop();
                }
            }else if(ch == ']'){
                if(st.size() == 0){
                    return false;
                }else if(st.peek() != '['){
                    return false;
                }else{
                    st.pop();
                }
            }else if(ch == '}'){
                if(st.size() == 0){
                    return false;
                }else if(st.peek() != '{'){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        if(st.size() > 0){
            return false;
        }else{
            return true;
        }
    }
}
