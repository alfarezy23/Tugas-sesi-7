import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
                System.out.println("=== Pengolahan Banyak Angka ===");
        int[] data = {10, 5, 13, 76, 25, 20, 3, 15};

        int terbesar = data[0];
        int terkecil = data[0];
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > terbesar) {
                terbesar = data[i];
            }
            if (data[i] < terkecil) {
                terkecil = data[i];
            }
            total += data[i];
        }

        double rataRata = (double) total / data.length;

        System.out.println("Angka Terbesar : " + terbesar);
        System.out.println("Angka Terkecil : " + terkecil);
        System.out.println("Total Nilai    : " + total);
        System.out.println("Rata-rata      : " + rataRata);
        System.out.println();
    }
}