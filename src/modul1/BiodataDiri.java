/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BiodataDiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String nama,tempat,alamat,jenis, motto;
       int tanggal, nis;
       
       System.out.println("====================================");
       System.out.println("          BIODATA DIRI ANDA         ");
       System.out.println("====================================");
       System.out.print("Nama Anda                          : "); nama = scan.next();
       System.out.print("NIS  Anda                          : "); nis = scan.nextInt();
       System.out.print("Tempat Lahir Anda                  : "); tempat = scan.next();
       System.out.print("Tanggal Lahir Anda [DD/MM/YYYY]    : "); tanggal = scan.nextInt();
       System.out.print("Masukkan Jenis Kelamin Anda        : "); jenis = scan.next();
       System.out.print("Masukkan Alamat di Malang          : "); alamat = scan.next();
       System.out.print("Tuliskan Motto Hidup Anda          : "); motto = scan.next();
       System.out.println();
   
    }
    
}
