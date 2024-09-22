public class Main {
    public static void main(String[] args) {
        String str = "HellolleH";
        if (isPalindromeUsingCharComparison(str)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }

    public static boolean isPalindromeUsingCharComparison(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}