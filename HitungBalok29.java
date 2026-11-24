package Jobsheet12;

import java.util.Scanner;

public class HitungBalok29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t;

        System.out.println("Balok ke-1");
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();
        System.out.println("Luas permukaan: "
                + 2 * (p * l + p * t + l * t));
        System.out.println("Volume: " + p * l * t);

        System.out.println("Balok ke-2");
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();
        System.out.println("Luas permukaan: "
                + 2 * (p * l + p * t + l * t));
        System.out.println("Volume: " + p * l * t);

        System.out.println("Balok ke-3");
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();
        System.out.println("Luas permukaan: "
                + 2 * (p * l + p * t + l * t));
        System.out.println("Volume: " + p * l * t);

        input.close();
    }
}
