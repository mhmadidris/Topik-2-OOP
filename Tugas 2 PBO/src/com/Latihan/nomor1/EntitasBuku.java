package com.Latihan.nomor1;

import java.util.ArrayList;
import java.util.Scanner;

class entitasBuku {
    String isbn;
    String judulBuku;
    String pengarang;
    String tahunTerbit;
    String harga;
    float rating;

    // method set
    void setIsbn(){
        this.isbn = isbn;
    }
    void setJudulBuku(){
        this.judulBuku = judulBuku;
    }
    void setPengarang(){
        this.pengarang = pengarang;
    }
    void setTahunTerbit(){
        this.tahunTerbit = tahunTerbit;
    }
    void setHarga(){
        this.harga = harga;
    }
    void setRating(){
        this.rating = rating;
    }

    // method get
    String getIsbn(){
        return isbn;
    }
    String getJudulBuku(){
        return this.judulBuku;
    }
    String getPengarang(){
        return  this.pengarang;
    }
    String getTahunTerbit(){
        return  this.tahunTerbit;
    }
    String getHarga(){
        return  this.harga;
    }
    float getRating(){
        return  this.rating;
    }

    // class nambah
    static void menambah() {
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList<String>();
        System.out.print("Nomor ISBN : ");
        list.add(scan.next());

        System.out.println("Data yang anda ditambahkan");
        System.out.println(list.get(0));
/*        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;*/
    }

    // class menampilkan
    static void menampilkan() {
        System.out.println("tampilkan");
        menambah();
    }
}

class entitasMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean mengulang = true;
        while (mengulang) {
            System.out.println("1. Menambah");
            System.out.println("2. Mengubah");
            System.out.println("3. Menampilkan");
            System.out.println("4. Mencari");
            System.out.println("5. Menghapus");

            System.out.print("Apa yang ingin anda pilih : ");
            String input = scan.next();

            switch (input) {
                case "1":
                    System.out.println("Menambah");
                    entitasBuku.menambah();
                    break;
                case "2":
                    System.out.println("Mengubah");
                    break;
                case "3":
                    System.out.println("Menampilkan");
                    entitasBuku.menampilkan();
                    break;
                case "4":
                    System.out.println("Mencari");
                    break;
                case "5":
                    System.out.println("Menghapus");
                    break;
                default:
                    System.out.println("Maaf, Inputan tidak ditemukan");
            }

            System.out.println("Apakah anda ingin mengulang (y/n) ?");
            input = scan.next();
            mengulang = input.equalsIgnoreCase("y");
        }
    }
}