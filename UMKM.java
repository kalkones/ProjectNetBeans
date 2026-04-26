package com.mycompany.umkm;

public class UMKM {
    public String namaProduk;
    public double harga;
    public int stok;

    public UMKM(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor 2: Nama, Harga, dan Stok
    public UMKM(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk          : " + namaProduk);
        System.out.println("Harga                : " + harga);
        System.out.println("Sisa Stok            : " + stok + " Pcs");
    }

    public double hitungTotalAset() {
        return harga * stok;
    }
}