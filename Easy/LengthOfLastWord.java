package Easy;

public class LengthOfLastWord {
    
    public static void main(String[] args) {

        // Solution in java to this LC difficulty easy

    }

    public static int lengthOfLastWord(String s) {
        
        if(s.length() == 0) return 0;

        s = s.trim(); // removing trailing and leading spaces

        int length = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') { // if we run into a space, immmediately break out of loop and return length
                break;
            }else {
                length++;
            }
        }

        return length;

    }

}
