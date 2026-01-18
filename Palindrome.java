import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== CEK PALINDROME ===");
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // Membalik kata
        String hasilBalik = new StringBuilder(kata).reverse().toString();

        // Cek palindrome
        if (kata.equalsIgnoreCase(hasilBalik)) {
            System.out.println(kata + " adalah palindrome");
        } else {
            System.out.println(kata + " bukan palindrome");
        }
    }
}
