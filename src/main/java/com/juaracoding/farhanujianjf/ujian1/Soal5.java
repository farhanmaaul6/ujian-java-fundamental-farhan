package com.juaracoding.farhanujianjf.ujian1;

public class Soal5 {
    public static void main(String[] args) {

        int[] film = {50000, 60000, 70000, 80000, 90000};
        int[] nums = new int[film.length];

        int totalHargaTiket = 0;

        for (int i = 0; i < film.length; i++) {
            nums[i] = film[i];
            System.out.println("Harga tiket film " +(i+1) + ": "+ nums[i]);
        }
        for (int harga : film ) {
            totalHargaTiket += harga;
        }
        System.out.println("Total harga tiket: " + totalHargaTiket);
    }
}
