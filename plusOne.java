public class plusOne {
    public int[] solution(int[] digits) {

        int size = digits.length;
    
        for(int i = size-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
    
        int[] new_arr = new int[size+1];
        new_arr[0] = 1;
        return new_arr;
    }
}
