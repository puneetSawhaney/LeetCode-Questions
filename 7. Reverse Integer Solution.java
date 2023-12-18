// code by puneet
// please visit explanation file to understand the approach I followed

class Solution {
    public int reverse(int x) {
        
       // int temp = 0;
        int reverse = 0;
        boolean neg = false;
        
        if(x < 0){
            neg = true;
            x =-x;
        }
        while(x >0){
            if((reverse>Integer.MAX_VALUE/10)||(reverse<Integer.MIN_VALUE/10)){
                return 0;
            }
            int rem= x%10;
            reverse = reverse * 10 + rem; 
            x = x/10;
        }
        if(neg){
            reverse = -reverse;
        }
        return reverse;

    }
}
