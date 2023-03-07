/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class mobil {
    String name, jenis;
    int noplat, harga;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    static ArrayList listmobil = new ArrayList<>();

    void tambah_buku() throws IOException {
        
        System.out.println("Nama : ");
        name = br.readLine();
        listmobil.add(name);
    }

    void lihat(){
        for(int i = 0; i < listmobil.size(); i ++){
            System.out.println("Nama : " + listmobil.get(i));
        }
    }
    
    int search() throws IOException{
        String search; int indeks = 0;
        System.out.println("Nama yang ingin di Edit :");
        search = br.readLine();
        for(int i = 0; i<listmobil.size(); i++){
            indeks = listmobil.indexOf(search);
        }

        return indeks;
       
    }
    void edit() throws IOException{
        
       
        int idx = search();
        System.out.print("Nama Baru : ");
        name = br.readLine();
        listmobil.set(idx, name);
    }
}
