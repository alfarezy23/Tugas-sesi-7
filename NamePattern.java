import java.util.Scanner;

public class NamePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Name: ");
        String name = sc.nextLine().toUpperCase();

        for (int i = 1; i <= name.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

