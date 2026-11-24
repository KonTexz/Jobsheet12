package Jobsheet12;

import java.util.Scanner;

public class Kafe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Apakah member? (y/n): ");
        boolean isMember = sc.nextLine().equalsIgnoreCase("y");
        System.out.print("Masukkan jam kunjung (0-23): ");
        int jam = sc.nextInt();
        Menu(nama, isMember, jam);

        int totalHarga = 0;
        while (true) {
            System.out.print("\nMasukkan nomor menu (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }
            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem, jam, isMember);
        }

        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int diskon = hitungDiskon(totalHarga, kodePromo, isMember);
        int totalBayar = totalHarga - diskon;

        System.out.println("Total harga : Rp" + totalHarga);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total bayar : Rp" + totalBayar);
        sc.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, int jamKunjung, boolean isMember) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    double hargaTotal = 0;
    if (isMember && jamKunjung >= 14 && jamKunjung <= 16) {
        hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem * 0.7;
    } else if (isMember) {
        hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem * 0.9;
    } else if (jamKunjung >= 14 && jamKunjung <= 16) {
        hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem * 0.8;
    } else {
        hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem * 1.0;
    }
    return (int) hargaTotal;
    }
    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
    int persen = 0;

    if (kodePromo.equals("DISKON50")) {
        persen = 50;
    } else if (kodePromo.equals("DISKON30")) {
        persen = 30;
    } else {
        System.out.println("Kode promo invalid");
    }

    if (isMember) {
        persen += 10;
    }

    return total * persen / 100;
}

}
