// Return true if the given string contains an appearance of "xyz"
// where the xyz is not directly preceeded by a period (.).

public class XYZThere {
    public static boolean xyzThere(String str) {
        boolean contains = false;
        for (int i = 0; i < str.length() -2; i++) {
            if (str.charAt(i) == '.') {
                i++;
            }
            else if (str.substring(i, i+3).equals("xyz")) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
