public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        // Need to get rid of any spaces from the front and the back
        s = s.trim();
        // Initializing i to begin at the end of the string to work backwords
        int i = s.length() -1;
        int len = 0;
        while (i >=0 && s.charAt(i) == ' ') {
            i --;
        }
        while (i >=0) {
            if (s.charAt(i) == ' ') {
                break;
            }
            i --; len ++;
        }
        System.out.println("Length: " + len); // 4
    }
    
}
