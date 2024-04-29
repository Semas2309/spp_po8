import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};


        System.out.print("Введите число Shift: ");
        int shift = System.in.read();


        System.out.print("Исходный массив: ");
        printArray(array);

        shiftLeft(array, shift);

        System.out.print("Массив после сдвига на " + shift + " позиций влево:");
        printArray(array);
    }

    public static void shiftLeft(double[] array, int shift) {
        if (array == null || array.length == 0 || shift < 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        int effectiveShift = shift % array.length;
        double[] copy = array.clone();

        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + (array.length - effectiveShift)) % array.length;
            array[newIndex] = copy[i];
        }
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
