class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int length = (int) (Math.log10(Math.abs(x)) + 1);
        int temp = x, temp2 = 0, last = 0;
        while(length > 0){
            last = temp % 10;
            temp2 = temp2 * 10 + last;
            temp /= 10;
            length--;
        }
        return (x == temp2)? true : false;
    }
}