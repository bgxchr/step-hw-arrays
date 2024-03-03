import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu marimea array-ului: ");
        int j = scanner.nextInt();
        int[] x = new int[j];
        System.out.println("Introdu elementele acestuia:");
        for (int i = 0; i < j; i++) {
            x[i] = scanner.nextInt();
        }
        int sum = 0;
        int currentSum = 0;
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < j; i++) {
            if (i == 0 || x[i] != x[i - 1]) {
                if (i > 0) {
                    currentSum = 0;
                    currentLength = 0;
                }
                sum += x[i];
                currentSum = x[i];
                currentLength = 1;
                maxLength = 1;
            } else {
                currentSum += x[i];
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
        }
        System.out.println("Suma totala: " + sum);
    }
}