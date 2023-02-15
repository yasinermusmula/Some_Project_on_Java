package Algorithm;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("raceacar"));
    }

    public static boolean checkPalindrom(String word) {
        int x = word.length();
        for (int i = 0; i<x; i++){
            if (word.charAt(i) != word.charAt(x - 1)){
                return false;
            }
            x--;
        }
        return true;
    }
}
