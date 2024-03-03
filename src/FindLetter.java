import java.util.Scanner;

public class FindLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = new char[10];
        System.out.println("Introdu 10 caractere:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.next().charAt(0);
        }
        System.out.println("Caracterele introduse sunt:");
        for (int i = 0; i < 10; i++) {
            if (isVowel(array[i])) {
                System.out.println("Caracterul " + (i+1) + " e vocala: " + array[i]);
            } else {
                System.out.println("Caracterul " + (i+1) + " e consoana: " + array[i]);
            }
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}