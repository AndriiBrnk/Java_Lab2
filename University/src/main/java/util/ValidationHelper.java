package util;

public class ValidationHelper {
    static boolean isNonEmpty(String s) {
        return s != null && !s.isEmpty();
    }

    static boolean isPositive(int num) {
        return num > 0;
    }

    static boolean isPositive(float num){
        return num > 0;
    }

    static boolean isPositive(double num){
        return num > 0;
    }
}
