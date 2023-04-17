package Easy;

public class ValidPalindrome {
    
    public static void main(String[] args) {
        // Using 2 pointer method
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is this a vlid Palindrome? " + isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        String myString = "";

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c) || Character.isLetter(c)) {
                myString += c;
            }
        }
        
        myString = myString.toLowerCase();

        int a_pointer = 0;
        int b_pointer = myString.length() - 1;

        while(a_pointer <= b_pointer) {
            if(myString.charAt(a_pointer) != myString.charAt(b_pointer)) {
                return false;
            }
            a_pointer++;
            b_pointer--;
        }

        return true;
    }

}
