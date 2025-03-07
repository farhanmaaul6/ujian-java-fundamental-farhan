package com.juaracoding.farhanujianjf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int weekday = 35000;
        int weekend = 45000;

        System.out.println("--------------------------------");
        System.out.println("Masukkan Hari (weekday/weekend): ");
        String hari = scanner.nextLine().toLowerCase();

        System.out.println("Masukkan Jumlah Tiket : ");
        int jumlahTiket = scanner.nextInt();

        int hargaPerTiket = (hari.equals("weekday")) ? weekday : weekend;

        int totalHarga = hargaPerTiket * jumlahTiket;

        if (jumlahTiket > 5) {
            double diskon = totalHarga * 0.1;
            totalHarga -= diskon;
            System.out.println("--------------------------------");
            System.out.println("Total harga (dengan diskon): " + totalHarga);
        } else {
            System.out.println("--------------------------------");
            System.out.println("Total harga (tanpa diskon): " + totalHarga);
        }
        scanner.close();
    }
}
