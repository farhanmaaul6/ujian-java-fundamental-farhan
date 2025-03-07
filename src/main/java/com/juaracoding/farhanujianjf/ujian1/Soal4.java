package com.juaracoding.farhanujianjf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Data: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] film = inputDataFilm(scanner,length);
        tampilkanDataString(film);
    }

    public static String[] inputDataFilm(Scanner scanner, int length){
        String[] film = new String[length];

        System.out.println("Daftar Film Bioskop");

        for (int i = 0; i < length; i++) {
            System.out.println("Masukkan nama film " + (i+1) + ": ");
            film[i] = scanner.next();
        }

        return film;
    }


    public static void tampilkanDataString (String[] film){
        System.out.println("Film yang ingin ditonton: ");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i+1) + ". " + film[i]);
        }
    }

}
