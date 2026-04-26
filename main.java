package com.mycompany.umkm;

public class main {
    public static void main(String[] args) {
  
        System.out.println("--- Produk ---");
        UMKM produk1 = new UMKM("Kaos Siring", 85000.0);
        produk1.tampilkanInfo();
        System.out.println("Total nilai aset : Rp " + produk1.hitungTotalAset());
        
        System.out.println(); // Spasi antar objek
        
        System.out.println("--- Produk 2 (Constructor 2) ---");
        UMKM produk2 = new UMKM("Kue Apam", 25000.0, 25); 
        produk2.tampilkanInfo();
        System.out.println("Total nilai aset : Rp " + produk2.hitungTotalAset());
    }
}