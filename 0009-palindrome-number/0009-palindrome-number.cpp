class Solution {
public:
    bool isPalindrome(int x) {
        int temp = x;
        long long reverse =0;
        while(temp>0){
            int lastDigit = temp % 10;
            reverse = reverse*10+lastDigit;
            temp /= 10;
            
            }
            if(reverse > INT_MAX || reverse < INT_MIN){
                return 0;
            }
            if(x == reverse){
                return true;
            }else{
                return false;
        }
    }
};