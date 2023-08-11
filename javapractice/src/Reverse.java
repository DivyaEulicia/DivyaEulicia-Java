public class Reverse {
    public static void main(String[] args) {
        String str = "google";
        String rev = " ";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
    }
}