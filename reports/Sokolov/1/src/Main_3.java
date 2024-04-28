import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        String result = xor(str1, str2);

        System.out.println("Результат операции XOR: " + result);
    }

    public static String xor(String str1, String str2) {
        byte[] bytes1 = str1.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);

        byte[] xorBytes = new byte[Math.max(bytes1.length, bytes2.length)];

        for (int i = 0; i < xorBytes.length; i++) {
            byte b1 = i < bytes1.length ? bytes1[i] : 0;
            byte b2 = i < bytes2.length ? bytes2[i] : 0;

            xorBytes[i] = (byte) (b1 ^ b2);
        }

        return new String(xorBytes, StandardCharsets.UTF_8);
    }
}
