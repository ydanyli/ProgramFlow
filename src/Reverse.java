
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {

        int digit;
        long temp = 0;

        while (x != 0) {
            digit = x % 10;
            temp = temp * 10 + digit;
            x = x / 10;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) return 0;

        return (int) temp;
    }
}
