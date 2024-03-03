import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu numarul elementelor din array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Introdu elementele array-ului:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Numarul maxim din array: " + max);
        System.out.println("Numarul minim din array: " + min);
    }
}
