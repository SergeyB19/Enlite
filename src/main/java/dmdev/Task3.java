package dmdev;

public class Task3 {
    public static void main(String[] args) {
        double sourceSum = 24;
        sum(sourceSum);
    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2024; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + " : " + result);
        }
        return result;
    }
}
