package util;

public class Utils {
    public static boolean isEmptyStr(String name) {
        return ValidationHelper.isNonEmpty(name);
    }

    public static boolean isNegative(int num) {
        return !ValidationHelper.isPositive(num);
    }

    public static boolean isNegative(double num) {
        return !ValidationHelper.isPositive(num);
    }

    public static boolean isNegative(float num) {
        return !ValidationHelper.isPositive(num);
    }
}
