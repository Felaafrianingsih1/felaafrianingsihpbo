/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author A314
 */
public class perental {
    

    public String kode_rental, nama_perental;
    int jumlah_mobil;

    //contructor untuk set property class peminjaman
    public perental(String c, String a, int b){
        this.nama_perental = a;
        this.jumlah_mobil = b;
        this.kode_rental = c;
    }

    //Fungsi Ngedisplay Datanya
    public void display() {
        System.out.println("Perental    : " + this.nama_perental);
        System.out.println("Mobil yang dirental: " + this.jumlah_mobil);
        System.out.println("Kode perental : " + this.kode_rental);
    }

    
    public void setNama(String nama_perental) {
        this.nama_perental = nama_perental;
    }

    public void setJumlahMobil(int jumlah_mobil) {
        this.jumlah_mobil = jumlah_mobil;
    }

}
