public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(2147483647));
    }

    public static boolean isPalindrome(int x) {
        int digit;
        int sum = 0;
        int temp;

        temp = x;
        while (temp > 0) {
            digit = temp % 10;
            sum = (sum * 10) + digit;
            temp = temp / 10;
        }
        return x == sum;
    }
}
