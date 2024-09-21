public class Main {
    public static void main(String[] args) {
        String str = "HellolleH";
        if (isPalindromeUsingStringBuilder(str)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }

    public static boolean isPalindromeUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        return str.equals(reversedStr);
    }
}

