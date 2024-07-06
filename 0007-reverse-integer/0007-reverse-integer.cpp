class Solution {
public:
    int reverse(int x) {
        long long reverse = 0;
        while(x){
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x =x/10;
        }
        if(reverse > INT_MAX || reverse < INT_MIN){
            return 0;
        }
        return reverse;
    }
};