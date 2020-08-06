// Given two strings, a and b, create a bigger string made of the first char of a,
// the first char of b, the second char of a, the second char of b, and so on.
// Any leftover chars go at the end of the result.

public class MixString {
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        if (a.length() >= b.length()) {
            for (int i = 0; i < a.length(); i++) {
                result.append(a.charAt(i));
                if (i <= b.length() -1) {
                    result.append(b.charAt(i));
                }
            }
        }
        if (a.length() < b.length()) {
            for (int i = 0; i < b.length(); i++) {
                if (i <= a.length() - 1) {
                    result.append(a.charAt(i));
                }
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }
}
