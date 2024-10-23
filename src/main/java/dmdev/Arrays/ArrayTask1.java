package dmdev.Arrays;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] value = {1, 5, 7, 9, 11};
        printArray(value);
        printArrayForeach(value);
        printArrayReverse(value);
    }

    public static void printArrayReverse(int[] values) {
        for (int i = values.length - 1; i >=0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayForeach(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
