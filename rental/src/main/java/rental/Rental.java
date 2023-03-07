/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import rental.perental;

/**
 *
 * @author A314
 */
public class Rental {


    public static void main(String[] args) throws NumberFormatException, IOException {
        String name, code;
        int quantity;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<perental> dt = new ArrayList<>();

        while (true){
        System.out.print("""
                1. Tambah
                2. Lihat
                3. Edit
                4. Hapus
                5. Keluar
                """);
        System.out.print("Masukkan Pilihan Anda : ");
        int select = Integer.parseInt(br.readLine());

        switch(select){
            case 1:
                System.out.print("Kode perental : ");
                code = br.readLine(); 
                //Perlu unique code!!!
                System.out.print("Nama perental : ");
                name = br.readLine();
                System.out.print("Jumlah mobil Yang dirental : ");
                quantity = Integer.parseInt(br.readLine());

                
                perental dataperental = new perental(code, name, quantity);

                //pas praktikum lupa di add datanya:)
                dt.add(dataperental);
                break;
            case 2:
                for (int i = 0; i < dt.size(); i += 1) {
                    System.out.println("Data Rentalan ke-" + (i + 1));
                    
                    dt.get(i).display();
                }
                break;
            case 3:
                System.out.println("Update");
                System.out.println("Input Kode Perental : ");
                String nomor = br.readLine();

                for (perental perental : dt) { 
                    /* jika proprty kode dari class peminjaman sama dengan nomor
                     * yang disearch maka akan lakukan perubahan data tersebut
                      */
                    if (perental.kode_rental.equals(nomor)) {
                        System.out.print("Input Nama : ");
                        perental.setNama(br.readLine());
                        System.out.print("Input Jumlah Mobil : ");
                        perental.setJumlahMobil(Integer.parseInt(br.readLine()));
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("Delete");
                System.out.print("Input Kode Perental : ");
                String nomorrental = br.readLine();
                for (int i = 0; i < dt.size(); i++) {
                    if (dt.get(i).kode_rental.equals(nomorrental)) {
                        dt.remove(i);
                        break;
                    }
                }
            case 5 :
                System.exit(0);
                break;
            default:
                System.out.println("Menu tidak ada");
                break;
        }
    }
    }
}

//======REMINDER==========
//KETAHUAN COPAS WAKTU POSTEST == 0 YA ADIK ADIK
//KETAHUAN COPAS WAKTU POSTEST == 0 YA ADIK ADIK
//KETAHUAN COPAS WAKTU POSTEST == 0 YA ADIK ADIK
//KETAHUAN COPAS WAKTU POSTEST == 0 YA ADIK ADIK
//KETAHUAN COPAS WAKTU POSTEST == 0 YA ADIK ADIK
//KETAHUAN COPAS WAKTU POSTEST == 0 YA ADIK ADIK
//KETAHUAN COPAS WAKTU POSTEST == 0 YA ADIK ADIK
//======REMINDER==========