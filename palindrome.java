public class palindrome {
    public static void main(String[] args) {
        int myNum = 121;
        System.out.println("Is this a palindrome? " + isPalindrome(myNum));
    }
    public static boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
       
        if(x < 0 || x % 10 == 0) {
            return false;
        }
       
        int reverse = 0;
        int originalNumber = x;
        while(x != 0) {
            int lastDigit = x % 10; // 1 ---> 2 ---> 1
            reverse = (reverse * 10) + lastDigit;  // 1 ---> + 2 ---> 1
            x /= 10; // 12 --- > 1 ---> 0
        }
       
        return reverse == originalNumber;
       
    }

}
