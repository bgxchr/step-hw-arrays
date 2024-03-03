import java.util.Scanner;

public class ReverseArrayAndSum {
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
        for (int i = 0; i < j; i++) {
            sum += x[i];
        }
        System.out.println("Elementele array-ului in ordine inversa:");
        for (int i = j - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
        System.out.println("Suma totala: " + sum);
    }
}