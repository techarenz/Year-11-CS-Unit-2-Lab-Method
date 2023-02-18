public class Method {
    public static void main(String[] args) {
      
        int result = add(3, 8);
        System.out.println(result);

        int result2 = add(3, 8, 4, 9);
        System.out.println(result2);

        double halfValue = half(8);
        System.out.println(halfValue);

        int roundPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPositive);

        int roundNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNegative);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));
    }

    public static double half(int a) {
        return a / 2.0;
    }

    public static int roundPositiveValueToNearestInteger(double a) {
        return (int) (a + 0.5);
    }

    public static int roundNegativeValueToNearestInteger(double a) {
        return (int) (a - 0.5);
    }

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    public static String triple(String s) {
        return s + s + s;
    }
}
