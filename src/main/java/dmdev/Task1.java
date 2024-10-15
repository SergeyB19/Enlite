package dmdev;

public class Task1 {
    public static void main(String[] args) {
        int value = 5;
        int result = factrorial(value);
        System.out.println(result);
        int i = factorialWhile(5);
        System.out.println(i);

    }


    public static int factrorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }

    public static int factorialWhile(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }

        return result;

    }
}
