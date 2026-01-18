import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            ArrayList<String> username = new ArrayList<>();
            ArrayList<String> password = new ArrayList<>();

                username.add("Farel Alfarezy");
                password.add("farlya09");

                username.add("Tusan");
                password.add("tania23");

                username.add("Musa");
                password.add("dina dini");

                username.add("Iskandar");   
                password.add("botak25");

                username.add("Ido");
                password.add("inaaa");

                username.add("Zarir");
                password.add("ijarijar");

        System.out.println("=== LOGIN SYSTEM ===");
        System.out.print("Masukkan Username: ");
        String inputUser = input.nextLine();

        System.out.print("Masukkan Password: ");
        String inputPass = input.nextLine();

        boolean loginBerhasil = false;

        for (int i = 0; i < username.size(); i++) {
            if (username.get(i).equals(inputUser) &&
                password.get(i).equals(inputPass)) {
                loginBerhasil = true;
                break;
            }
        }

        if (loginBerhasil) {
            System.out.println("username and password valid, you can login into the dashboard");
        } else {
            System.out.println("Wrong username and password");
        }
    }
}
