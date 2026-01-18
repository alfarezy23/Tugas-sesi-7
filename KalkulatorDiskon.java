public class KalkulatorDiskon {

    public static void main(String[] args) {

        int hargaPerItem = 20000;
        int jumlahBarang = 35;

        // Hitung jumlah kelipatan 10
        int kelipatan10 = jumlahBarang / 10;

        // Diskon 5% setiap kelipatan 10
        int diskonPersen = kelipatan10 * 5;

        // Diskon maksimal 50%
        if (diskonPersen > 50) {
            diskonPersen = 50;
        }

        int totalHarga = hargaPerItem * jumlahBarang;
        double diskon = totalHarga * diskonPersen / 100.0;
        double totalBayar = totalHarga - diskon;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.println("Harga per Item : " + hargaPerItem);
        System.out.println("Diskon : " + diskonPersen + "%");
        System.out.println("Total Bayar : " + totalBayar);
    }
}
