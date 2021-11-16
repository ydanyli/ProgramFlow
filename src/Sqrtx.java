public class Sqrtx {

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(-4));
        System.out.println(mySqrt(10));
        System.out.println(mySqrt(Integer.MAX_VALUE));
    }

    public static int mySqrt(int x) {
        return (int) Math.pow(x, 0.5);
    }
}
