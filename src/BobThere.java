public class BobThere {
    public static boolean bobThere(String str) {
        boolean contains = false;
        for (int i = 0; i < str.length() -2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b') {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
