// Return the number of times that the string "hi" appears anywhere in the given string.


public class CountHi {
    public static int countHi(String str) {
        int count = 0;
        char[] counter = str.toCharArray();
        for (int i = 0; i < counter.length -1; i++) {
            if (counter[i] == 'h' && counter[i+1] == 'i') {
                count++;
            }
        }
        return count;
    }
}
