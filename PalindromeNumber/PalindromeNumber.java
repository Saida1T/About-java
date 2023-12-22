public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        // Пример использования:
        int number = 121;
        boolean result = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }
}