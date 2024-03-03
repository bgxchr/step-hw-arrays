import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu marimea array-ului: ");
        int j = scanner.nextInt();
        int[] x = new int[j];
        System.out.println("Introdu elementele acestuia:");
        for (int i = 0; i < j; i++) {
            x[i] = scanner.nextInt();
        }
        System.out.println("Elementele array-ului in ordine inversa:");
        for (int i = j - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
    }
}
