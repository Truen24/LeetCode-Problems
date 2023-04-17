package Easy;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println("True or false: " + isAnagram(s, t));
        
    }

    public static boolean isAnagram(String s, String t) {
        // first lets check if the strings are equal in length right off the bat
        if(s.length() != t.length()) return false;

        // now lets make a HashMap of Character,Integer to keep track of the characters
        HashMap<Character, Integer> myMap = new HashMap<>();

        // now lets add the letters from String 's' into our hashmap

        for(int i = 0; i < s.length(); i++) {
            // creating a char variable so we don't have to keep typing out s.charAt(i) etc
            char c = s.charAt(i);
            // Need to check if character is already in our map, if so, increase count by 1
            if(myMap.containsKey(c)) {
                myMap.put(c, myMap.get(c)+1);
            }else{
                myMap.put(c, 1);
            }
        }

        // now we're going to loop through again remove characters based on the String 't'
        for(int i = 0; i < t.length(); i++) {
            // creating same char variable
            char c = t.charAt(i);
            // Going to be alittle different, going to have two if conditions to check
            // if it A. Contains the key and B. if that key's value is equal to 1
            // if it's equal to 1, we're going to remove it, otherwise subtract 1 from it's value
            // finally, else return false because at that point it's not an anagram
            if(myMap.containsKey(c)) {
                if(myMap.get(c) == 1) {
                    myMap.remove(c);
                }else {
                    myMap.put(c, myMap.get(c)-1);
                }
            }else {
                return false;
            }
    
        }
        return true;
    }
    
}
